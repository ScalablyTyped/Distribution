package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /**
    * The entity's key. An entity must have a key, unless otherwise documented (for example, an entity in `Value.entity_value` may have no key). An entity's kind is its key path's last
    * element's kind, or null if it has no key.
    */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    * The entity's properties. The map's keys are property names. A property name matching regex `__.*__` is reserved. A reserved property name is forbidden in certain documented
    * contexts. The name must not contain more than 500 characters. The name cannot be `""`.
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.datastore.gapi.client.datastore.Value} */ js.Any
  ] = js.undefined
}
object Entity {
  
  inline def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.datastore.gapi.client.datastore.Value} */ js.Any
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
