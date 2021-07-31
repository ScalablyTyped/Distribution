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
  
  @scala.inline
  def apply(): ITypeaheadOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeaheadOverrides]
  }
  
  @scala.inline
  implicit class ITypeaheadOverridesMutableBuilder[Self <: ITypeaheadOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceSelectHandler(value: js.Function): Self = StObject.set(x, "instanceSelectHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceSelectHandlerUndefined: Self = StObject.set(x, "instanceSelectHandler", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
  }
}
