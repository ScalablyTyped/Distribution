package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAptRepository extends StObject {
  
  /**
    * Type of archive files in this repository. The default behavior is DEB.
    */
  var archiveType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. List of components for this repository. Must contain at least one item.
    */
  var components: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Distribution of this repository.
    */
  var distribution: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg` containing all the keys in any applied guest policy.
    */
  var gpgKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. URI for this repository.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAptRepository {
  
  inline def apply(): SchemaAptRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAptRepository]
  }
  
  extension [Self <: SchemaAptRepository](x: Self) {
    
    inline def setArchiveType(value: String): Self = StObject.set(x, "archiveType", value.asInstanceOf[js.Any])
    
    inline def setArchiveTypeNull: Self = StObject.set(x, "archiveType", null)
    
    inline def setArchiveTypeUndefined: Self = StObject.set(x, "archiveType", js.undefined)
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsNull: Self = StObject.set(x, "components", null)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDistribution(value: String): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionNull: Self = StObject.set(x, "distribution", null)
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setGpgKey(value: String): Self = StObject.set(x, "gpgKey", value.asInstanceOf[js.Any])
    
    inline def setGpgKeyNull: Self = StObject.set(x, "gpgKey", null)
    
    inline def setGpgKeyUndefined: Self = StObject.set(x, "gpgKey", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
