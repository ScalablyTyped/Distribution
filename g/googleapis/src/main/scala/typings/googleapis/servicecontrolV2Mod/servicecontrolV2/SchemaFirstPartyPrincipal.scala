package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirstPartyPrincipal extends StObject {
  
  /**
    * The email address of a Google account. .
    */
  var principalEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the service that uses the service account. .
    */
  var serviceMetadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaFirstPartyPrincipal {
  
  inline def apply(): SchemaFirstPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyPrincipal]
  }
  
  extension [Self <: SchemaFirstPartyPrincipal](x: Self) {
    
    inline def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailNull: Self = StObject.set(x, "principalEmail", null)
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setServiceMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "serviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceMetadataNull: Self = StObject.set(x, "serviceMetadata", null)
    
    inline def setServiceMetadataUndefined: Self = StObject.set(x, "serviceMetadata", js.undefined)
  }
}
