package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepresentativeInfoData extends StObject {
  
  /** A map of political geographic divisions that contain the requested address, keyed by the unique Open Civic Data identifier for this division. */
  var divisions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision}
    */ typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.RepresentativeInfoData & TopLevel[js.Any]
  ] = js.undefined
  
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.undefined
  
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.undefined
}
object RepresentativeInfoData {
  
  @scala.inline
  def apply(): RepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepresentativeInfoData]
  }
  
  @scala.inline
  implicit class RepresentativeInfoDataMutableBuilder[Self <: RepresentativeInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDivisions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.civicinfo.gapi.client.civicinfo.GeographicDivision}
      */ typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.RepresentativeInfoData & TopLevel[js.Any]
    ): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
    
    @scala.inline
    def setOffices(value: js.Array[Office]): Self = StObject.set(x, "offices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficesUndefined: Self = StObject.set(x, "offices", js.undefined)
    
    @scala.inline
    def setOfficesVarargs(value: Office*): Self = StObject.set(x, "offices", js.Array(value :_*))
    
    @scala.inline
    def setOfficials(value: js.Array[Official]): Self = StObject.set(x, "officials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialsUndefined: Self = StObject.set(x, "officials", js.undefined)
    
    @scala.inline
    def setOfficialsVarargs(value: Official*): Self = StObject.set(x, "officials", js.Array(value :_*))
  }
}
