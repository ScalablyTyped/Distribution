package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1SequentialSegment extends StObject {
  
  /**
    * End position (exclusive).
    */
  var end: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Start position (inclusive).
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1SequentialSegment {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1SequentialSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1SequentialSegment]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1SequentialSegment](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
