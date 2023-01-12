package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /** The original label of this row. */
  var actualLabel: js.UndefOr[String] = js.undefined
  
  /** Info describing predicted label distribution. */
  var entries: js.UndefOr[js.Array[Entry]] = js.undefined
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    inline def setActualLabel(value: String): Self = StObject.set(x, "actualLabel", value.asInstanceOf[js.Any])
    
    inline def setActualLabelUndefined: Self = StObject.set(x, "actualLabel", js.undefined)
    
    inline def setEntries(value: js.Array[Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: Entry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
