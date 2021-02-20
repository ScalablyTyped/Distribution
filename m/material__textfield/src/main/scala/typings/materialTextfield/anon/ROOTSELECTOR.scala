package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ROOTSELECTOR extends StObject {
  
  var ROOT_SELECTOR: String = js.native
}
object ROOTSELECTOR {
  
  @scala.inline
  def apply(ROOT_SELECTOR: String): ROOTSELECTOR = {
    val __obj = js.Dynamic.literal(ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ROOTSELECTOR]
  }
  
  @scala.inline
  implicit class ROOTSELECTORMutableBuilder[Self <: ROOTSELECTOR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setROOT_SELECTOR(value: String): Self = StObject.set(x, "ROOT_SELECTOR", value.asInstanceOf[js.Any])
  }
}
