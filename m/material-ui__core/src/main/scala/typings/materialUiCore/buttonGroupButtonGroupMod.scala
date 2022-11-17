package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisableFocusRipple
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupButtonGroupMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    *
    * API:
    *
    * - [ButtonGroup API](https://mui.com/api/button-group/)
    */
  @JSImport("@material-ui/core/ButtonGroup/ButtonGroup", JSImport.Default)
  @js.native
  val default: OverridableComponent[ButtonGroupTypeMap[js.Object, "div"]] = js.native
  
  object ButtonGroupClassKey {
    
    inline def contained: "contained" = "contained".asInstanceOf["contained"]
    
    inline def disableElevation: "disableElevation" = "disableElevation".asInstanceOf["disableElevation"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def fullWidth: "fullWidth" = "fullWidth".asInstanceOf["fullWidth"]
    
    inline def grouped: "grouped" = "grouped".asInstanceOf["grouped"]
    
    inline def groupedContained: "groupedContained" = "groupedContained".asInstanceOf["groupedContained"]
    
    inline def groupedContainedHorizontal: "groupedContainedHorizontal" = "groupedContainedHorizontal".asInstanceOf["groupedContainedHorizontal"]
    
    inline def groupedContainedPrimary: "groupedContainedPrimary" = "groupedContainedPrimary".asInstanceOf["groupedContainedPrimary"]
    
    inline def groupedContainedSecondary: "groupedContainedSecondary" = "groupedContainedSecondary".asInstanceOf["groupedContainedSecondary"]
    
    inline def groupedContainedVertical: "groupedContainedVertical" = "groupedContainedVertical".asInstanceOf["groupedContainedVertical"]
    
    inline def groupedHorizontal: "groupedHorizontal" = "groupedHorizontal".asInstanceOf["groupedHorizontal"]
    
    inline def groupedOutlined: "groupedOutlined" = "groupedOutlined".asInstanceOf["groupedOutlined"]
    
    inline def groupedOutlinedHorizontal: "groupedOutlinedHorizontal" = "groupedOutlinedHorizontal".asInstanceOf["groupedOutlinedHorizontal"]
    
    inline def groupedOutlinedPrimary: "groupedOutlinedPrimary" = "groupedOutlinedPrimary".asInstanceOf["groupedOutlinedPrimary"]
    
    inline def groupedOutlinedSecondary: "groupedOutlinedSecondary" = "groupedOutlinedSecondary".asInstanceOf["groupedOutlinedSecondary"]
    
    inline def groupedOutlinedVertical: "groupedOutlinedVertical" = "groupedOutlinedVertical".asInstanceOf["groupedOutlinedVertical"]
    
    inline def groupedText: "groupedText" = "groupedText".asInstanceOf["groupedText"]
    
    inline def groupedTextHorizontal: "groupedTextHorizontal" = "groupedTextHorizontal".asInstanceOf["groupedTextHorizontal"]
    
    inline def groupedTextPrimary: "groupedTextPrimary" = "groupedTextPrimary".asInstanceOf["groupedTextPrimary"]
    
    inline def groupedTextSecondary: "groupedTextSecondary" = "groupedTextSecondary".asInstanceOf["groupedTextSecondary"]
    
    inline def groupedTextVertical: "groupedTextVertical" = "groupedTextVertical".asInstanceOf["groupedTextVertical"]
    
    inline def groupedVertical: "groupedVertical" = "groupedVertical".asInstanceOf["groupedVertical"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def vertical: "vertical" = "vertical".asInstanceOf["vertical"]
  }
  type ButtonGroupClassKey = "root" | "contained" | "disabled" | "disableElevation" | "fullWidth" | "vertical" | "grouped" | "groupedHorizontal" | "groupedVertical" | "groupedText" | "groupedTextHorizontal" | "groupedTextVertical" | "groupedTextPrimary" | "groupedTextSecondary" | "groupedOutlined" | "groupedOutlinedHorizontal" | "groupedOutlinedVertical" | "groupedOutlinedPrimary" | "groupedOutlinedSecondary" | "groupedContained" | "groupedContainedHorizontal" | "groupedContainedVertical" | "groupedContainedPrimary" | "groupedContainedSecondary"
  
  type ButtonGroupProps[D /* <: ElementType[Any] */, P] = OverrideProps[ButtonGroupTypeMap[P, D], D]
  
  trait ButtonGroupTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ButtonGroupClassKey
    
    var defaultComponent: D
    
    var props: P & DisableFocusRipple
  }
  object ButtonGroupTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ButtonGroupClassKey, defaultComponent: D, props: P & DisableFocusRipple): ButtonGroupTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonGroupTypeMap[P, D]]
    }
    
    extension [Self <: ButtonGroupTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ButtonGroupTypeMap[P, D])) {
      
      inline def setClassKey(value: ButtonGroupClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableFocusRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ButtonGroupTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupButtonGroupMod.foo` */
  override def _to: OverridableComponent[ButtonGroupTypeMap[js.Object, "div"]] = default
}
