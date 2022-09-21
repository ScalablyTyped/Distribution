package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDefinition extends StObject {
  
  /**
    * The name for the object, which then defines its type. Item indexing requests should set the objectType field equal to this value. For example, if *name* is *Document*, then indexing
    * requests for items of type Document should set objectType equal to *Document*. Each object definition must be uniquely named within a schema. The name must start with a letter and
    * can only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The optional object-specific options. */
  var options: js.UndefOr[ObjectOptions] = js.undefined
  
  /** The property definitions for the object. The maximum number of elements is 1000. */
  var propertyDefinitions: js.UndefOr[js.Array[PropertyDefinition]] = js.undefined
}
object ObjectDefinition {
  
  inline def apply(): ObjectDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDefinition]
  }
  
  extension [Self <: ObjectDefinition](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: ObjectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPropertyDefinitions(value: js.Array[PropertyDefinition]): Self = StObject.set(x, "propertyDefinitions", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefinitionsUndefined: Self = StObject.set(x, "propertyDefinitions", js.undefined)
    
    inline def setPropertyDefinitionsVarargs(value: PropertyDefinition*): Self = StObject.set(x, "propertyDefinitions", js.Array(value*))
  }
}
