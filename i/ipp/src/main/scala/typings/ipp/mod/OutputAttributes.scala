package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputAttributes extends StObject {
  
  var `noise-removal`: js.UndefOr[Double] = js.undefined
  
  var `output-compression-quality-factor`: js.UndefOr[Double] = js.undefined
}
object OutputAttributes {
  
  inline def apply(): OutputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputAttributes]
  }
  
  extension [Self <: OutputAttributes](x: Self) {
    
    inline def `setNoise-removal`(value: Double): Self = StObject.set(x, "noise-removal", value.asInstanceOf[js.Any])
    
    inline def `setNoise-removalUndefined`: Self = StObject.set(x, "noise-removal", js.undefined)
    
    inline def `setOutput-compression-quality-factor`(value: Double): Self = StObject.set(x, "output-compression-quality-factor", value.asInstanceOf[js.Any])
    
    inline def `setOutput-compression-quality-factorUndefined`: Self = StObject.set(x, "output-compression-quality-factor", js.undefined)
  }
}
