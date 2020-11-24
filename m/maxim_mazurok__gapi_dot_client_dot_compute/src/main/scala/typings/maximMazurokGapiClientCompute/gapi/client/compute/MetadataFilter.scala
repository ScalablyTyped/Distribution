package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataFilter extends js.Object {
  
  /**
    * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
    * This list must not be empty and can have at the most 64 entries.
    */
  var filterLabels: js.UndefOr[js.Array[MetadataFilterLabelMatch]] = js.native
  
  /**
    * Specifies how individual filterLabel matches within the list of filterLabels contribute towards the overall metadataFilter match.
    * Supported values are:
    * - MATCH_ANY: At least one of the filterLabels must have a matching label in the provided metadata.
    * - MATCH_ALL: All filterLabels must have matching labels in the provided metadata.
    */
  var filterMatchCriteria: js.UndefOr[String] = js.native
}
object MetadataFilter {
  
  @scala.inline
  def apply(): MetadataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataFilter]
  }
  
  @scala.inline
  implicit class MetadataFilterOps[Self <: MetadataFilter] (val x: Self) extends AnyVal {
    
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
    def setFilterLabelsVarargs(value: MetadataFilterLabelMatch*): Self = this.set("filterLabels", js.Array(value :_*))
    
    @scala.inline
    def setFilterLabels(value: js.Array[MetadataFilterLabelMatch]): Self = this.set("filterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterLabels: Self = this.set("filterLabels", js.undefined)
    
    @scala.inline
    def setFilterMatchCriteria(value: String): Self = this.set("filterMatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMatchCriteria: Self = this.set("filterMatchCriteria", js.undefined)
  }
}
