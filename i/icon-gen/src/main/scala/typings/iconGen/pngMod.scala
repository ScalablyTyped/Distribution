package typings.iconGen

import typings.iconGen.loggerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pngMod {
  
  @JSImport("icon-gen/dist/lib/png", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(src: String, dir: String, sizes: js.Array[Double], logger: typings.iconGen.loggerMod.default): js.Promise[js.Array[ImageInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ImageInfo]]]
  
  inline def filterImagesBySizes(images: js.Array[ImageInfo], sizes: js.Array[Double]): js.Array[ImageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterImagesBySizes")(images.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageInfo]]
  
  inline def generatePNG(src: String, dir: String, sizes: js.Array[Double], logger: default): js.Promise[js.Array[ImageInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePNG")(src.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ImageInfo]]]
  
  trait ImageInfo extends StObject {
    
    /** Path of an image file. */
    var filePath: String
    
    /** Image size (width/height). */
    var size: Double
  }
  object ImageInfo {
    
    inline def apply(filePath: String, size: Double): ImageInfo = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageInfo]
    }
    
    extension [Self <: ImageInfo](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
