package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolates {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "interpolates")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "interpolates.array")
  @js.native
  def array: FnCall = js.native
  inline def array[T /* <: js.Array[Double] */](from: T, to: T, t: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def array_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "interpolates.color")
  @js.native
  def color: js.Function4[
    /* from */ Color, 
    /* to */ Color, 
    /* t */ Double, 
    /* spaceKey */ js.UndefOr[InterpolationColorSpace], 
    Color
  ] = js.native
  inline def color(from: Color, to: Color, t: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def color(from: Color, to: Color, t: Double, spaceKey: InterpolationColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], t.asInstanceOf[js.Any], spaceKey.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def color_=(
    x: js.Function4[
      /* from */ Color, 
      /* to */ Color, 
      /* t */ Double, 
      /* spaceKey */ js.UndefOr[InterpolationColorSpace], 
      Color
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "interpolates.number")
  @js.native
  def number: Double = js.native
  inline def number_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "interpolates.padding")
  @js.native
  def padding: js.Function3[/* from */ Padding, /* to */ Padding, /* t */ Double, Padding] = js.native
  inline def padding(from: Padding, to: Padding, t: Double): Padding = (^.asInstanceOf[js.Dynamic].applyDynamic("padding")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Padding]
  inline def padding_=(x: js.Function3[/* from */ Padding, /* to */ Padding, /* t */ Double, Padding]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
}
