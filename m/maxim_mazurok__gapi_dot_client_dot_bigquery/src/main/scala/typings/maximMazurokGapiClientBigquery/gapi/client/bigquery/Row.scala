package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row extends StObject {
  
  /** The original label of this row. */
  var actualLabel: js.UndefOr[String] = js.native
  
  /** Info describing predicted label distribution. */
  var entries: js.UndefOr[js.Array[Entry]] = js.native
}
object Row {
  
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualLabel(value: String): Self = StObject.set(x, "actualLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualLabelUndefined: Self = StObject.set(x, "actualLabel", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: Entry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
