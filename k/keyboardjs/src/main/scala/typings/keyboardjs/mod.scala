package typings.keyboardjs

import typings.std.Document
import typings.std.HTMLFormElement
import typings.std.KeyboardEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keyboardjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("keyboardjs", "addListener")
  @js.native
  def addListener: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  @scala.inline
  def addListener_=(
    x: js.Function4[
      /* keyCombo */ String | js.Array[String], 
      /* pressed */ Callback | Null, 
      /* released */ js.UndefOr[Callback], 
      /* preventRepeatByDefault */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addListener")(x.asInstanceOf[js.Any])
  
  // ---------- Key Binding ---------- //
  /**
    * Binds a keyCombo to specific callback functions.
    * @param keyCombo String of keys to be pressed to execute callbacks.
    * @param pressed Callback that gets executed when the keyComboState is 'pressed', can be null.
    * @param released Callback that gets executed when the keyComboState is 'released'
    * @param preventRepeatByDefault Whether or not to prevent repeat by default. Defaults to false.
    */
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: String): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(
    keyCombo: String,
    pressed: Null,
    released: js.UndefOr[scala.Nothing],
    preventRepeatByDefault: Boolean
  ): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: String, pressed: Null, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: String, pressed: Null, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: String, pressed: Callback): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(
    keyCombo: String,
    pressed: Callback,
    released: js.UndefOr[scala.Nothing],
    preventRepeatByDefault: Boolean
  ): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: String, pressed: Callback, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: String, pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: js.Array[String]): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(
    keyCombo: js.Array[String],
    pressed: Null,
    released: js.UndefOr[scala.Nothing],
    preventRepeatByDefault: Boolean
  ): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: js.Array[String], pressed: Null, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: js.Array[String], pressed: Null, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: js.Array[String], pressed: Callback): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(
    keyCombo: js.Array[String],
    pressed: Callback,
    released: js.UndefOr[scala.Nothing],
    preventRepeatByDefault: Boolean
  ): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "bind")
  @js.native
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  
  /**
    * Returns the context KeyboardJS currently operates in.
    */
  @JSImport("keyboardjs", "getContext")
  @js.native
  def getContext(): String = js.native
  
  @JSImport("keyboardjs", "off")
  @js.native
  def off: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  @scala.inline
  def off_=(
    x: js.Function4[
      /* keyCombo */ String | js.Array[String], 
      /* pressed */ Callback | Null, 
      /* released */ js.UndefOr[Callback], 
      /* preventRepeatByDefault */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("off")(x.asInstanceOf[js.Any])
  
  @JSImport("keyboardjs", "on")
  @js.native
  def on: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  @scala.inline
  def on_=(
    x: js.Function4[
      /* keyCombo */ String | js.Array[String], 
      /* pressed */ Callback | Null, 
      /* released */ js.UndefOr[Callback], 
      /* preventRepeatByDefault */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("on")(x.asInstanceOf[js.Any])
  
  // ---------- KeyboardJS Control ---------- //
  /**
    * The keyboard will no longer trigger bindings.
    */
  @JSImport("keyboardjs", "pause")
  @js.native
  def pause(): Unit = js.native
  
  // ---------- Virtual Key Press ---------- //
  /**
    * Triggers a key press. Stays in pressed state until released.
    * @param keyCombo String of keys or keyCode to be pressed to execute 'pressed' callbacks.
    * @param event The KeyEvent, can be null.
    */
  @JSImport("keyboardjs", "pressKey")
  @js.native
  def pressKey(keyCombo: String): Unit = js.native
  @JSImport("keyboardjs", "pressKey")
  @js.native
  def pressKey(keyCombo: String, event: KeyEvent): Unit = js.native
  @JSImport("keyboardjs", "pressKey")
  @js.native
  def pressKey(keyCombo: Double): Unit = js.native
  @JSImport("keyboardjs", "pressKey")
  @js.native
  def pressKey(keyCombo: Double, event: KeyEvent): Unit = js.native
  
  /**
    * Releases all keys.
    */
  @JSImport("keyboardjs", "releaseAllKeys")
  @js.native
  def releaseAllKeys(): Unit = js.native
  
  /**
    * Triggers a key release.
    * @param keyCombo String of keys or keyCode to be released to execute 'released' callbacks.
    * @param event The KeyEvent, can be null.
    */
  @JSImport("keyboardjs", "releaseKey")
  @js.native
  def releaseKey(keyCombo: String): Unit = js.native
  @JSImport("keyboardjs", "releaseKey")
  @js.native
  def releaseKey(keyCombo: String, event: KeyEvent): Unit = js.native
  @JSImport("keyboardjs", "releaseKey")
  @js.native
  def releaseKey(keyCombo: Double): Unit = js.native
  @JSImport("keyboardjs", "releaseKey")
  @js.native
  def releaseKey(keyCombo: Double, event: KeyEvent): Unit = js.native
  
  @JSImport("keyboardjs", "removeListener")
  @js.native
  def removeListener: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  @scala.inline
  def removeListener_=(
    x: js.Function4[
      /* keyCombo */ String | js.Array[String], 
      /* pressed */ Callback | Null, 
      /* released */ js.UndefOr[Callback], 
      /* preventRepeatByDefault */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(x.asInstanceOf[js.Any])
  
  /**
    * All active bindings will released and unbound.
    */
  @JSImport("keyboardjs", "reset")
  @js.native
  def reset(): Unit = js.native
  
  /**
    * The keyboard will once again trigger bindings.
    */
  @JSImport("keyboardjs", "resume")
  @js.native
  def resume(): Unit = js.native
  
  // ---------- Context ---------- //
  /**
    * Sets the context KeyboardJS operates in. Default is global context.
    * Bindings in global context will execute in all contexts.
    * @param identifier The name of the context. If the context doesn't exists, it will be created.
    * Use 'global' to switch to global context.
    */
  @JSImport("keyboardjs", "setContext")
  @js.native
  def setContext(identifier: String): Unit = js.native
  
  /**
    * Detaches KeyboardJS from the window and document/element
    */
  @JSImport("keyboardjs", "stop")
  @js.native
  def stop(): Unit = js.native
  
  /**
    * Unbinds a keyCombo completely or only specific pressed & released callback combos.
    * @param keyCombo String of keys to be pressed to execute callbacks.
    * @param pressed Callback that gets executed when the keyComboState is 'pressed', can be null.
    * @param released Callback that gets executed when the keyComboState is 'released', can be null.
    */
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: String): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: String, pressed: js.UndefOr[scala.Nothing], released: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: String, pressed: Null, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: String, pressed: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: String, pressed: Callback, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: js.Array[String]): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: js.Array[String], pressed: js.UndefOr[scala.Nothing], released: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: js.Array[String], pressed: Null, released: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: js.Array[String], pressed: Callback): Unit = js.native
  @JSImport("keyboardjs", "unbind")
  @js.native
  def unbind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = js.native
  
  // ---------- Attachment ---------- //
  /**
    * Attaches keyboardJS a specific window and a specific document or form.
    * @param myWin The window to attach to.
    * @param myDoc The document or form to attach to.
    */
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(): Unit = js.native
  /**
    * Attaches keyboardJS to the current window and a specific document or form.
    * @param myDoc The document or form to attach to.
    */
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myDoc: Document): Unit = js.native
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myDoc: HTMLFormElement): Unit = js.native
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myWin: js.UndefOr[scala.Nothing], myDoc: Document): Unit = js.native
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myWin: js.UndefOr[scala.Nothing], myDoc: HTMLFormElement): Unit = js.native
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myWin: Window): Unit = js.native
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myWin: Window, myDoc: Document): Unit = js.native
  @JSImport("keyboardjs", "watch")
  @js.native
  def watch(myWin: Window, myDoc: HTMLFormElement): Unit = js.native
  
  /**
    * Executes a Callback without loosing the current context.
    * @param identifier The name of the context the callback should be in. If the context doesn't exists, it will be created.
    * @param inContextCallBack The callback function. Will be executed in the given context.
    */
  @JSImport("keyboardjs", "withContext")
  @js.native
  def withContext(identifier: String, inContextCallBack: js.Function0[Unit]): Unit = js.native
  
  /**
    * Callback function when a keyCombo is triggered.
    * @see KeyEvent
    */
  type Callback = js.Function1[/* event */ js.UndefOr[KeyEvent], Unit]
  
  /**
    * Information and functions in the current callback.
    */
  @js.native
  trait KeyEvent extends KeyboardEvent {
    
    var pressedKeys: js.Array[String] = js.native
    
    def preventRepeat(): Unit = js.native
  }
}
