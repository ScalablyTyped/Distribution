package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogramRule extends StObject {
  
  /**
    * The maximum value at which items are placed into buckets of constant size. Values above end are lumped into a single bucket. This field is optional.
    */
  var end: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The size of the buckets that are created. Must be positive.
    */
  var interval: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum value at which items are placed into buckets of constant size. Values below start are lumped into a single bucket. This field is optional.
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHistogramRule {
  
  inline def apply(): SchemaHistogramRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramRule]
  }
  
  extension [Self <: SchemaHistogramRule](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalNull: Self = StObject.set(x, "interval", null)
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
