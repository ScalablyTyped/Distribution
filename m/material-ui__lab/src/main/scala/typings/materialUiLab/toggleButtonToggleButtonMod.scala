package typings.materialUiLab

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonToggleButtonMod {
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://material-ui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://material-ui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://material-ui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.disabled
    - typings.materialUiLab.materialUiLabStrings.selected
    - typings.materialUiLab.materialUiLabStrings.label
    - typings.materialUiLab.materialUiLabStrings.sizeSmall
    - typings.materialUiLab.materialUiLabStrings.sizeLarge
  */
  trait ToggleButtonClassKey extends StObject
  object ToggleButtonClassKey {
    
    @scala.inline
    def disabled: typings.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typings.materialUiLab.materialUiLabStrings.disabled]
    
    @scala.inline
    def label: typings.materialUiLab.materialUiLabStrings.label = "label".asInstanceOf[typings.materialUiLab.materialUiLabStrings.label]
    
    @scala.inline
    def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
    
    @scala.inline
    def selected: typings.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typings.materialUiLab.materialUiLabStrings.selected]
    
    @scala.inline
    def sizeLarge: typings.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeLarge]
    
    @scala.inline
    def sizeSmall: typings.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeSmall]
  }
  
  type ToggleButtonProps[D /* <: ElementType[_] */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<ToggleButtonTypeMap<P, D>, D> */ js.Any
  
  type ToggleButtonTypeMap[P, D /* <: ElementType[_] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBaseTypeMap<{  props :P & {  disableFocusRipple :boolean | undefined,   selected :boolean | undefined,   size :'small' | 'medium' | 'large' | undefined,   value :any | undefined},   defaultComponent :D,   classKey :ToggleButtonClassKey}> */ js.Any
}
