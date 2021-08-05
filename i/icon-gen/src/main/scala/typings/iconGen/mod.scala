package typings.iconGen

import typings.iconGen.anon.Ico
import typings.iconGen.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String, dest: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(src: String, dest: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFavicon(value: Ico | js.Object): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setIcns(value: Name | js.Object): Self = StObject.set(x, "icns", value.asInstanceOf[js.Any])
      
      inline def setIcnsUndefined: Self = StObject.set(x, "icns", js.undefined)
      
      inline def setIco(value: Name | js.Object): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
      
      inline def setIcoUndefined: Self = StObject.set(x, "ico", js.undefined)
      
      inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    }
  }
}
