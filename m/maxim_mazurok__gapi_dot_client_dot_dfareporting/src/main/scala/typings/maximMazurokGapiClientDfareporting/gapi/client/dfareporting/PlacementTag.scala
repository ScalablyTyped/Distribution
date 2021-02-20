package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementTag extends StObject {
  
  /** Placement ID */
  var placementId: js.UndefOr[String] = js.native
  
  /** Tags generated for this placement. */
  var tagDatas: js.UndefOr[js.Array[TagData]] = js.native
}
object PlacementTag {
  
  @scala.inline
  def apply(): PlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTag]
  }
  
  @scala.inline
  implicit class PlacementTagMutableBuilder[Self <: PlacementTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    @scala.inline
    def setTagDatas(value: js.Array[TagData]): Self = StObject.set(x, "tagDatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagDatasUndefined: Self = StObject.set(x, "tagDatas", js.undefined)
    
    @scala.inline
    def setTagDatasVarargs(value: TagData*): Self = StObject.set(x, "tagDatas", js.Array(value :_*))
  }
}
