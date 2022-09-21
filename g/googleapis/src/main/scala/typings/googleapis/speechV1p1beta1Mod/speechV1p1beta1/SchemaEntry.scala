package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntry extends StObject {
  
  /**
    * Whether the search is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * What to replace with. Max length is 100 characters.
    */
  var replace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * What to replace. Max length is 100 characters.
    */
  var search: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntry {
  
  inline def apply(): SchemaEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntry]
  }
  
  extension [Self <: SchemaEntry](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceNull: Self = StObject.set(x, "replace", null)
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchNull: Self = StObject.set(x, "search", null)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
