package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data within a range of the spreadsheet.
  */
trait SchemaValueRange extends StObject {
  
  /**
    * The major dimension of the values.  For output, if the spreadsheet data
    * is: `A1=1,B1=2,A2=3,B2=4`, then requesting
    * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas
    * requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.  For input, with `range=A1:B2,majorDimension=ROWS` then
    * `[[1,2],[3,4]]` will set `A1=1,B1=2,A2=3,B2=4`. With
    * `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]` will set
    * `A1=1,B1=3,A2=2,B2=4`.  When writing, if this field is not set, it
    * defaults to ROWS.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  
  /**
    * The range the values cover, in A1 notation. For output, this range
    * indicates the entire requested range, even though the values will exclude
    * trailing rows and columns. When appending values, this field represents
    * the range to search for a table, after which values will be appended.
    */
  var range: js.UndefOr[String] = js.undefined
  
  /**
    * The data that was read or to be written.  This is an array of arrays, the
    * outer array representing all the data and each inner array representing a
    * major dimension. Each item in the inner array corresponds with one cell.
    * For output, empty trailing rows and columns will not be included.  For
    * input, supported value types are: bool, string, and double. Null values
    * will be skipped. To set a cell to an empty value, set the string value to
    * an empty string.
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object SchemaValueRange {
  
  inline def apply(): SchemaValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueRange]
  }
  
  extension [Self <: SchemaValueRange](x: Self) {
    
    inline def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
    
    inline def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
