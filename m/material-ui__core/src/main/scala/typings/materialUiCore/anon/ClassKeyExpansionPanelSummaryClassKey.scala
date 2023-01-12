package typings.materialUiCore.anon

import typings.materialUiCore.expansionPanelSummaryExpansionPanelSummaryMod.ExpansionPanelSummaryClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyExpansionPanelSummaryClassKey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: ExpansionPanelSummaryClassKey
  
  var defaultComponent: D
  
  var props: P & Children
}
object ClassKeyExpansionPanelSummaryClassKey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: ExpansionPanelSummaryClassKey, defaultComponent: D, props: P & Children): ClassKeyExpansionPanelSummaryClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyExpansionPanelSummaryClassKey[P, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassKeyExpansionPanelSummaryClassKey[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ClassKeyExpansionPanelSummaryClassKey[P, D])) extends AnyVal {
    
    inline def setClassKey(value: ExpansionPanelSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
