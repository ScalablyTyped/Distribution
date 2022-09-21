package typings.materialUiCore.anon

import typings.materialUiCore.accordionSummaryAccordionSummaryMod.AccordionSummaryClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponent[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: AccordionSummaryClassKey
  
  var defaultComponent: D
  
  var props: P & Children
}
object DefaultComponent {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: AccordionSummaryClassKey, defaultComponent: D, props: P & Children): DefaultComponent[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponent[P, D]]
  }
  
  extension [Self <: DefaultComponent[?, ?], P, D /* <: ElementType[Any] */](x: Self & (DefaultComponent[P, D])) {
    
    inline def setClassKey(value: AccordionSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
