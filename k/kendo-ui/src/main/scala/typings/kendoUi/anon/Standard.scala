package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Standard extends StObject {
  
  var standard: AM = js.native
}
object Standard {
  
  @scala.inline
  def apply(standard: AM): Standard = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  
  @scala.inline
  implicit class StandardMutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandard(value: AM): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
