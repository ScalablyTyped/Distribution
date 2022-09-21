package typings.koaPassport

import typings.koaPassport.koaPassportBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.passport.mod.global.Express.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TID](
      fn: js.Function2[
          /* user */ User, 
          /* done */ js.Function2[/* err */ Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
    def apply[TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* user */ User, 
          /* done */ js.Function2[/* err */ Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallFn extends StObject {
    
    def apply[TID](
      fn: js.Function2[
          /* id */ TID, 
          /* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[User | `false` | Null], Unit], 
          Unit
        ]
    ): Unit = js.native
    def apply[TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* id */ TID, 
          /* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[User | `false` | Null], Unit], 
          Unit
        ]
    ): Unit = js.native
  }
  
  trait PauseStream extends StObject {
    
    var pauseStream: Boolean
  }
  object PauseStream {
    
    inline def apply(pauseStream: Boolean): PauseStream = {
      val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[PauseStream]
    }
    
    extension [Self <: PauseStream](x: Self) {
      
      inline def setPauseStream(value: Boolean): Self = StObject.set(x, "pauseStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserProperty extends StObject {
    
    var userProperty: String
  }
  object UserProperty {
    
    inline def apply(userProperty: String): UserProperty = {
      val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProperty]
    }
    
    extension [Self <: UserProperty](x: Self) {
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
    }
  }
}
