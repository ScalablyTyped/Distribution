package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.custom
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends StObject {
  
  var customFunction: (js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ this.type, Double]) | Null = js.native
  
  var destinationColumn: Double = js.native
  
  var destinationRow: Double = js.native
  
  var forceNumeric: Boolean = js.native
  
  var ranges: js.Array[js.Array[Double]] = js.native
  
  var readOnly: Boolean = js.native
  
  var result: Double = js.native
  
  var reversedRowCoords: Boolean = js.native
  
  var roundFloat: Boolean = js.native
  
  var sourceColumn: Double = js.native
  
  var suppressDataTypeErrors: Boolean = js.native
  
  var `type`: sum | min | max | count | average | custom = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(
    destinationColumn: Double,
    destinationRow: Double,
    forceNumeric: Boolean,
    ranges: js.Array[js.Array[Double]],
    readOnly: Boolean,
    result: Double,
    reversedRowCoords: Boolean,
    roundFloat: Boolean,
    sourceColumn: Double,
    suppressDataTypeErrors: Boolean,
    `type`: sum | min | max | count | average | custom
  ): Endpoint = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any], forceNumeric = forceNumeric.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], reversedRowCoords = reversedRowCoords.asInstanceOf[js.Any], roundFloat = roundFloat.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], suppressDataTypeErrors = suppressDataTypeErrors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFunction(value: js.ThisFunction1[/* this */ ColumnSummary, Endpoint, Double]): Self = StObject.set(x, "customFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFunctionNull: Self = StObject.set(x, "customFunction", null)
    
    @scala.inline
    def setDestinationColumn(value: Double): Self = StObject.set(x, "destinationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRow(value: Double): Self = StObject.set(x, "destinationRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceNumeric(value: Boolean): Self = StObject.set(x, "forceNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanges(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedRowCoords(value: Boolean): Self = StObject.set(x, "reversedRowCoords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundFloat(value: Boolean): Self = StObject.set(x, "roundFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressDataTypeErrors(value: Boolean): Self = StObject.set(x, "suppressDataTypeErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sum | min | max | count | average | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
