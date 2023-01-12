package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLabelsFilterOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
    * `>`, `<`, `>=`, `<=`, `==`, and `===`.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The point property to filter by. Point
    * options are passed directly to properties, additionally there are `y`
    * value, `percentage` and others listed under Highcharts.Point members.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The value to compare against.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object DataLabelsFilterOptionsObject {
  
  inline def apply(): DataLabelsFilterOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelsFilterOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataLabelsFilterOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
