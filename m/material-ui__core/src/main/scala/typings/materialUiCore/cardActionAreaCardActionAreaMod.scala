package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ClassKeyCardActionAreaClassKey
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[CardActionAreaTypeMap[js.Object, "button"]] = js.native
  
  object CardActionAreaClassKey {
    
    inline def focusHighlight: "focusHighlight" = "focusHighlight".asInstanceOf["focusHighlight"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type CardActionAreaClassKey = "root" | "focusVisible" | "focusHighlight"
  
  type CardActionAreaProps[D /* <: ElementType[Any] */, P] = OverrideProps[CardActionAreaTypeMap[P, D], D]
  
  type CardActionAreaTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[ClassKeyCardActionAreaClassKey[P, D]]
  
  type _To = ExtendButtonBase[CardActionAreaTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionAreaCardActionAreaMod.foo` */
  override def _to: ExtendButtonBase[CardActionAreaTypeMap[js.Object, "button"]] = default
}
