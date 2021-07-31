package typings.iconGen

import typings.iconGen.anon.Ico
import typings.iconGen.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(src: String, dest: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(src: String, dest: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("icon-gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var favicon: js.UndefOr[Ico | js.Object] = js.undefined
    
    var icns: js.UndefOr[Name | js.Object] = js.undefined
    
    var ico: js.UndefOr[Name | js.Object] = js.undefined
    
    var report: js.UndefOr[Boolean] = js.undefined
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
