package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepresentativeInfoResponse extends js.Object {
  
  /** A map of political geographic divisions that contain the requested address, keyed by the unique Open Civic Data identifier for this division. */
  var divisions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision}
    */ typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.RepresentativeInfoResponse with TopLevel[js.Any]
  ] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#representativeInfoResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.native
  
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.native
  
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.native
}
object RepresentativeInfoResponse {
  
  @scala.inline
  def apply(): RepresentativeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepresentativeInfoResponse]
  }
  
  @scala.inline
  implicit class RepresentativeInfoResponseOps[Self <: RepresentativeInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setDivisions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision}
      */ typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.RepresentativeInfoResponse with TopLevel[js.Any]
    ): Self = this.set("divisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisions: Self = this.set("divisions", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNormalizedInput(value: SimpleAddressType): Self = this.set("normalizedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedInput: Self = this.set("normalizedInput", js.undefined)
    
    @scala.inline
    def setOfficesVarargs(value: Office*): Self = this.set("offices", js.Array(value :_*))
    
    @scala.inline
    def setOffices(value: js.Array[Office]): Self = this.set("offices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffices: Self = this.set("offices", js.undefined)
    
    @scala.inline
    def setOfficialsVarargs(value: Official*): Self = this.set("officials", js.Array(value :_*))
    
    @scala.inline
    def setOfficials(value: js.Array[Official]): Self = this.set("officials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficials: Self = this.set("officials", js.undefined)
  }
}
