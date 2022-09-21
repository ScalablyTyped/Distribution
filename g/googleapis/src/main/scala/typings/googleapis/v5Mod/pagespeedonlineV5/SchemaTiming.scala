package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTiming extends StObject {
  
  /**
    * The total duration of Lighthouse's run.
    */
  var total: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTiming {
  
  inline def apply(): SchemaTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTiming]
  }
  
  extension [Self <: SchemaTiming](x: Self) {
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalNull: Self = StObject.set(x, "total", null)
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
