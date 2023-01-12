package typings.keymaster

import org.scalablytyped.runtime.Shortcut
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("keymaster", JSImport.Namespace)
  @js.native
  val ^ : Keymaster = js.native
  
  @js.native
  trait FilterEvent
    extends StObject
       with EventTarget {
    
    var srcElement: HTMLElement | Null = js.native
    
    var target: HTMLElement | Null = js.native
  }
  
  trait Handler extends StObject {
    
    var key: String
    
    def method(keyboardEvent: KeyboardEvent, handler: Handler): Boolean | Unit
    @JSName("method")
    var method_Original: KeyHandler
    
    var mods: js.Array[Double]
    
    /**
      * The scope (or `all`).
      */
    var scope: String
    
    /**
      * The shortcut used, e.g. `ctrl+r`.
      */
    var shortcut: String
  }
  object Handler {
    
    inline def apply(
      key: String,
      method: (/* keyboardEvent */ KeyboardEvent, /* handler */ Handler) => Boolean | Unit,
      mods: js.Array[Double],
      scope: String,
      shortcut: String
    ): Handler = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = js.Any.fromFunction2(method), mods = mods.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: (/* keyboardEvent */ KeyboardEvent, /* handler */ Handler) => Boolean | Unit): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
      
      inline def setMods(value: js.Array[Double]): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
      
      inline def setModsVarargs(value: Double*): Self = StObject.set(x, "mods", js.Array(value*))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyHandler = js.Function2[/* keyboardEvent */ KeyboardEvent, /* handler */ Handler, Boolean | Unit]
  
  @js.native
  trait Keymaster extends StObject {
    
    /**
      * Defines a shortcut.
      *
      * Keymaster understands the following modifiers:
      * `⇧`, `shift`, `option`, `⌥`, `alt`, `ctrl`, `control`, `command`, and `⌘`.
      *
      * The following special keys can be used for shortcuts:
      * `backspace`, `tab`, `clear`, `enter`, `return`, `esc`, `escape`, `space`,
      * `up`, `down`, `left`, `right`, `home`, `end`, `pageup`, `pagedown`, `del`, `delete`
      * and `f1` through `f19`.
      *
      * @example
      * import key = require('keymaster');
      *
      * // define short of 'a'
      * key('a', () => alert('you pressed a!'));
      *
      * // returning false stops the event and prevents default browser events
      * key('ctrl+r', () => {
      *     alert('stopped reload!');
      *     return false;
      * });
      *
      * // multiple shortcuts that do the same thing
      * key('⌘+r, ctrl+r', () => {});
      *
      * // define shortcuts with a scope
      * key('o, enter', 'issues', () => {});
      * key('o, enter', 'files', () => {});
      */
    def apply(key: String, callback: KeyHandler): Unit = js.native
    def apply(key: String, scope: String, callback: KeyHandler): Unit = js.native
    
    @JSName("\u2325")
    var Optionkey: Boolean = js.native
    
    @JSName("\u2318")
    var Placeofinterestsign: Boolean = js.native
    
    @JSName("\u2303")
    var Uparrowhead: Boolean = js.native
    
    @JSName("\u21E7")
    var Upwardswhitearrow: Boolean = js.native
    
    var alt: Boolean = js.native
    
    var command: Boolean = js.native
    
    var control: Boolean = js.native
    
    var ctrl: Boolean = js.native
    
    /**
      * Remove all events that are set in a scope.
      *
      * @example
      * key.deleteScope('issues');
      */
    def deleteScope(scopeName: String): Unit = js.native
    
    /**
      * By default, when an `INPUT`, `SELECT` or `TEXTAREA` element is focused,
      * Keymaster doesn't process any shortcuts.
      *
      * You can change this by overwriting `key.filter` with a new function.
      * This function is called before Keymaster processes shortcuts.
      *
      * If your function returns false, then the no shortcuts will be processed.
      *
      * Here's the default implementation for reference:
      *
      * ```ts
      * function filter(event: KeyboardEvent) {
      *     const tagName = event.target!.tagName;
      *     return !(tagName === "INPUT" || tagName === "SELECT" || tagName === "TEXTAREA");
      * }
      * ```
      *
      * If you only want _some_ shortcuts to work while in an input element, you
      * can change the scope in the `key.filter` function. Below is an example
      * implementation, setting the scope to either `'input'` or `'other'`.
      * Don't forget to return `true` so the any shortcuts get processed.
      *
      * However a more robust way to handle this is to use proper
      * focus and blur event handlers on your input element, and change scopes there as you see fit.
      *
      * @example
      * key.filter = (event) => {
      *   const tagName = event.target!.tagName;
      *   key.setScope(/^(INPUT|TEXTAREA|SELECT)$/.test(tagName) ? 'input' : 'other');
      *   return true;
      * }
      */
    def filter(event: FilterEvent): Boolean = js.native
    
    /**
      * @returns The key codes currently pressed.
      */
    def getPressedKeyCodes(): js.Array[Double] = js.native
    
    /**
      * @returns The current scope.
      */
    def getScope(): String = js.native
    
    def isPressed(keyCode: String): Boolean = js.native
    /**
      * At any point in time (even in code other than key shortcut handlers),
      * you can query the `key` object for the state of any key. This
      * is very helpful for game development using a game loop. For example,
      * `key.isPressed(77)` is `true` if the M key is currently pressed.
      *
      * @example
      * if (key.isPressed('M')) {
      *     alert('M key is pressed, can ya believe it!?');
      * }
      * if (key.isPressed(77)) {
      *     alert('M key is pressed, can ya believe it!?');
      * }
      */
    def isPressed(keyCode: Double): Boolean = js.native
    
    /**
      * Removes the `key` function from global scope and restore whatever
      * `key` was defined to before Keymaster was loaded.
      *
      * @returns The Keymaster `key` function.
      *
      * @example
      * const keymaster = key.noConflict();
      * keymaster('a', () => {});
      *
      * key()
      * // --> TypeError: 'undefined' is not a function
      */
    def noConflict(): Keymaster = js.native
    
    var option: Boolean = js.native
    
    /**
      * Set the scope if you want to reuse the same shortcut for separate
      * areas in your single page app.
      *
      * @example
      * // set the scope (only 'all' and 'issues' shortcuts will be honored)
      * key.setScope('issues'); // default scope is 'all'
      */
    def setScope(): Unit = js.native
    def setScope(scopeName: String): Unit = js.native
    
    /**
      * At any point in time (even in code other than key shortcut handlers),
      * you can query the `key` object for the state of any keys. This
      * allows easy implementation of things like shift+click handlers. For example,
      * `key.shift` is `true` if the shift key is currently pressed.
      *
      * @example
      * if (key.shift) {
      *     alert('shift is pressed, OMGZ!');
      * }
      */
    var shift: Boolean = js.native
    
    /**
      * Shortcuts can be unbound with this method.
      *
      * @example
      * // unbind 'a' handler
      * key.unbind('a');
      *
      * // unbind a key only for a single scope
      * // when no scope is specified it defaults to the current scope (key.getScope())
      * key.unbind('o, enter', 'issues');
      * key.unbind('o, enter', 'files');
      */
    def unbind(key: String): Unit = js.native
    def unbind(key: String, scopeName: String): Unit = js.native
  }
  
  type _To = Keymaster
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Keymaster = ^
}
