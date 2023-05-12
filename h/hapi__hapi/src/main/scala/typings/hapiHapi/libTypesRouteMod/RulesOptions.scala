package typings.hapiHapi.libTypesRouteMod

import typings.hapiHapi.anon.Options
import typings.hapiHapi.libTypesRequestMod.ReqRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesOptions[Refs /* <: ReqRef */] extends StObject {
  
  var validate: Options[Refs]
}
object RulesOptions {
  
  inline def apply[Refs /* <: ReqRef */](validate: Options[Refs]): RulesOptions[Refs] = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesOptions[Refs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulesOptions[?], Refs /* <: ReqRef */] (val x: Self & RulesOptions[Refs]) extends AnyVal {
    
    inline def setValidate(value: Options[Refs]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
