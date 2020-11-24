package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFilter extends js.Object {
  
  /** The dimension filter contained within this EventFilter. */
  var dimensionFilter: js.UndefOr[PathReportDimensionValue] = js.native
  
  /** The kind of resource this is, in this case dfareporting#eventFilter. */
  var kind: js.UndefOr[String] = js.native
}
object EventFilter {
  
  @scala.inline
  def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  @scala.inline
  implicit class EventFilterOps[Self <: EventFilter] (val x: Self) extends AnyVal {
    
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
    def setDimensionFilter(value: PathReportDimensionValue): Self = this.set("dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilter: Self = this.set("dimensionFilter", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
