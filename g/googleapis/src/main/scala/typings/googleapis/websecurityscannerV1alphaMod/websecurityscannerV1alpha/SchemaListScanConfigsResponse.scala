package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListScanConfigs` method.
  */
@js.native
trait SchemaListScanConfigsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of ScanConfigs returned.
    */
  var scanConfigs: js.UndefOr[js.Array[SchemaScanConfig]] = js.native
}
object SchemaListScanConfigsResponse {
  
  @scala.inline
  def apply(): SchemaListScanConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanConfigsResponse]
  }
  
  @scala.inline
  implicit class SchemaListScanConfigsResponseMutableBuilder[Self <: SchemaListScanConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setScanConfigs(value: js.Array[SchemaScanConfig]): Self = StObject.set(x, "scanConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanConfigsUndefined: Self = StObject.set(x, "scanConfigs", js.undefined)
    
    @scala.inline
    def setScanConfigsVarargs(value: SchemaScanConfig*): Self = StObject.set(x, "scanConfigs", js.Array(value :_*))
  }
}
