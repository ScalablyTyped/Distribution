package typings.iconGen

import typings.iconGen.distLibLoggerMod.default
import typings.iconGen.distLibPngMod.ImageInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFaviconMod {
  
  @JSImport("icon-gen/dist/lib/favicon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generate a FAVICON image files (ICO and PNG) from the PNG images.
    * @param images File information for the PNG files generation.
    * @param dir Output destination the path of directory.
    * @param logger Logger.
    * @param options Options.
    * @return Path of the generated files.
    */
  inline def default(
    images: js.Array[ImageInfo],
    dir: String,
    logger: typings.iconGen.distLibLoggerMod.default,
    options: FavOptions
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(images.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("icon-gen/dist/lib/favicon", "REQUIRED_ICO_SIZES")
  @js.native
  val REQUIRED_ICO_SIZES: js.Array[Double] = js.native
  
  @JSImport("icon-gen/dist/lib/favicon", "REQUIRED_IMAGE_SIZES")
  @js.native
  val REQUIRED_IMAGE_SIZES: js.Array[Double] = js.native
  
  @JSImport("icon-gen/dist/lib/favicon", "REQUIRED_PNG_SIZES")
  @js.native
  val REQUIRED_PNG_SIZES: js.Array[Double] = js.native
  
  inline def generatePNG(images: js.Array[ImageInfo], dir: String, prefix: String, sizes: js.Array[Double], logger: default): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePNG")(images.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait FavOptions extends StObject {
    
    /** Structure of an image sizes for ICO. */
    var icoSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Prefix of an output PNG files. Start with the alphabet, can use `-` and `_`. This option is for PNG. The name of the ICO file is always `favicon.ico`. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Size structure of PNG files to output. */
    var pngSizes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object FavOptions {
    
    inline def apply(): FavOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavOptions]
    }
    
    extension [Self <: FavOptions](x: Self) {
      
      inline def setIcoSizes(value: js.Array[Double]): Self = StObject.set(x, "icoSizes", value.asInstanceOf[js.Any])
      
      inline def setIcoSizesUndefined: Self = StObject.set(x, "icoSizes", js.undefined)
      
      inline def setIcoSizesVarargs(value: Double*): Self = StObject.set(x, "icoSizes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPngSizes(value: js.Array[Double]): Self = StObject.set(x, "pngSizes", value.asInstanceOf[js.Any])
      
      inline def setPngSizesUndefined: Self = StObject.set(x, "pngSizes", js.undefined)
      
      inline def setPngSizesVarargs(value: Double*): Self = StObject.set(x, "pngSizes", js.Array(value*))
    }
  }
}
