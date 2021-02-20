package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cols extends StObject {
  
  var cols: js.UndefOr[js.Array[Id]] = js.native
  
  var rows: js.UndefOr[js.Array[C]] = js.native
}
object Cols {
  
  @scala.inline
  def apply(): Cols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cols]
  }
  
  @scala.inline
  implicit class ColsMutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: js.Array[Id]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setColsVarargs(value: Id*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[C]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: C*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
