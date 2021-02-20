package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The domain of a CandlestickChart.
  */
@js.native
trait SchemaCandlestickDomain extends StObject {
  
  /**
    * The data of the CandlestickDomain.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean] = js.native
}
object SchemaCandlestickDomain {
  
  @scala.inline
  def apply(): SchemaCandlestickDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickDomain]
  }
  
  @scala.inline
  implicit class SchemaCandlestickDomainMutableBuilder[Self <: SchemaCandlestickDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SchemaChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
