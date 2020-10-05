package typings.leaflet.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.LayersObject
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.Control_.ScaleOptions
import typings.leaflet.mod.Control_.ZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribution
  extends Instantiable0[Control_]
     with Instantiable1[/* options */ ControlOptions, Control_] {
  var Attribution: Instantiable1[
    /* options */ js.UndefOr[AttributionOptions], 
    typings.leaflet.mod.Control_.Attribution
  ] = js.native
  var Layers: Instantiable3[
    /* baseLayers */ js.UndefOr[LayersObject], 
    /* overlays */ js.UndefOr[LayersObject], 
    /* options */ js.UndefOr[LayersOptions], 
    typings.leaflet.mod.Control_.Layers
  ] = js.native
  var Scale: Instantiable1[/* options */ js.UndefOr[ScaleOptions], typings.leaflet.mod.Control_.Scale] = js.native
  var Zoom: Instantiable1[/* options */ js.UndefOr[ZoomOptions], typings.leaflet.mod.Control_.Zoom] = js.native
  def extend[T /* <: js.Object */](props: T): InstantiableT[T] with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
}

