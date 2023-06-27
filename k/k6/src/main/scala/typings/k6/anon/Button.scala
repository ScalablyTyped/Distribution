package typings.k6.anon

import typings.k6.experimentalBrowserMod.KeyboardModifier
import typings.k6.experimentalBrowserMod.MouseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  /**
    * The mouse button (`left`, `middle` or `right`) to use during the action.
    * Defaults to `left`.
    */
  var button: js.UndefOr[MouseButton] = js.undefined
  
  /**
    * The number of times the action is performed. Defaults to `1`.
    */
  var clickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Milliseconds to wait between `mousedown` and `mouseup`. Defaults to `0`.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Setting this to `true` will bypass the actionability checks (`visible`,
    * `stable`, `enabled`). Defaults to `false`.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `Alt`, `Control`, `Meta` or `Shift` modifiers keys pressed during the
    * action. If not specified, currently pressed modifiers are used,
    * otherwise defaults to `null`.
    */
  var modifiers: js.UndefOr[js.Array[KeyboardModifier]] = js.undefined
  
  /**
    * If set to `true` and a navigation occurs from performing this action, it
    * will not wait for it to complete. Defaults to `false`.
    */
  var noWaitAfter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A point to use relative to the top left corner of the element. If not
    * supplied, a visible point of the element is used.
    */
  var position: js.UndefOr[X] = js.undefined
  
  /**
    * When `true`, the call requires selector to resolve to a single element.
    * If given selector resolves to more than one element, the call throws
    * an exception. Defaults to `false`.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum time in milliseconds. Defaults to `30` seconds. Default is
    * overridden by the `setDefaultTimeout` option on `BrowserContext` or
    * `page` methods.
    *
    * Setting the value to `0` will disable the timeout.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Setting this to `true` will perform the actionability checks without
    * performing the action. Useful to wait until the element is ready for the
    * action without performing it. Defaults to `false`.
    */
  var trial: js.UndefOr[Boolean] = js.undefined
}
object Button {
  
  inline def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setModifiers(value: js.Array[KeyboardModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: KeyboardModifier*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setNoWaitAfter(value: Boolean): Self = StObject.set(x, "noWaitAfter", value.asInstanceOf[js.Any])
    
    inline def setNoWaitAfterUndefined: Self = StObject.set(x, "noWaitAfter", js.undefined)
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrial(value: Boolean): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    inline def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
  }
}
