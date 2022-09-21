package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceDefinitionVersion extends StObject {
  
  /**
    * Name is the version name, e.g. “v1”, “v2beta1”, etc.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Served is a flag enabling/disabling this version from being served via REST APIs
    */
  var served: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Storage flags the version as storage version. There must be exactly one flagged as storage version.
    */
  var storage: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCustomResourceDefinitionVersion {
  
  inline def apply(): SchemaCustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceDefinitionVersion]
  }
  
  extension [Self <: SchemaCustomResourceDefinitionVersion](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServed(value: Boolean): Self = StObject.set(x, "served", value.asInstanceOf[js.Any])
    
    inline def setServedNull: Self = StObject.set(x, "served", null)
    
    inline def setServedUndefined: Self = StObject.set(x, "served", js.undefined)
    
    inline def setStorage(value: Boolean): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageNull: Self = StObject.set(x, "storage", null)
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
