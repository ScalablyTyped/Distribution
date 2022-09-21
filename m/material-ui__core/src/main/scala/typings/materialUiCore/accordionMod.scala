package typings.materialUiCore

import typings.materialUiCore.accordionAccordionMod.AccordionProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@material-ui/core/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
