package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayLocation extends StObject {
  
  /** The friendly name for this location, typically a nearby city name. For example, "Tokyo". */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Cross-service attributes for the location. For example {"cloud.googleapis.com/region": "us-east1"} */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayLocation & TopLevel[js.Any]
  ] = js.undefined
  
  /** The canonical id for this location. For example: `"us-east1"`. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /** Service-specific metadata. For example the available capacity at the given location. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayLocation & TopLevel[js.Any]
  ] = js.undefined
  
  /** Resource name for the location, which may vary between implementations. For example: `"projects/example-project/locations/us-east1"` */
  var name: js.UndefOr[String] = js.undefined
}
object ApigatewayLocation {
  
  @scala.inline
  def apply(): ApigatewayLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayLocation]
  }
  
  @scala.inline
  implicit class ApigatewayLocationMutableBuilder[Self <: ApigatewayLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayLocation & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.ApigatewayLocation & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
