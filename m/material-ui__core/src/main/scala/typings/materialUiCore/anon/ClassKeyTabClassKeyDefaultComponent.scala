package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.tabTabMod.TabClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyTabClassKeyDefaultComponent extends StObject {
  
  var classKey: TabClassKey
  
  var defaultComponent: div
  
  var props: FullWidth
}
object ClassKeyTabClassKeyDefaultComponent {
  
  inline def apply(classKey: TabClassKey, props: FullWidth): ClassKeyTabClassKeyDefaultComponent = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyTabClassKeyDefaultComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassKeyTabClassKeyDefaultComponent] (val x: Self) extends AnyVal {
    
    inline def setClassKey(value: TabClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: FullWidth): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
