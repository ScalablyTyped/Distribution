package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOptions extends StObject {
  
  /** Options that determine how the object is displayed in the Cloud Search results page. */
  var displayOptions: js.UndefOr[ObjectDisplayOptions] = js.undefined
  
  /** The freshness options for an object. */
  var freshnessOptions: js.UndefOr[FreshnessOptions] = js.undefined
}
object ObjectOptions {
  
  inline def apply(): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptions]
  }
  
  extension [Self <: ObjectOptions](x: Self) {
    
    inline def setDisplayOptions(value: ObjectDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setFreshnessOptions(value: FreshnessOptions): Self = StObject.set(x, "freshnessOptions", value.asInstanceOf[js.Any])
    
    inline def setFreshnessOptionsUndefined: Self = StObject.set(x, "freshnessOptions", js.undefined)
  }
}
