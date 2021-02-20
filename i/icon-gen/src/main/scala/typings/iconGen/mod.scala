package typings.iconGen

import typings.iconGen.anon.Ico
import typings.iconGen.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("icon-gen", JSImport.Namespace)
  @js.native
  def apply(src: String, dest: String): js.Promise[js.Array[String]] = js.native
  @JSImport("icon-gen", JSImport.Namespace)
  @js.native
  def apply(src: String, dest: String, options: Options): js.Promise[js.Array[String]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var favicon: js.UndefOr[Ico | js.Object] = js.native
    
    var icns: js.UndefOr[Name | js.Object] = js.native
    
    var ico: js.UndefOr[Name | js.Object] = js.native
    
    var report: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFavicon(value: Ico | js.Object): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setIcns(value: Name | js.Object): Self = StObject.set(x, "icns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcnsUndefined: Self = StObject.set(x, "icns", js.undefined)
      
      @scala.inline
      def setIco(value: Name | js.Object): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcoUndefined: Self = StObject.set(x, "ico", js.undefined)
      
      @scala.inline
      def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    }
  }
}
