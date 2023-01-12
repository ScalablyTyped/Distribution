package typings.handsontable.anon

import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import typings.handsontable.pluginsColumnSummaryColumnSummaryMod.DetailedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'sum' | 'min' | 'max' | 'count' | 'average'} & {  destinationRow :number,   destinationColumn :number,   forceNumeric :boolean | undefined,   reversedRowCoords :boolean | undefined,   suppressDataTypeErrors :boolean | undefined,   readOnly :boolean | undefined,   roundFloat :boolean | undefined,   ranges :std.Array<std.Array<number>> | undefined,   sourceColumn :number | undefined} */
trait typesumminmaxcountaverage
  extends StObject
     with DetailedSettings {
  
  var destinationColumn: Double
  
  var destinationRow: Double
  
  var forceNumeric: js.UndefOr[Boolean] = js.undefined
  
  var ranges: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var reversedRowCoords: js.UndefOr[Boolean] = js.undefined
  
  var roundFloat: js.UndefOr[Boolean] = js.undefined
  
  var sourceColumn: js.UndefOr[Double] = js.undefined
  
  var suppressDataTypeErrors: js.UndefOr[Boolean] = js.undefined
  
  var `type`: sum | min | max | count | average
}
object typesumminmaxcountaverage {
  
  inline def apply(destinationColumn: Double, destinationRow: Double, `type`: sum | min | max | count | average): typesumminmaxcountaverage = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typesumminmaxcountaverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typesumminmaxcountaverage] (val x: Self) extends AnyVal {
    
    inline def setDestinationColumn(value: Double): Self = StObject.set(x, "destinationColumn", value.asInstanceOf[js.Any])
    
    inline def setDestinationRow(value: Double): Self = StObject.set(x, "destinationRow", value.asInstanceOf[js.Any])
    
    inline def setForceNumeric(value: Boolean): Self = StObject.set(x, "forceNumeric", value.asInstanceOf[js.Any])
    
    inline def setForceNumericUndefined: Self = StObject.set(x, "forceNumeric", js.undefined)
    
    inline def setRanges(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReversedRowCoords(value: Boolean): Self = StObject.set(x, "reversedRowCoords", value.asInstanceOf[js.Any])
    
    inline def setReversedRowCoordsUndefined: Self = StObject.set(x, "reversedRowCoords", js.undefined)
    
    inline def setRoundFloat(value: Boolean): Self = StObject.set(x, "roundFloat", value.asInstanceOf[js.Any])
    
    inline def setRoundFloatUndefined: Self = StObject.set(x, "roundFloat", js.undefined)
    
    inline def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceColumnUndefined: Self = StObject.set(x, "sourceColumn", js.undefined)
    
    inline def setSuppressDataTypeErrors(value: Boolean): Self = StObject.set(x, "suppressDataTypeErrors", value.asInstanceOf[js.Any])
    
    inline def setSuppressDataTypeErrorsUndefined: Self = StObject.set(x, "suppressDataTypeErrors", js.undefined)
    
    inline def setType(value: sum | min | max | count | average): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
