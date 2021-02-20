package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpenMod {
  
  @JSImport("ionic/lib/open", "openUrl")
  @js.native
  def openUrl(target: String): js.Promise[Unit] = js.native
  @JSImport("ionic/lib/open", "openUrl")
  @js.native
  def openUrl(target: String, hasAppEncode: OpenUrlOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait OpenUrlOptions extends StObject {
    
    var app: js.UndefOr[String | js.Array[String]] = js.native
    
    var encode: js.UndefOr[Boolean] = js.native
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
