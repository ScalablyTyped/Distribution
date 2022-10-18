package typings.materialUiCore.anon

import typings.materialUiCore.accordionSummaryAccordionSummaryMod.AccordionSummaryClassKey
import typings.materialUiCore.materialUiCoreStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKey extends StObject {
  
  var classKey: AccordionSummaryClassKey
  
  var defaultComponent: div
  
  var props: js.Object & Children
}
object ClassKey {
  
  inline def apply(classKey: AccordionSummaryClassKey, props: js.Object & Children): ClassKey = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKey]
  }
  
  extension [Self <: ClassKey](x: Self) {
    
    inline def setClassKey(value: AccordionSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
