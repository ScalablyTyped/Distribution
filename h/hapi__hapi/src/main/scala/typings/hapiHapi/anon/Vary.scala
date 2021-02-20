package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vary extends StObject {
  
  var vary: Boolean = js.native
  
  var weak: Boolean = js.native
}
object Vary {
  
  @scala.inline
  def apply(vary: Boolean, weak: Boolean): Vary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vary]
  }
  
  @scala.inline
  implicit class VaryMutableBuilder[Self <: Vary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVary(value: Boolean): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
  }
}
