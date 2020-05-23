package typings.keyboardjs

import typings.std.Document
import typings.std.HTMLFormElement
import typings.std.KeyboardEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keyboardjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Information and functions in the current callback.
    */
  @js.native
  trait KeyEvent extends KeyboardEvent {
    var pressedKeys: js.Array[String] = js.native
    def preventRepeat(): Unit = js.native
  }
  
  var addListener: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  var off: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  var on: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  var removeListener: js.Function4[
    /* keyCombo */ String | js.Array[String], 
    /* pressed */ Callback | Null, 
    /* released */ js.UndefOr[Callback], 
    /* preventRepeatByDefault */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  def bind(keyCombo: String): Unit = js.native
  def bind(keyCombo: String, pressed: Null, released: Callback): Unit = js.native
  def bind(keyCombo: String, pressed: Null, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  // ---------- Key Binding ---------- //
  /**
    * Binds a keyCombo to specific callback functions.
    * @param keyCombo String of keys to be pressed to execute callbacks.
    * @param pressed Callback that gets executed when the keyComboState is 'pressed', can be null.
    * @param released Callback that gets executed when the keyComboState is 'released'
    * @param preventRepeatByDefault Whether or not to prevent repeat by default. Defaults to false.
    */
  def bind(keyCombo: String, pressed: Callback): Unit = js.native
  def bind(keyCombo: String, pressed: Callback, released: Callback): Unit = js.native
  def bind(keyCombo: String, pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  def bind(keyCombo: js.Array[String]): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Null, released: Callback): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Null, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Callback): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  /**
    * Returns the context KeyboardJS currently operates in.
    */
  def getContext(): String = js.native
  // ---------- KeyboardJS Control ---------- //
  /**
    * The keyboard will no longer trigger bindings.
    */
  def pause(): Unit = js.native
  // ---------- Virtual Key Press ---------- //
  /**
    * Triggers a key press. Stays in pressed state until released.
    * @param keyCombo String of keys or keyCode to be pressed to execute 'pressed' callbacks.
    * @param event The KeyEvent, can be null.
    */
  def pressKey(keyCombo: String): Unit = js.native
  def pressKey(keyCombo: String, event: KeyEvent): Unit = js.native
  def pressKey(keyCombo: Double): Unit = js.native
  def pressKey(keyCombo: Double, event: KeyEvent): Unit = js.native
  /**
    * Releases all keys.
    */
  def releaseAllKeys(): Unit = js.native
  /**
    * Triggers a key release.
    * @param keyCombo String of keys or keyCode to be released to execute 'released' callbacks.
    * @param event The KeyEvent, can be null.
    */
  def releaseKey(keyCombo: String): Unit = js.native
  def releaseKey(keyCombo: String, event: KeyEvent): Unit = js.native
  def releaseKey(keyCombo: Double): Unit = js.native
  def releaseKey(keyCombo: Double, event: KeyEvent): Unit = js.native
  /**
    * All active bindings will released and unbound.
    */
  def reset(): Unit = js.native
  /**
    * The keyboard will once again trigger bindings.
    */
  def resume(): Unit = js.native
  // ---------- Context ---------- //
  /**
    * Sets the context KeyboardJS operates in. Default is global context.
    * Bindings in global context will execute in all contexts.
    * @param identifier The name of the context. If the context doesn't exists, it will be created.
    * Use 'global' to switch to global context.
    */
  def setContext(identifier: String): Unit = js.native
  /**
    * Detaches KeyboardJS from the window and document/element
    */
  def stop(): Unit = js.native
  /**
    * Unbinds a keyCombo completely or only specific pressed & released callback combos.
    * @param keyCombo String of keys to be pressed to execute callbacks.
    * @param pressed Callback that gets executed when the keyComboState is 'pressed', can be null.
    * @param released Callback that gets executed when the keyComboState is 'released', can be null.
    */
  def unbind(keyCombo: String): Unit = js.native
  def unbind(keyCombo: String, pressed: Null, released: Callback): Unit = js.native
  def unbind(keyCombo: String, pressed: Callback): Unit = js.native
  def unbind(keyCombo: String, pressed: Callback, released: Callback): Unit = js.native
  def unbind(keyCombo: js.Array[String]): Unit = js.native
  def unbind(keyCombo: js.Array[String], pressed: Null, released: Callback): Unit = js.native
  def unbind(keyCombo: js.Array[String], pressed: Callback): Unit = js.native
  def unbind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = js.native
  // ---------- Attachment ---------- //
  /**
    * Attaches keyboardJS a specific window and a specific document or form.
    * @param myWin The window to attach to.
    * @param myDoc The document or form to attach to.
    */
  def watch(): Unit = js.native
  /**
    * Attaches keyboardJS to the current window and a specific document or form.
    * @param myDoc The document or form to attach to.
    */
  def watch(myDoc: Document): Unit = js.native
  def watch(myDoc: HTMLFormElement): Unit = js.native
  def watch(myWin: Window): Unit = js.native
  def watch(myWin: Window, myDoc: Document): Unit = js.native
  def watch(myWin: Window, myDoc: HTMLFormElement): Unit = js.native
  /**
    * Executes a Callback without loosing the current context.
    * @param identifier The name of the context the callback should be in. If the context doesn't exists, it will be created.
    * @param inContextCallBack The callback function. Will be executed in the given context.
    */
  def withContext(identifier: String, inContextCallBack: js.Function0[Unit]): Unit = js.native
  /**
    * Callback function when a keyCombo is triggered.
    * @see KeyEvent
    */
  type Callback = js.Function1[/* event */ js.UndefOr[KeyEvent], Unit]
}

