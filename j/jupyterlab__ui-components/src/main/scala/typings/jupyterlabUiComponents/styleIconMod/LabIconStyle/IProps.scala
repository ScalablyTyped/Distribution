package typings.jupyterlabUiComponents.styleIconMod.LabIconStyle

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.center
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.left
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.right
import typings.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProps
  extends NestedCSSProperties
     with ISheetOptions {
  
  /**
    * @deprecated use elementPosition instead
    */
  var justify: js.UndefOr[center | right | left] = js.native
  
  /**
    * @deprecated use stylesheet instead
    */
  var kind: js.UndefOr[IBuiltin] = js.native
  
  /**
    * Specify the icon styling. Can be either a string naming one of
    * the builtin icon stylesheets, a LabIconStyle.ISheet object, or an
    * array containing any mixture of the two. If an array is provided,
    * the actual style will be determined by merging the stylesheets in
    * the array, giving precedence to the rightmost values.
    */
  var stylesheet: js.UndefOr[ISheetResolvable | js.Array[ISheetResolvable]] = js.native
}
object IProps {
  
  @scala.inline
  def apply(): IProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProps]
  }
  
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
    
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
    def setJustify(value: center | right | left): Self = this.set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    
    @scala.inline
    def setKind(value: IBuiltin): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStylesheetVarargs(value: ISheetResolvable*): Self = this.set("stylesheet", js.Array(value :_*))
    
    @scala.inline
    def setStylesheet(value: ISheetResolvable | js.Array[ISheetResolvable]): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
  }
}
