package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExplicit extends StObject {
  
  /**
    * The values must be monotonically increasing.
    */
  var bounds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaExplicit {
  
  inline def apply(): SchemaExplicit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplicit]
  }
  
  extension [Self <: SchemaExplicit](x: Self) {
    
    inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
  }
}
