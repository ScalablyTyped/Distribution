package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDataEventObject extends StObject {
  
  /**
    * Contains the data rows for the current export task and can be modified.
    */
  var dataRows: js.Array[js.Array[String]] = js.native
}
object ExportDataEventObject {
  
  @scala.inline
  def apply(dataRows: js.Array[js.Array[String]]): ExportDataEventObject = {
    val __obj = js.Dynamic.literal(dataRows = dataRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataEventObject]
  }
  
  @scala.inline
  implicit class ExportDataEventObjectMutableBuilder[Self <: ExportDataEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "dataRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "dataRows", js.Array(value :_*))
  }
}
