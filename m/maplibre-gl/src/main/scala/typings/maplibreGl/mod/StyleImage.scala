package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleImage
  extends StObject
     with StyleImageData
     with StyleImageMetadata
object StyleImage {
  
  inline def apply(data: RGBAImage, pixelRatio: Double, sdf: Boolean, version: Double): StyleImage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], sdf = sdf.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleImage]
  }
}
