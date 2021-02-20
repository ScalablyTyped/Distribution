package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.encryptionMod.ClientEncryptionSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnsureClientSyncingCallback extends StObject {
  
  def ensureClientSyncingCallback(): js.Promise[Unit] = js.native
  
  def sessionCreatedCallback(session: ClientEncryptionSession): js.Promise[Unit] = js.native
  
  var sessionPromise: js.Promise[ClientEncryptionSession | Null] = js.native
}
object EnsureClientSyncingCallback {
  
  @scala.inline
  def apply(
    ensureClientSyncingCallback: () => js.Promise[Unit],
    sessionCreatedCallback: ClientEncryptionSession => js.Promise[Unit],
    sessionPromise: js.Promise[ClientEncryptionSession | Null]
  ): EnsureClientSyncingCallback = {
    val __obj = js.Dynamic.literal(ensureClientSyncingCallback = js.Any.fromFunction0(ensureClientSyncingCallback), sessionCreatedCallback = js.Any.fromFunction1(sessionCreatedCallback), sessionPromise = sessionPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureClientSyncingCallback]
  }
  
  @scala.inline
  implicit class EnsureClientSyncingCallbackMutableBuilder[Self <: EnsureClientSyncingCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnsureClientSyncingCallback(value: () => js.Promise[Unit]): Self = StObject.set(x, "ensureClientSyncingCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSessionCreatedCallback(value: ClientEncryptionSession => js.Promise[Unit]): Self = StObject.set(x, "sessionCreatedCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSessionPromise(value: js.Promise[ClientEncryptionSession | Null]): Self = StObject.set(x, "sessionPromise", value.asInstanceOf[js.Any])
  }
}
