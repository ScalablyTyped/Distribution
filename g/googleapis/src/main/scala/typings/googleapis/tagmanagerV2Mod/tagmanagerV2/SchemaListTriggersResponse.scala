package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List triggers response.
  */
trait SchemaListTriggersResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * All GTM Triggers of a GTM Container.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.undefined
}
object SchemaListTriggersResponse {
  
  inline def apply(): SchemaListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTriggersResponse]
  }
  
  extension [Self <: SchemaListTriggersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTrigger(value: js.Array[SchemaTrigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: SchemaTrigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
  }
}
