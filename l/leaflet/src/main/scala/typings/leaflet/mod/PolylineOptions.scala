package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineOptions
  extends StObject
     with PathOptions {
  
  var noClip: js.UndefOr[Boolean] = js.undefined
  
  var smoothFactor: js.UndefOr[Double] = js.undefined
}
object PolylineOptions {
  
  inline def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setNoClip(value: Boolean): Self = StObject.set(x, "noClip", value.asInstanceOf[js.Any])
    
    inline def setNoClipUndefined: Self = StObject.set(x, "noClip", js.undefined)
    
    inline def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    inline def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
  }
}
