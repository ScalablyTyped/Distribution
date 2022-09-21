package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.expansionPanelSummaryExpansionPanelSummaryMod.ExpansionPanelSummaryTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelSummaryMod extends Shortcut {
  
  /**
    * ⚠️ The ExpansionPanelSummary component was renamed to AccordionSummary to use a more common naming convention.
    *
    * You should use `import { AccordionSummary } from '@material-ui/core'`
    * or `import AccordionSummary from '@material-ui/core/AccordionSummary'`.
    * API:
    *
    * - [ExpansionPanelSummary API](https://mui.com/api/expansion-panel-summary/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/ExpansionPanelSummary", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]] = js.native
  
  type _To = ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `expansionPanelSummaryMod.foo` */
  override def _to: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]] = default
}
