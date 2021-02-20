package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitParam extends StObject {
  
  var explicit: Boolean = js.native
}
object ExplicitParam {
  
  @scala.inline
  def apply(explicit: Boolean): ExplicitParam = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitParam]
  }
  
  @scala.inline
  implicit class ExplicitParamMutableBuilder[Self <: ExplicitParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
  }
}
