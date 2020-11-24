package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that function as a shorthand for compound CSS properties,
  * such as the set of props required to center an svg inside
  * of a parent node
  */
@js.native
trait ISheetOptions extends js.Object {
  
  /**
    * How to position the inner svg element,
    * relative to the outer container
    */
  var elementPosition: js.UndefOr[IPosition] = js.native
  
  /**
    * the size of the inner svg element. Can be any of:
    *   - 'small': 14px x 14px
    *   - 'normal': 16px x 16px
    *   - 'large': 20px x 20px
    *   - 'xlarge': 24px x 24px
    */
  var elementSize: js.UndefOr[ISize] = js.native
}
object ISheetOptions {
  
  @scala.inline
  def apply(): ISheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISheetOptions]
  }
  
  @scala.inline
  implicit class ISheetOptionsOps[Self <: ISheetOptions] (val x: Self) extends AnyVal {
    
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
    def setElementPosition(value: IPosition): Self = this.set("elementPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementPosition: Self = this.set("elementPosition", js.undefined)
    
    @scala.inline
    def setElementSize(value: ISize): Self = this.set("elementSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementSize: Self = this.set("elementSize", js.undefined)
  }
}
