package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a keyword entry.
  */
trait SchemaUserKeyword extends StObject {
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard type of that entry.
    * For example, keyword could be of type occupation or outlook. In addition
    * to the standard type, an entry can have a custom type and can give it any
    * name. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Keyword.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaUserKeyword {
  
  inline def apply(): SchemaUserKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserKeyword]
  }
  
  extension [Self <: SchemaUserKeyword](x: Self) {
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
