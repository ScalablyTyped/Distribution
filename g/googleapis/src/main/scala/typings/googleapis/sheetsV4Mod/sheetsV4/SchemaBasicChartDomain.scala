package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicChartDomain extends StObject {
  
  /**
    * The data of the domain. For example, if charting stock prices over time, this is the data representing the dates.
    */
  var domain: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaBasicChartDomain {
  
  inline def apply(): SchemaBasicChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartDomain]
  }
  
  extension [Self <: SchemaBasicChartDomain](x: Self) {
    
    inline def setDomain(value: SchemaChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedNull: Self = StObject.set(x, "reversed", null)
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
