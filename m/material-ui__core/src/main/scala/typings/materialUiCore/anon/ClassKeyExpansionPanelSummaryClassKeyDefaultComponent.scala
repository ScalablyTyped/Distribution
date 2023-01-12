package typings.materialUiCore.anon

import typings.materialUiCore.expansionPanelSummaryExpansionPanelSummaryMod.ExpansionPanelSummaryClassKey
import typings.materialUiCore.materialUiCoreStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyExpansionPanelSummaryClassKeyDefaultComponent extends StObject {
  
  var classKey: ExpansionPanelSummaryClassKey
  
  var defaultComponent: div
  
  var props: ExpandIcon
}
object ClassKeyExpansionPanelSummaryClassKeyDefaultComponent {
  
  inline def apply(classKey: ExpansionPanelSummaryClassKey, props: ExpandIcon): ClassKeyExpansionPanelSummaryClassKeyDefaultComponent = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyExpansionPanelSummaryClassKeyDefaultComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassKeyExpansionPanelSummaryClassKeyDefaultComponent] (val x: Self) extends AnyVal {
    
    inline def setClassKey(value: ExpansionPanelSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: ExpandIcon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
