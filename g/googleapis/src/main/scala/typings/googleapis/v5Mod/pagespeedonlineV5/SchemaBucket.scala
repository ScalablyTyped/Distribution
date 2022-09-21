package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucket extends StObject {
  
  /**
    * Upper bound for a bucket's range.
    */
  var max: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Lower bound for a bucket's range.
    */
  var min: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The proportion of data in this bucket.
    */
  var proportion: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBucket {
  
  inline def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  
  extension [Self <: SchemaBucket](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setProportion(value: Double): Self = StObject.set(x, "proportion", value.asInstanceOf[js.Any])
    
    inline def setProportionNull: Self = StObject.set(x, "proportion", null)
    
    inline def setProportionUndefined: Self = StObject.set(x, "proportion", js.undefined)
  }
}
