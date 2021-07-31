package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParam extends StObject {
  
  var `type`: String
}
object TypeParam {
  
  @scala.inline
  def apply(`type`: String): TypeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParam]
  }
  
  @scala.inline
  implicit class TypeParamMutableBuilder[Self <: TypeParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
