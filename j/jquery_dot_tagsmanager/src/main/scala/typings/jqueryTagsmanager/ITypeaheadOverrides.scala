package typings.jqueryTagsmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeaheadOverrides extends StObject {
  
  var instanceSelectHandler: js.UndefOr[js.Function] = js.undefined
  
  var select: js.UndefOr[js.Function] = js.undefined
  
  var selectedClass: js.UndefOr[String] = js.undefined
}
object ITypeaheadOverrides {
  
  inline def apply(): ITypeaheadOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeaheadOverrides]
  }
  
  extension [Self <: ITypeaheadOverrides](x: Self) {
    
    inline def setInstanceSelectHandler(value: js.Function): Self = StObject.set(x, "instanceSelectHandler", value.asInstanceOf[js.Any])
    
    inline def setInstanceSelectHandlerUndefined: Self = StObject.set(x, "instanceSelectHandler", js.undefined)
    
    inline def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
    
    inline def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
  }
}
