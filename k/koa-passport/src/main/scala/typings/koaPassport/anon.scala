package typings.koaPassport

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TUser, TID](
      fn: js.Function2[
          /* user */ TUser, 
          /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
    def apply[TUser, TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* user */ TUser, 
          /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallFn extends StObject {
    
    def apply[TUser, TID](
      fn: js.Function2[
          /* id */ TID, 
          /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
          Unit
        ]
    ): Unit = js.native
    def apply[TUser, TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* id */ TID, 
          /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait PauseStream extends StObject {
    
    var pauseStream: Boolean = js.native
  }
  object PauseStream {
    
    @scala.inline
    def apply(pauseStream: Boolean): PauseStream = {
      val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[PauseStream]
    }
    
    @scala.inline
    implicit class PauseStreamMutableBuilder[Self <: PauseStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPauseStream(value: Boolean): Self = StObject.set(x, "pauseStream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserProperty extends StObject {
    
    var userProperty: String = js.native
  }
  object UserProperty {
    
    @scala.inline
    def apply(userProperty: String): UserProperty = {
      val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProperty]
    }
    
    @scala.inline
    implicit class UserPropertyMutableBuilder[Self <: UserProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
    }
  }
}
