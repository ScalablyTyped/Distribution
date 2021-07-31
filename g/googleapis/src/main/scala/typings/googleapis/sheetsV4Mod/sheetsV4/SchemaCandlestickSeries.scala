package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The series of a CandlestickData.
  */
trait SchemaCandlestickSeries extends StObject {
  
  /**
    * The data of the CandlestickSeries.
    */
  var data: js.UndefOr[SchemaChartData] = js.undefined
}
object SchemaCandlestickSeries {
  
  @scala.inline
  def apply(): SchemaCandlestickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickSeries]
  }
  
  @scala.inline
  implicit class SchemaCandlestickSeriesMutableBuilder[Self <: SchemaCandlestickSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SchemaChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
