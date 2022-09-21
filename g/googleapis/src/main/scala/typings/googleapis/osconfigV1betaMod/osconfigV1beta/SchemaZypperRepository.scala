package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZypperRepository extends StObject {
  
  /**
    * Required. The location of the repository directory.
    */
  var baseUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the repository.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URIs of GPG keys.
    */
  var gpgKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for guest policy conflicts.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaZypperRepository {
  
  inline def apply(): SchemaZypperRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZypperRepository]
  }
  
  extension [Self <: SchemaZypperRepository](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlNull: Self = StObject.set(x, "baseUrl", null)
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGpgKeys(value: js.Array[String]): Self = StObject.set(x, "gpgKeys", value.asInstanceOf[js.Any])
    
    inline def setGpgKeysNull: Self = StObject.set(x, "gpgKeys", null)
    
    inline def setGpgKeysUndefined: Self = StObject.set(x, "gpgKeys", js.undefined)
    
    inline def setGpgKeysVarargs(value: String*): Self = StObject.set(x, "gpgKeys", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
