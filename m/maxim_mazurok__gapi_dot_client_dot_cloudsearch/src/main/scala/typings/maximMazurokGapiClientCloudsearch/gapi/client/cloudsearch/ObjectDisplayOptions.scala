package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDisplayOptions extends StObject {
  
  /**
    * Defines the properties that are displayed in the metalines of the search results. The property values are displayed in the order given here. If a property holds multiple values, all
    * of the values are displayed before the next properties. For this reason, it is a good practice to specify singular properties before repeated properties in this list. All of the
    * properties must set is_returnable to true. The maximum number of metalines is 3.
    */
  var metalines: js.UndefOr[js.Array[Metaline]] = js.undefined
  
  /**
    * The user friendly label to display in the search result to indicate the type of the item. This is OPTIONAL; if not provided, an object label isn't displayed on the context line of
    * the search results. The maximum length is 64 characters.
    */
  var objectDisplayLabel: js.UndefOr[String] = js.undefined
}
object ObjectDisplayOptions {
  
  inline def apply(): ObjectDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDisplayOptions]
  }
  
  extension [Self <: ObjectDisplayOptions](x: Self) {
    
    inline def setMetalines(value: js.Array[Metaline]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    inline def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    inline def setMetalinesVarargs(value: Metaline*): Self = StObject.set(x, "metalines", js.Array(value*))
    
    inline def setObjectDisplayLabel(value: String): Self = StObject.set(x, "objectDisplayLabel", value.asInstanceOf[js.Any])
    
    inline def setObjectDisplayLabelUndefined: Self = StObject.set(x, "objectDisplayLabel", js.undefined)
  }
}
