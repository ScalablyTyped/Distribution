package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.FileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFileManager extends StObject {
  
  /* static member */
  def extend(proto: js.Object): FileManager
  
  /* static member */
  var fn: FileManager
}
object TypeofFileManager {
  
  @scala.inline
  def apply(extend: js.Object => FileManager, fn: FileManager): TypeofFileManager = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFileManager]
  }
  
  @scala.inline
  implicit class TypeofFileManagerMutableBuilder[Self <: TypeofFileManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => FileManager): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: FileManager): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
