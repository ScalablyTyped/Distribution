package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMatrixEntityMod {
  
  @JSImport("matrix-bot-sdk/lib/helpers/MatrixEntity", "MatrixEntity")
  @js.native
  open class MatrixEntity protected () extends StObject {
    /**
      * Creates a new Matrix entity
      * @param {string} fullId The full ID of the entity
      */
    def this(fullId: String) = this()
    
    /**
      * The domain for the entity
      */
    def domain: String = js.native
    
    /* private */ var entityDomain: Any = js.native
    
    /* private */ var entityLocalpart: Any = js.native
    
    /* private */ var fullId: Any = js.native
    
    /**
      * The localpart for the entity
      */
    def localpart: String = js.native
  }
  
  @JSImport("matrix-bot-sdk/lib/helpers/MatrixEntity", "RoomAlias")
  @js.native
  open class RoomAlias protected () extends MatrixEntity {
    def this(alias: String) = this()
  }
  
  @JSImport("matrix-bot-sdk/lib/helpers/MatrixEntity", "UserID")
  @js.native
  open class UserID protected () extends MatrixEntity {
    def this(userId: String) = this()
  }
}
