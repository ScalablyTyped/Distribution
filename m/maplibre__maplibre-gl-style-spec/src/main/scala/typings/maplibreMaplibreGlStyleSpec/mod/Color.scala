package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "Color")
@js.native
open class Color protected ()
  extends StObject
     with _Value {
  /**
  	 * @param r Red component premultiplied by `alpha` 0..1
  	 * @param g Green component premultiplied by `alpha` 0..1
  	 * @param b Blue component premultiplied by `alpha` 0..1
  	 * @param [alpha=1] Alpha component 0..1
  	 * @param [premultiplied=true] Whether the `r`, `g` and `b` values have already
  	 * been multiplied by alpha. If `true` nothing happens if `false` then they will
  	 * be multiplied automatically.
  	 */
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double, alpha: Double) = this()
  def this(r: Double, g: Double, b: Double, alpha: Double, premultiplied: Boolean) = this()
  def this(r: Double, g: Double, b: Double, alpha: Unit, premultiplied: Boolean) = this()
  
  val a: Double = js.native
  
  val b: Double = js.native
  
  val g: Double = js.native
  
  /**
  	 * Used in color interpolation.
  	 *
  	 * @returns Gien color, with reversed alpha blending, in HCL color space.
  	 */
  def hcl: HCLColor = js.native
  
  /**
  	 * Used in color interpolation.
  	 *
  	 * @returns Gien color, with reversed alpha blending, in LAB color space.
  	 */
  def lab: LABColor = js.native
  
  /**
  	 * Lazy getter pattern. When getter is called for the first time lazy value
  	 * is calculated and then overwrites getter function in given object instance.
  	 *
  	 * @example:
  	 * const redColor = Color.parse('red');
  	 * let x = redColor.hcl; // this will invoke `get hcl()`, which will calculate
  	 * // the value of red in HCL space and invoke this `overwriteGetter` function
  	 * // which in turn will set a field with a key 'hcl' in the `redColor` object.
  	 * // In other words it will override `get hcl()` from its `Color` prototype
  	 * // with its own property: hcl = [calculated red value in hcl].
  	 * let y = redColor.hcl; // next call will no longer invoke getter but simply
  	 * // return the previously calculated value
  	 * x === y; // true - `x` is exactly the same object as `y`
  	 *
  	 * @param getterKey Getter key
  	 * @param lazyValue Lazily calculated value to be memoized by current instance
  	 * @private
  	 */
  /* private */ var overwriteGetter: Any = js.native
  
  val r: Double = js.native
  
  /**
  	 * Used in color interpolation and by 'to-rgba' expression.
  	 *
  	 * @returns Gien color, with reversed alpha blending, in sRGB color space.
  	 */
  def rgb: RGBColor = js.native
}
/* static members */
object Color {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Color.black")
  @js.native
  def black: Color = js.native
  inline def black_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
  
  /**
  	 * Parses CSS color strings and converts colors to sRGB color space if needed.
  	 * Officially supported color formats:
  	 * - keyword, e.g. 'aquamarine' or 'steelblue'
  	 * - hex (with 3, 4, 6 or 8 digits), e.g. '#f0f' or '#e9bebea9'
  	 * - rgb and rgba, e.g. 'rgb(0,240,120)' or 'rgba(0%,94%,47%,0.1)' or 'rgb(0 240 120 / .3)'
  	 * - hsl and hsla, e.g. 'hsl(0,0%,83%)' or 'hsla(0,0%,83%,.5)' or 'hsl(0 0% 83% / 20%)'
  	 *
  	 * @param input CSS color string to parse.
  	 * @returns A `Color` instance, or `undefined` if the input is not a valid color string.
  	 */
  inline def parse(): js.UndefOr[Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.UndefOr[Color]]
  inline def parse(input: String): js.UndefOr[Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Color]]
  inline def parse(input: Color): js.UndefOr[Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Color]]
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Color.red")
  @js.native
  def red: Color = js.native
  inline def red_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Color.transparent")
  @js.native
  def transparent: Color = js.native
  inline def transparent_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "Color.white")
  @js.native
  def white: Color = js.native
  inline def white_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
}
