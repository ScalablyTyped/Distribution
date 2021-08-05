package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * First party identity principal.
  */
trait SchemaFirstPartyPrincipal extends StObject {
  
  /**
    * The email address of a Google account. .
    */
  var principalEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the service that uses the service account. .
    */
  var serviceMetadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaFirstPartyPrincipal {
  
  inline def apply(): SchemaFirstPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyPrincipal]
  }
  
  extension [Self <: SchemaFirstPartyPrincipal](x: Self) {
    
    inline def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setServiceMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "serviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceMetadataUndefined: Self = StObject.set(x, "serviceMetadata", js.undefined)
  }
}
