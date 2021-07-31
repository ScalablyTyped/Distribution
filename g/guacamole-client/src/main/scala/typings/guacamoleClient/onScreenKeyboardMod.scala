package typings.guacamoleClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onScreenKeyboardMod {
  
  @JSImport("guacamole-client/lib/OnScreenKeyboard", "OnScreenKeyboard")
  @js.native
  class OnScreenKeyboard protected () extends StObject {
    def this(layout: Layout) = this()
    
    /**
      * Returns the element containing the entire on-screen keyboard.
      * @returns The element containing the entire on-screen keyboard.
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Map of all key names to their corresponding set of keys. Each key name
      * may correspond to multiple keys due to the effect of modifiers.
      */
    var keys: Record[String, js.Array[Key]] = js.native
    
    /**
      * The keyboard layout provided at time of construction.
      */
    var layout: Layout = js.native
    
    /**
      * Fired whenever the user presses a key on this Guacamole.OnScreenKeyboard.
      *
      * @event
      * @param keysym The keysym of the key being pressed.
      */
    var onkeydown: Null | (js.Function1[/* keysym */ Double, Unit]) = js.native
    
    /**
      * Fired whenever the user releases a key on this Guacamole.OnScreenKeyboard.
      * @event
      * @param keysym The keysym of the key being released.
      */
    var onkeyup: Null | (js.Function1[/* keysym */ Double, Unit]) = js.native
    
    /**
      * Resizes all elements within this Guacamole.OnScreenKeyboard such that
      * the width is close to but does not exceed the specified width. The
      * height of the keyboard is determined based on the width.
      * @param width The width to resize this Guacamole.OnScreenKeyboard to, in pixels.
      */
    def resize(width: Double): Unit = js.native
    
    /**
      * The number of mousemove events to require before re-enabling mouse
      * event handling after receiving a touch event.
      */
    var touchMouseThreshold: Double = js.native
  }
  object OnScreenKeyboard {
    
    type Key = Instantiable2[
        /* template */ typings.guacamoleClient.onScreenKeyboardMod.Key, 
        /* name */ js.UndefOr[String], 
        typings.guacamoleClient.onScreenKeyboardMod.Key
      ]
    
    type Layout = Instantiable1[
        /* template */ typings.guacamoleClient.onScreenKeyboardMod.Layout, 
        typings.guacamoleClient.onScreenKeyboardMod.Layout
      ]
  }
  
  /**
    * Represents a single key, or a single possible behavior of a key. Each key
    * on the on-screen keyboard must have at least one associated
    * Guacamole.OnScreenKeyboard.Key, whether that key is explicitly defined or
    * implied, and may have multiple Guacamole.OnScreenKeyboard.Key if behavior
    * depends on modifier states.
    */
  trait Key extends StObject {
    
    /**
      * The keysym to be pressed/released when this key is pressed/released. If
      * not provided, this will be derived from the title if the title is a
      * single character.
      */
    var keysym: Double
    
    /**
      * The name of the modifier set when the key is pressed and cleared when
      * this key is released, if any. The names of modifiers are distinct from
      * the names of keys; both the "RightShift" and "LeftShift" keys may set
      * the "shift" modifier, for example. By default, the key will affect no
      * modifiers.
      */
    var modifier: String
    
    /**
      * The unique name identifying this key within the keyboard layout.
      */
    var name: String
    
    /**
      * An array containing the names of each modifier required for this key to
      * have an effect. For example, a lowercase letter may require nothing,
      * while an uppercase letter would require "shift", assuming the Shift key
      * is named "shift" within the layout. By default, the key will require
      * no modifiers.
      */
    var requires: js.Array[String]
    
    /**
      * The human-readable title that will be displayed to the user within the
      * key. If not provided, this will be derived from the key name.
      */
    var title: String
  }
  object Key {
    
    @scala.inline
    def apply(keysym: Double, modifier: String, name: String, requires: js.Array[String], title: String): Key = {
      val __obj = js.Dynamic.literal(keysym = keysym.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeysym(value: Double): Self = StObject.set(x, "keysym", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents an entire on-screen keyboard layout, including all available
    * keys, their behaviors, and their relative position and sizing.
    * @param template
    *     The object whose identically-named properties will be used to initialize
    *     the properties of this layout.
    */
  trait Layout extends StObject {
    
    /**
      * The width of each key, in arbitrary units, relative to other keys in
      * this layout. The true pixel size of each key will be determined by the
      * overall size of the keyboard. If not defined here, the width of each
      * key will default to 1.
      */
    var keyWidths: Record[String, Double]
    
    /**
      * Map of key name to corresponding keysym, title, or key object. If only
      * the keysym or title is provided, the key object will be created
      * implicitly. In all cases, the name property of the key object will be
      * taken from the name given in the mapping.
      */
    var keys: Record[String, Double | String | Key | js.Array[Key]]
    
    /**
      * The language of keyboard layout, such as "en_US". This property is for
      * informational purposes only, but it is recommend to conform to the
      * [language code]_[country code] format.
      */
    var language: String
    
    /**
      * Arbitrarily nested, arbitrarily grouped key names. The contents of the
      * layout will be traversed to produce an identically-nested grouping of
      * keys in the DOM tree. All strings will be transformed into their
      * corresponding sets of keys, while all objects and arrays will be
      * transformed into named groups and anonymous groups respectively. Any
      * numbers present will be transformed into gaps of that size, scaled
      * according to the same units as each key.
      */
    var layout: Layout
    
    /**
      * The type of keyboard layout, such as "qwerty". This property is for
      * informational purposes only, and does not conform to any standard.
      */
    var `type`: String
    
    /**
      * The width of the entire keyboard, in arbitrary units. The width of each
      * key is relative to this width, as both width values are assumed to be in
      * the same units. The conversion factor between these units and pixels is
      * derived later via a call to resize() on the Guacamole.OnScreenKeyboard.
      */
    var width: Double
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
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyWidths(value: Record[String, Double]): Self = StObject.set(x, "keyWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Record[String, Double | String | Key | js.Array[Key]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
