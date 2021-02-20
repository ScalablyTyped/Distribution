package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapModalDefaultsAttributes extends StObject {
  
  var role: String = js.native
}
object KnockstrapModalDefaultsAttributes {
  
  @scala.inline
  def apply(role: String): KnockstrapModalDefaultsAttributes = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsAttributes]
  }
  
  @scala.inline
  implicit class KnockstrapModalDefaultsAttributesMutableBuilder[Self <: KnockstrapModalDefaultsAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
