package typings.guacamoleClient.onScreenKeyboardMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an entire on-screen keyboard layout, including all available
  * keys, their behaviors, and their relative position and sizing.
  * @param template
  *     The object whose identically-named properties will be used to initialize
  *     the properties of this layout.
  */
@js.native
trait Layout extends js.Object {
  
  /**
    * The width of each key, in arbitrary units, relative to other keys in
    * this layout. The true pixel size of each key will be determined by the
    * overall size of the keyboard. If not defined here, the width of each
    * key will default to 1.
    */
  var keyWidths: Record[String, Double] = js.native
  
  /**
    * Map of key name to corresponding keysym, title, or key object. If only
    * the keysym or title is provided, the key object will be created
    * implicitly. In all cases, the name property of the key object will be
    * taken from the name given in the mapping.
    */
  var keys: Record[String, Double | String | Key | js.Array[Key]] = js.native
  
  /**
    * The language of keyboard layout, such as "en_US". This property is for
    * informational purposes only, but it is recommend to conform to the
    * [language code]_[country code] format.
    */
  var language: String = js.native
  
  /**
    * Arbitrarily nested, arbitrarily grouped key names. The contents of the
    * layout will be traversed to produce an identically-nested grouping of
    * keys in the DOM tree. All strings will be transformed into their
    * corresponding sets of keys, while all objects and arrays will be
    * transformed into named groups and anonymous groups respectively. Any
    * numbers present will be transformed into gaps of that size, scaled
    * according to the same units as each key.
    */
  var layout: Layout = js.native
  
  /**
    * The type of keyboard layout, such as "qwerty". This property is for
    * informational purposes only, and does not conform to any standard.
    */
  var `type`: String = js.native
  
  /**
    * The width of the entire keyboard, in arbitrary units. The width of each
    * key is relative to this width, as both width values are assumed to be in
    * the same units. The conversion factor between these units and pixels is
    * derived later via a call to resize() on the Guacamole.OnScreenKeyboard.
    */
  var width: Double = js.native
}
object Layout {
  
  @scala.inline
  def apply(
    keyWidths: Record[String, Double],
    keys: Record[String, Double | String | Key | js.Array[Key]],
    language: String,
    layout: Layout,
    `type`: String,
    width: Double
  ): Layout = {
    val __obj = js.Dynamic.literal(keyWidths = keyWidths.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    
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
    def setKeyWidths(value: Record[String, Double]): Self = this.set("keyWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: Record[String, Double | String | Key | js.Array[Key]]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
