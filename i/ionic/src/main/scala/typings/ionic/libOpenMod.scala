package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpenMod {
  
  @JSImport("ionic/lib/open", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def openUrl(target: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrl")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openUrl(target: String, hasAppUrl: OpenUrlOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openUrl")(target.asInstanceOf[js.Any], hasAppUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait OpenUrlOptions extends StObject {
    
    var app: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var encode: js.UndefOr[Boolean] = js.undefined
  }
  object OpenUrlOptions {
    
    @scala.inline
    def apply(): OpenUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenUrlOptions]
    }
    
    @scala.inline
    implicit class OpenUrlOptionsMutableBuilder[Self <: OpenUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String | js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value :_*))
      
      @scala.inline
      def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    }
  }
}
