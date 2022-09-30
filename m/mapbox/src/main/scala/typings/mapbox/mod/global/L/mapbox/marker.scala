package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//////////////////////////////////////////////////////////////////////
////////////////////////////// MARKERS ///////////////////////////////
//////////////////////////////////////////////////////////////////////
object marker {
  
  @JSGlobal("L.mapbox.marker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A core icon generator used in L.mapbox.marker.style
    */
  inline def icon(feature: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(feature.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * An icon generator for use in conjunction with pointToLayer to generate markers from the Mapbox Markers API and support the simplestyle-spec for features.
    */
  inline def style(feature: Any, latlng: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(feature.asInstanceOf[js.Any], latlng.asInstanceOf[js.Any])).asInstanceOf[Any]
}
