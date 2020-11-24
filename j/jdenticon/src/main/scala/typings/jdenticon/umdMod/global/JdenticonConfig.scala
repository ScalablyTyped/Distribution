package typings.jdenticon.umdMod.global

import typings.jdenticon.anon.Color
import typings.jdenticon.anon.Grayscale
import typings.jdenticon.jdenticonStrings.never
import typings.jdenticon.jdenticonStrings.observe
import typings.jdenticon.jdenticonStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var backColor: js.UndefOr[String] = js.native
  
  /**
    * Limits the possible hues in generated icons. The hues are specified as an array of hues in degrees. If the
    * option is omitted or an empty array is specified, all hues are allowed.
    */
  var hues: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Specifies the lightness of the generated icon.
    */
  var lightness: js.UndefOr[Color] = js.native
  
  /**
    * Specifies the padding surrounding the icon in percents in the range [0.0, 0.5).
    */
  var padding: js.UndefOr[Double] = js.native
  
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
  var replaceMode: js.UndefOr[never | once | observe] = js.native
  
  /**
    * Specifies the saturation of the generated icon.
    * 
    * For backward compatibility a single number can be specified instead of a `{ color, grayscale }`
    * object. This single number refers to the saturation of colored shapes.
    */
  var saturation: js.UndefOr[Grayscale | Double] = js.native
}
object JdenticonConfig {
  
  @scala.inline
  def apply(): JdenticonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JdenticonConfig]
  }
  
  @scala.inline
  implicit class JdenticonConfigOps[Self <: JdenticonConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackColor(value: String): Self = this.set("backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackColor: Self = this.set("backColor", js.undefined)
    
    @scala.inline
    def setHuesVarargs(value: Double*): Self = this.set("hues", js.Array(value :_*))
    
    @scala.inline
    def setHues(value: js.Array[Double]): Self = this.set("hues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHues: Self = this.set("hues", js.undefined)
    
    @scala.inline
    def setLightness(value: Color): Self = this.set("lightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightness: Self = this.set("lightness", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setReplaceMode(value: never | once | observe): Self = this.set("replaceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceMode: Self = this.set("replaceMode", js.undefined)
    
    @scala.inline
    def setSaturation(value: Grayscale | Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
  }
}
