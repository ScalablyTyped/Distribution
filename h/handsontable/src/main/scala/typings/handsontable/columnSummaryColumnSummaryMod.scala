package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.custom
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnSummaryColumnSummaryMod {
  
  @JSImport("handsontable/plugins/columnSummary/columnSummary", "ColumnSummary")
  @js.native
  open class ColumnSummary protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def calculate(endpoint: Endpoints): Unit = js.native
    
    def calculateAverage(endpoint: Endpoints): Double = js.native
    
    def calculateMinMax(endpoint: Endpoints, `type`: String): Double = js.native
    
    def calculateSum(endpoint: Endpoints): Unit = js.native
    
    def countEmpty(rowRange: js.Array[Any], col: Double): Double = js.native
    
    def countEntries(endpoint: Endpoints): Double = js.native
    
    var endpoints: js.UndefOr[Endpoints] = js.native
    
    def getCellValue(row: Double, col: Double): String = js.native
    
    def getPartialMinMax(rowRange: js.Array[Any], col: Double, `type`: String): Double = js.native
    
    def getPartialSum(rowRange: js.Array[Any], col: Double): Double = js.native
    
    def isEnabled(): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.anon.typesumminmaxcountaverage
    - typings.handsontable.anon.typecustomcustomFunctiont
  */
  trait DetailedSettings extends StObject
  object DetailedSettings {
    
    inline def typecustomcustomFunctiont(customFunction: Endpoint => Double, destinationColumn: Double, destinationRow: Double): typings.handsontable.anon.typecustomcustomFunctiont = {
      val __obj = js.Dynamic.literal(customFunction = js.Any.fromFunction1(customFunction), destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("custom")
      __obj.asInstanceOf[typings.handsontable.anon.typecustomcustomFunctiont]
    }
    
    inline def typesumminmaxcountaverage(destinationColumn: Double, destinationRow: Double, `type`: sum | min | max | count | average): typings.handsontable.anon.typesumminmaxcountaverage = {
      val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.handsontable.anon.typesumminmaxcountaverage]
    }
  }
  
  trait Endpoint extends StObject {
    
    var customFunction: (js.ThisFunction1[/* this */ ColumnSummary, /* endpoint */ this.type, Double]) | Null
    
    var destinationColumn: Double
    
    var destinationRow: Double
    
    var forceNumeric: Boolean
    
    var ranges: js.Array[js.Array[Double]]
    
    var readOnly: Boolean
    
    var result: Double
    
    var reversedRowCoords: Boolean
    
    var roundFloat: Boolean
    
    var sourceColumn: Double
    
    var suppressDataTypeErrors: Boolean
    
    var `type`: sum | min | max | count | average | custom
  }
  object Endpoint {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any], forceNumeric = forceNumeric.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], reversedRowCoords = reversedRowCoords.asInstanceOf[js.Any], roundFloat = roundFloat.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], suppressDataTypeErrors = suppressDataTypeErrors.asInstanceOf[js.Any], customFunction = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setCustomFunction(value: js.ThisFunction1[/* this */ ColumnSummary, Endpoint, Double]): Self = StObject.set(x, "customFunction", value.asInstanceOf[js.Any])
      
      inline def setCustomFunctionNull: Self = StObject.set(x, "customFunction", null)
      
      inline def setDestinationColumn(value: Double): Self = StObject.set(x, "destinationColumn", value.asInstanceOf[js.Any])
      
      inline def setDestinationRow(value: Double): Self = StObject.set(x, "destinationRow", value.asInstanceOf[js.Any])
      
      inline def setForceNumeric(value: Boolean): Self = StObject.set(x, "forceNumeric", value.asInstanceOf[js.Any])
      
      inline def setRanges(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setReversedRowCoords(value: Boolean): Self = StObject.set(x, "reversedRowCoords", value.asInstanceOf[js.Any])
      
      inline def setRoundFloat(value: Boolean): Self = StObject.set(x, "roundFloat", value.asInstanceOf[js.Any])
      
      inline def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
      
      inline def setSuppressDataTypeErrors(value: Boolean): Self = StObject.set(x, "suppressDataTypeErrors", value.asInstanceOf[js.Any])
      
      inline def setType(value: sum | min | max | count | average | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Endpoints extends StObject {
    
    def assignSetting(settings: js.Object, endpoint: js.Object, name: String, defaultValue: Any): Unit = js.native
    
    var currentEndpoint: js.UndefOr[js.Object] = js.native
    
    var endpoints: js.Array[Endpoint] = js.native
    
    def getAllEndpoints(): js.Array[Any] = js.native
    
    def getEndpoint(index: Double): js.Object = js.native
    
    def parseSettings(settings: js.Array[Any]): Unit = js.native
    
    var plugin: ColumnSummary = js.native
    
    def refreshAllEndpoints(init: Boolean): Unit = js.native
    
    def refreshChangedEndpoints(changes: js.Array[Any]): Unit = js.native
    
    def refreshEndpoint(endpoint: js.Object): Unit = js.native
    
    def resetAllEndpoints(endpoints: js.Array[Any]): Unit = js.native
    def resetAllEndpoints(endpoints: js.Array[Any], useOffset: Boolean): Unit = js.native
    
    def resetEndpointValue(endpoint: js.Object): Unit = js.native
    def resetEndpointValue(endpoint: js.Object, useOffset: Boolean): Unit = js.native
    
    def setEndpointValue(endpoint: js.Object, source: String): Unit = js.native
    def setEndpointValue(endpoint: js.Object, source: String, render: Boolean): Unit = js.native
    
    var settings: js.Object | js.Function0[Unit] = js.native
    
    var settingsType: String = js.native
  }
  
  type Settings = js.Array[DetailedSettings] | js.Function0[js.Array[DetailedSettings]]
}
