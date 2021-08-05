package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows you to organize the date-time values in a source data column into
  * buckets based on selected parts of their date or time values. For example,
  * consider a pivot table showing sales transactions by date:
  * +----------+--------------+     | Date     | SUM of Sales |
  * +----------+--------------+     | 1/1/2017 |      $621.14 |     | 2/3/2017
  * |      $708.84 |     | 5/8/2017 |      $326.84 |     ...
  * +----------+--------------+ Applying a date-time group rule with a
  * DateTimeRuleType of YEAR_MONTH results in the following pivot table.
  * +--------------+--------------+     | Grouped Date | SUM of Sales |
  * +--------------+--------------+     | 2017-Jan     |   $53,731.78 |     |
  * 2017-Feb     |   $83,475.32 |     | 2017-Mar     |   $94,385.05 |     ...
  * +--------------+--------------+
  */
trait SchemaDateTimeRule extends StObject {
  
  /**
    * The type of date-time grouping to apply.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDateTimeRule {
  
  inline def apply(): SchemaDateTimeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateTimeRule]
  }
  
  extension [Self <: SchemaDateTimeRule](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
