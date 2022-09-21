package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  zoom :number,   heatmapDensity :number | undefined,   lineProgress :number | undefined,   isSupportedScript :(_ : string): boolean | undefined,   accumulated :maplibre-gl.maplibre-gl.Value | undefined}> */
trait GlobalProperties extends StObject {
  
  val accumulated: js.UndefOr[Value] = js.undefined
  
  val heatmapDensity: js.UndefOr[Double] = js.undefined
  
  val isSupportedScript: js.UndefOr[js.Function1[/* _ */ String, Boolean]] = js.undefined
  
  val lineProgress: js.UndefOr[Double] = js.undefined
  
  val zoom: Double
}
object GlobalProperties {
  
  inline def apply(zoom: Double): GlobalProperties = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalProperties]
  }
  
  extension [Self <: GlobalProperties](x: Self) {
    
    inline def setAccumulated(value: Value): Self = StObject.set(x, "accumulated", value.asInstanceOf[js.Any])
    
    inline def setAccumulatedNull: Self = StObject.set(x, "accumulated", null)
    
    inline def setAccumulatedUndefined: Self = StObject.set(x, "accumulated", js.undefined)
    
    inline def setAccumulatedVarargs(value: Any*): Self = StObject.set(x, "accumulated", js.Array(value*))
    
    inline def setHeatmapDensity(value: Double): Self = StObject.set(x, "heatmapDensity", value.asInstanceOf[js.Any])
    
    inline def setHeatmapDensityUndefined: Self = StObject.set(x, "heatmapDensity", js.undefined)
    
    inline def setIsSupportedScript(value: /* _ */ String => Boolean): Self = StObject.set(x, "isSupportedScript", js.Any.fromFunction1(value))
    
    inline def setIsSupportedScriptUndefined: Self = StObject.set(x, "isSupportedScript", js.undefined)
    
    inline def setLineProgress(value: Double): Self = StObject.set(x, "lineProgress", value.asInstanceOf[js.Any])
    
    inline def setLineProgressUndefined: Self = StObject.set(x, "lineProgress", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
