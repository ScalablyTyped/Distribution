package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteHeaderModifier extends StObject {
  
  /**
    * Add the headers with given map where key is the name of the header, value is the value of the header.
    */
  var add: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Remove headers (matching by header names) specified in the list.
    */
  var remove: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
    */
  var set: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaHttpRouteHeaderModifier {
  
  inline def apply(): SchemaHttpRouteHeaderModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteHeaderModifier]
  }
  
  extension [Self <: SchemaHttpRouteHeaderModifier](x: Self) {
    
    inline def setAdd(value: StringDictionary[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddNull: Self = StObject.set(x, "add", null)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveNull: Self = StObject.set(x, "remove", null)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setSet(value: StringDictionary[String]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetNull: Self = StObject.set(x, "set", null)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
