package typings.iconGen

import typings.iconGen.anon.IcoSizes
import typings.iconGen.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMod {
  
  @JSImport("icon-gen/dist/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generate an icon from SVG or PNG file.
    * @param src Path of the SVG file.
    * @param dest Path of the output files directory.
    * @param options Options.
    * @return Path of generated files.
    */
  inline def default(src: String, dest: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def default(src: String, dest: String, options: ICONOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait ICONOptions extends StObject {
    
    /** Output setting of Favicon file (PNG and ICO). */
    var favicon: js.UndefOr[IcoSizes] = js.undefined
    
    /** Output setting of ICNS file. */
    var icns: js.UndefOr[Name] = js.undefined
    
    /** Output setting of ICO file. */
    var ico: js.UndefOr[Name] = js.undefined
    
    /** `true` to display the processing status of the tool to `stdout`. */
    var report: Boolean
  }
  object ICONOptions {
    
    inline def apply(report: Boolean): ICONOptions = {
      val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICONOptions]
    }
    
    extension [Self <: ICONOptions](x: Self) {
      
      inline def setFavicon(value: IcoSizes): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setIcns(value: Name): Self = StObject.set(x, "icns", value.asInstanceOf[js.Any])
      
      inline def setIcnsUndefined: Self = StObject.set(x, "icns", js.undefined)
      
      inline def setIco(value: Name): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
      
      inline def setIcoUndefined: Self = StObject.set(x, "ico", js.undefined)
      
      inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    }
  }
}
