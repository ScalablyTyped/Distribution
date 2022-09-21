package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementTag extends StObject {
  
  /** Placement ID */
  var placementId: js.UndefOr[String] = js.undefined
  
  /** Tags generated for this placement. */
  var tagDatas: js.UndefOr[js.Array[TagData]] = js.undefined
}
object PlacementTag {
  
  inline def apply(): PlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTag]
  }
  
  extension [Self <: PlacementTag](x: Self) {
    
    inline def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    inline def setTagDatas(value: js.Array[TagData]): Self = StObject.set(x, "tagDatas", value.asInstanceOf[js.Any])
    
    inline def setTagDatasUndefined: Self = StObject.set(x, "tagDatas", js.undefined)
    
    inline def setTagDatasVarargs(value: TagData*): Self = StObject.set(x, "tagDatas", js.Array(value*))
  }
}
