package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for ListInstanceConfigs.
  */
trait SchemaListInstanceConfigsResponse extends StObject {
  
  /**
    * The list of requested instance configurations.
    */
  var instanceConfigs: js.UndefOr[js.Array[SchemaInstanceConfig]] = js.undefined
  
  /**
    * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to
    * fetch more of the matching instance configurations.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListInstanceConfigsResponse {
  
  inline def apply(): SchemaListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstanceConfigsResponse]
  }
  
  extension [Self <: SchemaListInstanceConfigsResponse](x: Self) {
    
    inline def setInstanceConfigs(value: js.Array[SchemaInstanceConfig]): Self = StObject.set(x, "instanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigsUndefined: Self = StObject.set(x, "instanceConfigs", js.undefined)
    
    inline def setInstanceConfigsVarargs(value: SchemaInstanceConfig*): Self = StObject.set(x, "instanceConfigs", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
