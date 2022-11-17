package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Props
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, "div"]] = js.native
  
  object AccordionSummaryClassKey {
    
    inline def content: "content" = "content".asInstanceOf["content"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def expandIcon: "expandIcon" = "expandIcon".asInstanceOf["expandIcon"]
    
    inline def expanded: "expanded" = "expanded".asInstanceOf["expanded"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def focused: "focused" = "focused".asInstanceOf["focused"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type AccordionSummaryClassKey = "root" | "expanded" | "focused" | "focusVisible" | "disabled" | "content" | "expandIcon"
  
  type AccordionSummaryProps[D /* <: ElementType[Any] */, P] = OverrideProps[AccordionSummaryTypeMap[P, D], D]
  
  type AccordionSummaryTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[Props[P, D]]
  
  type _To = ExtendButtonBase[AccordionSummaryTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSummaryAccordionSummaryMod.foo` */
  override def _to: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, "div"]] = default
}
