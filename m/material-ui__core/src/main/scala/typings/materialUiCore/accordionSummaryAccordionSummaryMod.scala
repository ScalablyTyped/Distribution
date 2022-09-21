package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DefaultComponent
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryAccordionSummaryMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Accordion](https://mui.com/components/accordion/)
    *
    * API:
    *
    * - [AccordionSummary API](https://mui.com/api/accordion-summary/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/AccordionSummary/AccordionSummary", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.expanded
    - typings.materialUiCore.materialUiCoreStrings.focused
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.content
    - typings.materialUiCore.materialUiCoreStrings.expandIcon
  */
  trait AccordionSummaryClassKey extends StObject
  object AccordionSummaryClassKey {
    
    inline def content: typings.materialUiCore.materialUiCoreStrings.content = "content".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.content]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def expandIcon: typings.materialUiCore.materialUiCoreStrings.expandIcon = "expandIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.expandIcon]
    
    inline def expanded: typings.materialUiCore.materialUiCoreStrings.expanded = "expanded".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.expanded]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def focused: typings.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focused]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type AccordionSummaryProps[D /* <: ElementType[Any] */, P] = OverrideProps[AccordionSummaryTypeMap[P, D], D]
  
  type AccordionSummaryTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[DefaultComponent[P, D]]
  
  type _To = ExtendButtonBase[AccordionSummaryTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSummaryAccordionSummaryMod.foo` */
  override def _to: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, div]] = default
}
