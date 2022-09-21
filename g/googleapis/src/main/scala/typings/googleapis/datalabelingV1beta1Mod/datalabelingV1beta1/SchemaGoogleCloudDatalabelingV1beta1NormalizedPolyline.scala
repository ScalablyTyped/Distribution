package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline extends StObject {
  
  /**
    * The normalized polyline vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1NormalizedVertex]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1NormalizedPolyline](x: Self) {
    
    inline def setNormalizedVertices(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: SchemaGoogleCloudDatalabelingV1beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
  }
}
