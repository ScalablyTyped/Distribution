package typings.iconGen

import typings.iconGen.distLibPngMod.ImageInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIcoMod {
  
  @JSImport("icon-gen/dist/lib/ico", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generate the ICO file from a PNG images.
    * @param images File information.
    * @param dir Output destination the path of directory.
    * @param logger Logger.
    * @param options Options.
    * @return Path of the generated ICO file.
    */
  inline def default(
    images: js.Array[ImageInfo],
    dir: String,
    logger: typings.iconGen.distLibLoggerMod.default,
    options: ICOOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(images.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("icon-gen/dist/lib/ico", "REQUIRED_IMAGE_SIZES")
  @js.native
  val REQUIRED_IMAGE_SIZES: js.Array[Double] = js.native
  
  trait ICOOptions extends StObject {
    
    /** Name of an output file. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Structure of an image sizes. */
    var sizes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ICOOptions {
    
    inline def apply(): ICOOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICOOptions]
    }
    
    extension [Self <: ICOOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value*))
    }
  }
}
