package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionGeoTargetArea extends js.Object {
  
  /** Required. A non-empty list of [location IDs](https://developers.google.com/adwords/api/docs/appendix/geotargeting). They must all be of the same location type (e.g., state). */
  var geotargetCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object RegionGeoTargetArea {
  
  @scala.inline
  def apply(): RegionGeoTargetArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionGeoTargetArea]
  }
  
  @scala.inline
  implicit class RegionGeoTargetAreaOps[Self <: RegionGeoTargetArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeotargetCriteriaIdsVarargs(value: String*): Self = this.set("geotargetCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setGeotargetCriteriaIds(value: js.Array[String]): Self = this.set("geotargetCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeotargetCriteriaIds: Self = this.set("geotargetCriteriaIds", js.undefined)
  }
}
