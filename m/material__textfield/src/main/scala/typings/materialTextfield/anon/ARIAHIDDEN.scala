package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARIAHIDDEN extends StObject {
  
  var ARIA_HIDDEN: String
  
  var ROLE: String
  
  var ROOT_SELECTOR: String
}
object ARIAHIDDEN {
  
  @scala.inline
  def apply(ARIA_HIDDEN: String, ROLE: String, ROOT_SELECTOR: String): ARIAHIDDEN = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN.asInstanceOf[js.Any], ROLE = ROLE.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAHIDDEN]
  }
  
  @scala.inline
  implicit class ARIAHIDDENMutableBuilder[Self <: ARIAHIDDEN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARIA_HIDDEN(value: String): Self = StObject.set(x, "ARIA_HIDDEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROLE(value: String): Self = StObject.set(x, "ROLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT_SELECTOR(value: String): Self = StObject.set(x, "ROOT_SELECTOR", value.asInstanceOf[js.Any])
  }
}
