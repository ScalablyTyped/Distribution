package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpenMod {
  
  @JSImport("ionic/lib/open", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openUrl(target: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrl")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def openUrl(target: String, param1: OpenUrlOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openUrl")(target.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait OpenUrlOptions extends StObject {
    
    var app: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var encode: js.UndefOr[Boolean] = js.undefined
  }
  object OpenUrlOptions {
    
    inline def apply(): OpenUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenUrlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenUrlOptions] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String | js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value*))
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    }
  }
}
