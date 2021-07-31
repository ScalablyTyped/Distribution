package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnGroupable extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
}
object GridColumnGroupable {
  
  @scala.inline
  def apply(): GridColumnGroupable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGroupable]
  }
  
  @scala.inline
  implicit class GridColumnGroupableMutableBuilder[Self <: GridColumnGroupable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
  }
}
