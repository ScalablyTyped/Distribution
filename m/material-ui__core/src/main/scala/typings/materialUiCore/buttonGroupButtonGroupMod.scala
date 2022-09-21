package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisableFocusRipple
import typings.materialUiCore.materialUiCoreStrings.div
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
  val default: OverridableComponent[ButtonGroupTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.contained
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.disableElevation
    - typings.materialUiCore.materialUiCoreStrings.fullWidth
    - typings.materialUiCore.materialUiCoreStrings.vertical
    - typings.materialUiCore.materialUiCoreStrings.grouped
    - typings.materialUiCore.materialUiCoreStrings.groupedHorizontal
    - typings.materialUiCore.materialUiCoreStrings.groupedVertical
    - typings.materialUiCore.materialUiCoreStrings.groupedText
    - typings.materialUiCore.materialUiCoreStrings.groupedTextHorizontal
    - typings.materialUiCore.materialUiCoreStrings.groupedTextVertical
    - typings.materialUiCore.materialUiCoreStrings.groupedTextPrimary
    - typings.materialUiCore.materialUiCoreStrings.groupedTextSecondary
    - typings.materialUiCore.materialUiCoreStrings.groupedOutlined
    - typings.materialUiCore.materialUiCoreStrings.groupedOutlinedHorizontal
    - typings.materialUiCore.materialUiCoreStrings.groupedOutlinedVertical
    - typings.materialUiCore.materialUiCoreStrings.groupedOutlinedPrimary
    - typings.materialUiCore.materialUiCoreStrings.groupedOutlinedSecondary
    - typings.materialUiCore.materialUiCoreStrings.groupedContained
    - typings.materialUiCore.materialUiCoreStrings.groupedContainedHorizontal
    - typings.materialUiCore.materialUiCoreStrings.groupedContainedVertical
    - typings.materialUiCore.materialUiCoreStrings.groupedContainedPrimary
    - typings.materialUiCore.materialUiCoreStrings.groupedContainedSecondary
  */
  trait ButtonGroupClassKey extends StObject
  object ButtonGroupClassKey {
    
    inline def contained: typings.materialUiCore.materialUiCoreStrings.contained = "contained".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.contained]
    
    inline def disableElevation: typings.materialUiCore.materialUiCoreStrings.disableElevation = "disableElevation".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disableElevation]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def fullWidth: typings.materialUiCore.materialUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fullWidth]
    
    inline def grouped: typings.materialUiCore.materialUiCoreStrings.grouped = "grouped".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.grouped]
    
    inline def groupedContained: typings.materialUiCore.materialUiCoreStrings.groupedContained = "groupedContained".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedContained]
    
    inline def groupedContainedHorizontal: typings.materialUiCore.materialUiCoreStrings.groupedContainedHorizontal = "groupedContainedHorizontal".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedContainedHorizontal]
    
    inline def groupedContainedPrimary: typings.materialUiCore.materialUiCoreStrings.groupedContainedPrimary = "groupedContainedPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedContainedPrimary]
    
    inline def groupedContainedSecondary: typings.materialUiCore.materialUiCoreStrings.groupedContainedSecondary = "groupedContainedSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedContainedSecondary]
    
    inline def groupedContainedVertical: typings.materialUiCore.materialUiCoreStrings.groupedContainedVertical = "groupedContainedVertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedContainedVertical]
    
    inline def groupedHorizontal: typings.materialUiCore.materialUiCoreStrings.groupedHorizontal = "groupedHorizontal".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedHorizontal]
    
    inline def groupedOutlined: typings.materialUiCore.materialUiCoreStrings.groupedOutlined = "groupedOutlined".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedOutlined]
    
    inline def groupedOutlinedHorizontal: typings.materialUiCore.materialUiCoreStrings.groupedOutlinedHorizontal = "groupedOutlinedHorizontal".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedOutlinedHorizontal]
    
    inline def groupedOutlinedPrimary: typings.materialUiCore.materialUiCoreStrings.groupedOutlinedPrimary = "groupedOutlinedPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedOutlinedPrimary]
    
    inline def groupedOutlinedSecondary: typings.materialUiCore.materialUiCoreStrings.groupedOutlinedSecondary = "groupedOutlinedSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedOutlinedSecondary]
    
    inline def groupedOutlinedVertical: typings.materialUiCore.materialUiCoreStrings.groupedOutlinedVertical = "groupedOutlinedVertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedOutlinedVertical]
    
    inline def groupedText: typings.materialUiCore.materialUiCoreStrings.groupedText = "groupedText".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedText]
    
    inline def groupedTextHorizontal: typings.materialUiCore.materialUiCoreStrings.groupedTextHorizontal = "groupedTextHorizontal".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedTextHorizontal]
    
    inline def groupedTextPrimary: typings.materialUiCore.materialUiCoreStrings.groupedTextPrimary = "groupedTextPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedTextPrimary]
    
    inline def groupedTextSecondary: typings.materialUiCore.materialUiCoreStrings.groupedTextSecondary = "groupedTextSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedTextSecondary]
    
    inline def groupedTextVertical: typings.materialUiCore.materialUiCoreStrings.groupedTextVertical = "groupedTextVertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedTextVertical]
    
    inline def groupedVertical: typings.materialUiCore.materialUiCoreStrings.groupedVertical = "groupedVertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.groupedVertical]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def vertical: typings.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.vertical]
  }
  
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
  
  type _To = OverridableComponent[ButtonGroupTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupButtonGroupMod.foo` */
  override def _to: OverridableComponent[ButtonGroupTypeMap[js.Object, div]] = default
}
