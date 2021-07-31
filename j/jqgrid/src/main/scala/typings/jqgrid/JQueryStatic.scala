package typings.jqgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var jqGrid: js.UndefOr[JQueryJqGridStatic] = js.undefined
}
object JQueryStatic {
  
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJqGrid(value: JQueryJqGridStatic): Self = StObject.set(x, "jqGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqGridUndefined: Self = StObject.set(x, "jqGrid", js.undefined)
  }
}
