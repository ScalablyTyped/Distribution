package typings.jdenticon.jdenticonMod._Global_

import typings.jdenticon.Anon_Color
import typings.jdenticon.Anon_ColorGrayscale
import typings.jdenticon.jdenticonStrings.never
import typings.jdenticon.jdenticonStrings.observe
import typings.jdenticon.jdenticonStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdenticonConfig extends js.Object {
  /**
    * Specifies the background color to be rendered behind the icon.
    * 
    * Supported syntaxes are:
    *  * `"#rgb"`
    *  * `"#rgba"`
    *  * `"#rrggbb"`
    *  * `"#rrggbbaa"`
    */
  var backColor: js.UndefOr[String] = js.undefined
  /**
    * Limits the possible hues in generated icons. The hues are specified as an array of hues in degrees. If the
    * option is omitted or an empty array is specified, all hues are allowed.
    */
  var hues: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Specifies the lightness of the generated icon.
    */
  var lightness: js.UndefOr[Anon_Color] = js.undefined
  /**
    * Specifies the padding surrounding the icon in percents in the range [0.0, 0.5).
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Specifies when icons will be rendered.
    * 
    *  * `"never"` – icons are never rendered automatically. You need to call `jdenticon.update()` manually to
    *    render identicons.
    * 
    *  * `"once"` – icons are rendered once the page has loaded. Any dynamically inserted or modified icons will
    *    not be rendered unless `jdenticon.update()` is manually called.
    * 
    *  * `"observe"` – icons are rendered upon page load, and the DOM is monitored for new icons using a 
    *    `MutationObserver`. Use this if icons are inserted dynamically, e.g. by using Angular, React or 
    *    VanillaJS. This option behaves as `"once"` in IE<11.
    * 
    * @remarks
    * This option has no effect in Node environments.
    */
  var replaceMode: js.UndefOr[never | once | observe] = js.undefined
  /**
    * Specifies the saturation of the generated icon.
    * 
    * For backward compatibility a single number can be specified instead of a `{ color, grayscale }`
    * object. This single number refers to the saturation of colored shapes.
    */
  var saturation: js.UndefOr[Anon_ColorGrayscale | Double] = js.undefined
}

object JdenticonConfig {
  @scala.inline
  def apply(
    backColor: String = null,
    hues: js.Array[Double] = null,
    lightness: Anon_Color = null,
    padding: Int | Double = null,
    replaceMode: never | once | observe = null,
    saturation: Anon_ColorGrayscale | Double = null
  ): JdenticonConfig = {
    val __obj = js.Dynamic.literal()
    if (backColor != null) __obj.updateDynamic("backColor")(backColor)
    if (hues != null) __obj.updateDynamic("hues")(hues)
    if (lightness != null) __obj.updateDynamic("lightness")(lightness)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (replaceMode != null) __obj.updateDynamic("replaceMode")(replaceMode.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JdenticonConfig]
  }
}

