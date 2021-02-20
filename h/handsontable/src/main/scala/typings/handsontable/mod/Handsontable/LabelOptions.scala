package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableStrings.after
import typings.handsontable.handsontableStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends StObject {
  
  var position: js.UndefOr[before | after] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | js.Function0[String]] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setValue(value: String | js.Function0[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction0(value: () => String): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
