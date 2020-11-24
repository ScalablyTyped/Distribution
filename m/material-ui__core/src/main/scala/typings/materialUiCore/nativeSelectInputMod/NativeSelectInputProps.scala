package typings.materialUiCore.nativeSelectInputMod

import typings.materialUiCore.anon.Node
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeSelectInputProps extends js.Object {
  
  var IconComponent: js.UndefOr[ReactType[_]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Node, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
  ] = js.native
  
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
  
  var variant: js.UndefOr[standard | outlined | filled] = js.native
}
object NativeSelectInputProps {
  
  @scala.inline
  def apply(): NativeSelectInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeSelectInputProps]
  }
  
  @scala.inline
  implicit class NativeSelectInputPropsOps[Self <: NativeSelectInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIconComponent(value: ReactType[_]): Self = this.set("IconComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconComponent: Self = this.set("IconComponent", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* ref */ HTMLSelectElement | Node => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (String | Double | Boolean)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: (js.Array[String | Double | Boolean]) | String | Double | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVariant(value: standard | outlined | filled): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
