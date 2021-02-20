package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvRow extends StObject {
  
  /** The data entries in a CSV file row, as a string array rather than a single comma-separated string. */
  var entries: js.UndefOr[js.Array[String]] = js.native
}
object CsvRow {
  
  @scala.inline
  def apply(): CsvRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvRow]
  }
  
  @scala.inline
  implicit class CsvRowMutableBuilder[Self <: CsvRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
