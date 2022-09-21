package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectDisplayOptions extends StObject {
  
  /**
    * Defines the properties that are displayed in the metalines of the search results. The property values are displayed in the order given here. If a property holds multiple values, all of the values are displayed before the next properties. For this reason, it is a good practice to specify singular properties before repeated properties in this list. All of the properties must set is_returnable to true. The maximum number of metalines is 3.
    */
  var metalines: js.UndefOr[js.Array[SchemaMetaline]] = js.undefined
  
  /**
    * The user friendly label to display in the search result to indicate the type of the item. This is OPTIONAL; if not provided, an object label isn't displayed on the context line of the search results. The maximum length is 64 characters.
    */
  var objectDisplayLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaObjectDisplayOptions {
  
  inline def apply(): SchemaObjectDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectDisplayOptions]
  }
  
  extension [Self <: SchemaObjectDisplayOptions](x: Self) {
    
    inline def setMetalines(value: js.Array[SchemaMetaline]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    inline def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    inline def setMetalinesVarargs(value: SchemaMetaline*): Self = StObject.set(x, "metalines", js.Array(value*))
    
    inline def setObjectDisplayLabel(value: String): Self = StObject.set(x, "objectDisplayLabel", value.asInstanceOf[js.Any])
    
    inline def setObjectDisplayLabelNull: Self = StObject.set(x, "objectDisplayLabel", null)
    
    inline def setObjectDisplayLabelUndefined: Self = StObject.set(x, "objectDisplayLabel", js.undefined)
  }
}
