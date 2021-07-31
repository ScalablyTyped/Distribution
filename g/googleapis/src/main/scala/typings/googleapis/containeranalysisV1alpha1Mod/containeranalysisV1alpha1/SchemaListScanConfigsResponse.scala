package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of scan configs for the project.
  */
trait SchemaListScanConfigsResponse extends StObject {
  
  /**
    * A page token to pass in order to get more scan configs.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The set of scan configs.
    */
  var scanConfigs: js.UndefOr[js.Array[SchemaScanConfig]] = js.undefined
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
