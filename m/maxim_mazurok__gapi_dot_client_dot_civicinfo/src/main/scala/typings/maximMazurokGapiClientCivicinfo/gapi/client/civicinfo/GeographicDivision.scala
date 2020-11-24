package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeographicDivision extends js.Object {
  
  /**
    * Any other valid OCD IDs that refer to the same division.\n\nBecause OCD IDs are meant to be human-readable and at least somewhat predictable, there are occasionally several
    * identifiers for a single division. These identifiers are defined to be equivalent to one another, and one is always indicated as the primary identifier. The primary identifier will
    * be returned in ocd_id above, and any other equivalent valid identifiers will be returned in this list.\n\nFor example, if this division's OCD ID is
    * ocd-division/country:us/district:dc, this will contain ocd-division/country:us/state:dc.
    */
  var alsoKnownAs: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the division. */
  var name: js.UndefOr[String] = js.native
  
  /** List of indices in the offices array, one for each office elected from this division. Will only be present if includeOffices was true (or absent) in the request. */
  var officeIndices: js.UndefOr[js.Array[Double]] = js.native
}
object GeographicDivision {
  
  @scala.inline
  def apply(): GeographicDivision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeographicDivision]
  }
  
  @scala.inline
  implicit class GeographicDivisionOps[Self <: GeographicDivision] (val x: Self) extends AnyVal {
    
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
    def setAlsoKnownAsVarargs(value: String*): Self = this.set("alsoKnownAs", js.Array(value :_*))
    
    @scala.inline
    def setAlsoKnownAs(value: js.Array[String]): Self = this.set("alsoKnownAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlsoKnownAs: Self = this.set("alsoKnownAs", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOfficeIndicesVarargs(value: Double*): Self = this.set("officeIndices", js.Array(value :_*))
    
    @scala.inline
    def setOfficeIndices(value: js.Array[Double]): Self = this.set("officeIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficeIndices: Self = this.set("officeIndices", js.undefined)
  }
}
