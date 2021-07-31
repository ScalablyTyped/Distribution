package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoUnitOptions
  extends StObject
     with InfoOptions {
  
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
}
object InfoUnitOptions {
  
  @scala.inline
  def apply(): InfoUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoUnitOptions]
  }
  
  @scala.inline
  implicit class InfoUnitOptionsMutableBuilder[Self <: InfoUnitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
  }
}
