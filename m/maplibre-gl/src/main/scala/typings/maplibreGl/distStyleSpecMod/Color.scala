package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl/dist/style-spec", "Color")
@js.native
open class Color protected ()
  extends StObject
     with _Value {
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var g: Double = js.native
  
  var r: Double = js.native
  
  def toArray(): js.Tuple4[Double, Double, Double, Double] = js.native
}
/* static members */
object Color {
  
  @JSImport("maplibre-gl/dist/style-spec", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl/dist/style-spec", "Color.black")
  @js.native
  def black: Color = js.native
  inline def black_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
  
  /**
  	 * Parses valid CSS color strings and returns a `Color` instance.
  	 * @returns A `Color` instance, or `undefined` if the input is not a valid color string.
  	 */
  inline def parse(): Color | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Color | Unit]
  inline def parse(input: String): Color | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Color | Unit]
  inline def parse(input: Color): Color | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Color | Unit]
  
  @JSImport("maplibre-gl/dist/style-spec", "Color.red")
  @js.native
  def red: Color = js.native
  inline def red_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "Color.transparent")
  @js.native
  def transparent: Color = js.native
  inline def transparent_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl/dist/style-spec", "Color.white")
  @js.native
  def white: Color = js.native
  inline def white_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
}
