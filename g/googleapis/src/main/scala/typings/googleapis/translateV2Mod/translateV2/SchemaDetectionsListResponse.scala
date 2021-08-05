package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectionsListResponse extends StObject {
  
  /**
    * A detections contains detection results of several text
    */
  var detections: js.UndefOr[js.Array[SchemaDetectionsResource]] = js.undefined
}
object SchemaDetectionsListResponse {
  
  inline def apply(): SchemaDetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectionsListResponse]
  }
  
  extension [Self <: SchemaDetectionsListResponse](x: Self) {
    
    inline def setDetections(value: js.Array[SchemaDetectionsResource]): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    inline def setDetectionsVarargs(value: SchemaDetectionsResource*): Self = StObject.set(x, "detections", js.Array(value :_*))
  }
}
