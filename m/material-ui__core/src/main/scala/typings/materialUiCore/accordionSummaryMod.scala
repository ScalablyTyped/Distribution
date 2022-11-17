package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.accordionSummaryAccordionSummaryMod.AccordionSummaryTypeMap
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryMod extends Shortcut {
  
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
  @JSImport("@material-ui/core/AccordionSummary", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, "div"]] = js.native
  
  type _To = ExtendButtonBase[AccordionSummaryTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSummaryMod.foo` */
  override def _to: ExtendButtonBase[AccordionSummaryTypeMap[js.Object, "div"]] = default
}
