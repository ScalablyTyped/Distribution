package typings.materialUiCore.anon

import typings.materialUiCore.expansionPanelSummaryExpansionPanelSummaryMod.ExpansionPanelSummaryClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyExpansionPanelSummaryClassKey extends StObject {
  
  var classKey: ExpansionPanelSummaryClassKey
  
  var defaultComponent: "div"
  
  var props: js.Object & Children
}
object ClassKeyExpansionPanelSummaryClassKey {
  
  inline def apply(classKey: ExpansionPanelSummaryClassKey, props: js.Object & Children): ClassKeyExpansionPanelSummaryClassKey = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyExpansionPanelSummaryClassKey]
  }
  
  extension [Self <: ClassKeyExpansionPanelSummaryClassKey](x: Self) {
    
    inline def setClassKey(value: ExpansionPanelSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: "div"): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Object & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
