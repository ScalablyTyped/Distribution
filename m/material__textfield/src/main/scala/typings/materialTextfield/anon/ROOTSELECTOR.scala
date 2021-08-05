package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ROOTSELECTOR extends StObject {
  
  var ROOT_SELECTOR: String
}
object ROOTSELECTOR {
  
  inline def apply(ROOT_SELECTOR: String): ROOTSELECTOR = {
    val __obj = js.Dynamic.literal(ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ROOTSELECTOR]
  }
  
  extension [Self <: ROOTSELECTOR](x: Self) {
    
    inline def setROOT_SELECTOR(value: String): Self = StObject.set(x, "ROOT_SELECTOR", value.asInstanceOf[js.Any])
  }
}
