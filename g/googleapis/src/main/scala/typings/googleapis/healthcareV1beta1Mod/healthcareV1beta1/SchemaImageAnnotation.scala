package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageAnnotation extends StObject {
  
  /**
    * The list of polygons outlining the sensitive regions in the image.
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaBoundingPoly]] = js.undefined
  
  /**
    * 0-based index of the image frame. For example, an image frame in a DICOM instance.
    */
  var frameIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaImageAnnotation {
  
  inline def apply(): SchemaImageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageAnnotation]
  }
  
  extension [Self <: SchemaImageAnnotation](x: Self) {
    
    inline def setBoundingPolys(value: js.Array[SchemaBoundingPoly]): Self = StObject.set(x, "boundingPolys", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolysUndefined: Self = StObject.set(x, "boundingPolys", js.undefined)
    
    inline def setBoundingPolysVarargs(value: SchemaBoundingPoly*): Self = StObject.set(x, "boundingPolys", js.Array(value*))
    
    inline def setFrameIndex(value: Double): Self = StObject.set(x, "frameIndex", value.asInstanceOf[js.Any])
    
    inline def setFrameIndexNull: Self = StObject.set(x, "frameIndex", null)
    
    inline def setFrameIndexUndefined: Self = StObject.set(x, "frameIndex", js.undefined)
  }
}
