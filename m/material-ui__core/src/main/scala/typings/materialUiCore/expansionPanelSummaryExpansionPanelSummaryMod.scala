package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelSummaryExpansionPanelSummaryMod extends Shortcut {
  
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
  @JSImport("@material-ui/core/ExpansionPanelSummary/ExpansionPanelSummary", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.expanded
    - typings.materialUiCore.materialUiCoreStrings.focused
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.content
    - typings.materialUiCore.materialUiCoreStrings.expandIcon
  */
  trait ExpansionPanelSummaryClassKey extends StObject
  object ExpansionPanelSummaryClassKey {
    
    inline def content: typings.materialUiCore.materialUiCoreStrings.content = "content".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.content]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def expandIcon: typings.materialUiCore.materialUiCoreStrings.expandIcon = "expandIcon".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.expandIcon]
    
    inline def expanded: typings.materialUiCore.materialUiCoreStrings.expanded = "expanded".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.expanded]
    
    inline def focused: typings.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focused]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type ExpansionPanelSummaryProps[D /* <: ElementType[Any] */, P] = OverrideProps[ExpansionPanelSummaryTypeMap[P, D], D]
  
  type ExpansionPanelSummaryTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[DefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `expansionPanelSummaryExpansionPanelSummaryMod.foo` */
  override def _to: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, div]] = default
}
