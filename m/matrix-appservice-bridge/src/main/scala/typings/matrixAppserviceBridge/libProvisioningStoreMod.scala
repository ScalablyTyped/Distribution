package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProvisioningStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning/store", "MemoryProvisioningStore")
  @js.native
  open class MemoryProvisioningStore ()
    extends StObject
       with ProvisioningStore {
    
    /* CompleteClass */
    override def createSession(session: ProvisionSession): js.Promise[Unit] | Unit = js.native
    
    /* CompleteClass */
    override def deleteAllSessions(userId: String): js.Promise[Unit] | Unit = js.native
    
    /* CompleteClass */
    override def deleteSession(token: String): js.Promise[Unit] | Unit = js.native
    
    /* CompleteClass */
    override def getSessionForToken(token: String): (js.Promise[ProvisionSession | Null]) | ProvisionSession | Null = js.native
    
    /* private */ val sessions: Any = js.native
  }
  
  trait ProvisionSession extends StObject {
    
    var expiresTs: Double
    
    var token: String
    
    var userId: String
  }
  object ProvisionSession {
    
    inline def apply(expiresTs: Double, token: String, userId: String): ProvisionSession = {
      val __obj = js.Dynamic.literal(expiresTs = expiresTs.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvisionSession] (val x: Self) extends AnyVal {
      
      inline def setExpiresTs(value: Double): Self = StObject.set(x, "expiresTs", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvisioningStore extends StObject {
    
    def createSession(session: ProvisionSession): js.Promise[Unit] | Unit
    
    def deleteAllSessions(userId: String): js.Promise[Unit] | Unit
    
    def deleteSession(token: String): js.Promise[Unit] | Unit
    
    def getSessionForToken(token: String): (js.Promise[ProvisionSession | Null]) | ProvisionSession | Null
  }
  object ProvisioningStore {
    
    inline def apply(
      createSession: ProvisionSession => js.Promise[Unit] | Unit,
      deleteAllSessions: String => js.Promise[Unit] | Unit,
      deleteSession: String => js.Promise[Unit] | Unit,
      getSessionForToken: String => (js.Promise[ProvisionSession | Null]) | ProvisionSession | Null
    ): ProvisioningStore = {
      val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction1(createSession), deleteAllSessions = js.Any.fromFunction1(deleteAllSessions), deleteSession = js.Any.fromFunction1(deleteSession), getSessionForToken = js.Any.fromFunction1(getSessionForToken))
      __obj.asInstanceOf[ProvisioningStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvisioningStore] (val x: Self) extends AnyVal {
      
      inline def setCreateSession(value: ProvisionSession => js.Promise[Unit] | Unit): Self = StObject.set(x, "createSession", js.Any.fromFunction1(value))
      
      inline def setDeleteAllSessions(value: String => js.Promise[Unit] | Unit): Self = StObject.set(x, "deleteAllSessions", js.Any.fromFunction1(value))
      
      inline def setDeleteSession(value: String => js.Promise[Unit] | Unit): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
      
      inline def setGetSessionForToken(value: String => (js.Promise[ProvisionSession | Null]) | ProvisionSession | Null): Self = StObject.set(x, "getSessionForToken", js.Any.fromFunction1(value))
    }
  }
}
