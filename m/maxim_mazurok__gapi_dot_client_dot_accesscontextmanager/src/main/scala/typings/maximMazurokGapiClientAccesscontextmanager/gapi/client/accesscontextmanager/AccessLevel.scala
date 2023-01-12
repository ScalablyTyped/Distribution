package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLevel extends StObject {
  
  /** A `BasicLevel` composed of `Conditions`. */
  var basic: js.UndefOr[BasicLevel] = js.undefined
  
  /** A `CustomLevel` written in the Common Expression Language. */
  var custom: js.UndefOr[CustomLevel] = js.undefined
  
  /** Description of the `AccessLevel` and its use. Does not affect behavior. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format:
    * `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum length of the `access_level` component is 50 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Human readable title. Must be unique within the Policy. */
  var title: js.UndefOr[String] = js.undefined
}
object AccessLevel {
  
  inline def apply(): AccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessLevel] (val x: Self) extends AnyVal {
    
    inline def setBasic(value: BasicLevel): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setCustom(value: CustomLevel): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
