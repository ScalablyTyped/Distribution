package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1AccessLevel extends StObject {
  
  /** A `BasicLevel` composed of `Conditions`. */
  var basic: js.UndefOr[GoogleIdentityAccesscontextmanagerV1BasicLevel] = js.undefined
  
  /** A `CustomLevel` written in the Common Expression Language. */
  var custom: js.UndefOr[GoogleIdentityAccesscontextmanagerV1CustomLevel] = js.undefined
  
  /** Description of the `AccessLevel` and its use. Does not affect behavior. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format:
    * `accessPolicies/{policy_id}/accessLevels/{short_name}`. The maximum length of the `short_name` component is 50 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Human readable title. Must be unique within the Policy. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1AccessLevel {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1AccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1AccessLevel]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1AccessLevel](x: Self) {
    
    inline def setBasic(value: GoogleIdentityAccesscontextmanagerV1BasicLevel): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setCustom(value: GoogleIdentityAccesscontextmanagerV1CustomLevel): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
