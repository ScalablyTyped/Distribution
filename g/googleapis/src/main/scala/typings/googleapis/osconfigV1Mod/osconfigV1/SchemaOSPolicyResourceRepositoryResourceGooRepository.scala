package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceRepositoryResourceGooRepository extends StObject {
  
  /**
    * Required. The name of the repository.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The url of the repository.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceRepositoryResourceGooRepository {
  
  inline def apply(): SchemaOSPolicyResourceRepositoryResourceGooRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceRepositoryResourceGooRepository]
  }
  
  extension [Self <: SchemaOSPolicyResourceRepositoryResourceGooRepository](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
