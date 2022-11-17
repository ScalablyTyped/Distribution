package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DefaultComponentD
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
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
  val default: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, "div"]] = js.native
  
  object ExpansionPanelSummaryClassKey {
    
    inline def content: "content" = "content".asInstanceOf["content"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def expandIcon: "expandIcon" = "expandIcon".asInstanceOf["expandIcon"]
    
    inline def expanded: "expanded" = "expanded".asInstanceOf["expanded"]
    
    inline def focused: "focused" = "focused".asInstanceOf["focused"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type ExpansionPanelSummaryClassKey = "root" | "expanded" | "focused" | "disabled" | "content" | "expandIcon"
  
  type ExpansionPanelSummaryProps[D /* <: ElementType[Any] */, P] = OverrideProps[ExpansionPanelSummaryTypeMap[P, D], D]
  
  type ExpansionPanelSummaryTypeMap[P, D /* <: ElementType[Any] */] = ExtendButtonBaseTypeMap[DefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `expansionPanelSummaryExpansionPanelSummaryMod.foo` */
  override def _to: ExtendButtonBase[ExpansionPanelSummaryTypeMap[js.Object, "div"]] = default
}
