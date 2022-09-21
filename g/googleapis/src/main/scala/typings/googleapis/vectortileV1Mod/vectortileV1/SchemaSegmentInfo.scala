package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegmentInfo extends StObject {
  
  /**
    * Metadata for features with the ROAD FeatureType.
    */
  var roadInfo: js.UndefOr[SchemaRoadInfo] = js.undefined
}
object SchemaSegmentInfo {
  
  inline def apply(): SchemaSegmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentInfo]
  }
  
  extension [Self <: SchemaSegmentInfo](x: Self) {
    
    inline def setRoadInfo(value: SchemaRoadInfo): Self = StObject.set(x, "roadInfo", value.asInstanceOf[js.Any])
    
    inline def setRoadInfoUndefined: Self = StObject.set(x, "roadInfo", js.undefined)
  }
}
