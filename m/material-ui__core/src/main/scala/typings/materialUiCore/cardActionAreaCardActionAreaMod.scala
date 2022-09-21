package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyCardActionAreaClassKey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaCardActionAreaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardActionArea API](https://mui.com/api/card-action-area/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/CardActionArea/CardActionArea", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
    - typings.materialUiCore.materialUiCoreStrings.focusHighlight
  */
  trait CardActionAreaClassKey extends StObject
  object CardActionAreaClassKey {
    
    inline def focusHighlight: typings.materialUiCore.materialUiCoreStrings.focusHighlight = "focusHighlight".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusHighlight]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type CardActionAreaProps[D /* <: ElementType[Any] */, P] = OverrideProps[CardActionAreaTypeMap[P, D], D]
  
  type CardActionAreaTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyCardActionAreaClassKey[P, D]]
  
  type _To = ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionAreaCardActionAreaMod.foo` */
  override def _to: ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]] = default
}
