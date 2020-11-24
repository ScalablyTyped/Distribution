package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import typings.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stylesheet with a collection of CSS props for each node
  * in an icon, plus some custom options
  */
@js.native
trait ISheet extends ISheetResolvable {
  
  /**
    * CSS properties that will be applied to the outer container
    * element via a typestyle class
    */
  var container: js.UndefOr[NestedCSSProperties] = js.native
  
  /**
    * CSS properties that will be applied to the inner svg
    * element via a typestyle class
    */
  var element: js.UndefOr[NestedCSSProperties] = js.native
  
  /**
    * Options that function as modifiers for this style's
    * CSS properties
    */
  var options: js.UndefOr[ISheetOptions] = js.native
}
object ISheet {
  
  @scala.inline
  def apply(): ISheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISheet]
  }
  
  @scala.inline
  implicit class ISheetOps[Self <: ISheet] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: NestedCSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setElement(value: NestedCSSProperties): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setOptions(value: ISheetOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
