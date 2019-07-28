package typings.leaflet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.leaflet.leafletMod.Control
import typings.leaflet.leafletMod.ControlNs.AttributionOptions
import typings.leaflet.leafletMod.ControlNs.LayersObject
import typings.leaflet.leafletMod.ControlNs.LayersOptions
import typings.leaflet.leafletMod.ControlNs.ScaleOptions
import typings.leaflet.leafletMod.ControlNs.ZoomOptions
import typings.leaflet.leafletMod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attribution
  extends Instantiable0[Control]
     with Instantiable1[/* options */ ControlOptions, Control] {
  var Attribution: Instantiable1[
    js.UndefOr[/* options */ AttributionOptions], 
    typings.leaflet.leafletMod.ControlNs.Attribution
  ] = js.native
  var Layers: Instantiable3[
    js.UndefOr[/* baseLayers */ LayersObject], 
    js.UndefOr[/* overlays */ LayersObject], 
    js.UndefOr[/* options */ LayersOptions], 
    typings.leaflet.leafletMod.ControlNs.Layers
  ] = js.native
  var Scale: Instantiable1[js.UndefOr[/* options */ ScaleOptions], typings.leaflet.leafletMod.ControlNs.Scale] = js.native
  var Zoom: Instantiable1[js.UndefOr[/* options */ ZoomOptions], typings.leaflet.leafletMod.ControlNs.Zoom] = js.native
  def extend[T /* <: js.Object */](props: T): Anon_ArgsAny[T] with (/* import warning: ImportType.apply Failed type conversion: typeof Control */ js.Any) = js.native
}

