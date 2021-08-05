package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  /** [TrustedTester] [Required] The end of range partitioning, exclusive. */
  var end: js.UndefOr[String] = js.undefined
  
  /** [TrustedTester] [Required] The width of each interval. */
  var interval: js.UndefOr[String] = js.undefined
  
  /** [TrustedTester] [Required] The start of range partitioning, inclusive. */
  var start: js.UndefOr[String] = js.undefined
}
object End {
  
  inline def apply(): End = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
