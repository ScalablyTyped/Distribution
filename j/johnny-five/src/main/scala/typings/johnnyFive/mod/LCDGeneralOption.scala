package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LCDGeneralOption extends StObject {
  
  var cols: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
}
object LCDGeneralOption {
  
  @scala.inline
  def apply(): LCDGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LCDGeneralOption]
  }
  
  @scala.inline
  implicit class LCDGeneralOptionMutableBuilder[Self <: LCDGeneralOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
