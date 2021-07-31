package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/candlestickchart&quot;&gt;candlestick
  * chart&lt;/a&gt;.
  */
trait SchemaCandlestickChartSpec extends StObject {
  
  /**
    * The Candlestick chart data. Only one CandlestickData is supported.
    */
  var data: js.UndefOr[js.Array[SchemaCandlestickData]] = js.undefined
  
  /**
    * The domain data (horizontal axis) for the candlestick chart.  String data
    * will be treated as discrete labels, other data will be treated as
    * continuous values.
    */
  var domain: js.UndefOr[SchemaCandlestickDomain] = js.undefined
}
object SchemaCandlestickChartSpec {
  
  @scala.inline
  def apply(): SchemaCandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickChartSpec]
  }
  
  @scala.inline
  implicit class SchemaCandlestickChartSpecMutableBuilder[Self <: SchemaCandlestickChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[SchemaCandlestickData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: SchemaCandlestickData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: SchemaCandlestickDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
