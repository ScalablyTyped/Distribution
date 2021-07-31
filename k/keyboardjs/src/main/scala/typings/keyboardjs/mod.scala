package typings.keyboardjs

import typings.std.Document
import typings.std.HTMLFormElement
import typings.std.KeyboardEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def bind(keyCombo: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Null, released: Unit, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Null, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Null, released: Callback, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Callback, released: Unit, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Callback, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: String, pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Null, released: Unit, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Null, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Null, released: Callback, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Unit, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any], preventRepeatByDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns the context KeyboardJS currently operates in.
    */
  @scala.inline
  def getContext(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[String]
  
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
  @scala.inline
  def pause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[Unit]
  
  // ---------- Virtual Key Press ---------- //
  /**
    * Triggers a key press. Stays in pressed state until released.
    * @param keyCombo String of keys or keyCode to be pressed to execute 'pressed' callbacks.
    * @param event The KeyEvent, can be null.
    */
  @scala.inline
  def pressKey(keyCombo: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pressKey")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def pressKey(keyCombo: String, event: KeyEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pressKey")(keyCombo.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pressKey(keyCombo: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pressKey")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def pressKey(keyCombo: Double, event: KeyEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pressKey")(keyCombo.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Releases all keys.
    */
  @scala.inline
  def releaseAllKeys(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseAllKeys")().asInstanceOf[Unit]
  
  /**
    * Triggers a key release.
    * @param keyCombo String of keys or keyCode to be released to execute 'released' callbacks.
    * @param event The KeyEvent, can be null.
    */
  @scala.inline
  def releaseKey(keyCombo: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseKey")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def releaseKey(keyCombo: String, event: KeyEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseKey")(keyCombo.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def releaseKey(keyCombo: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseKey")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def releaseKey(keyCombo: Double, event: KeyEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseKey")(keyCombo.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  /**
    * The keyboard will once again trigger bindings.
    */
  @scala.inline
  def resume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[Unit]
  
  // ---------- Context ---------- //
  /**
    * Sets the context KeyboardJS operates in. Default is global context.
    * Bindings in global context will execute in all contexts.
    * @param identifier The name of the context. If the context doesn't exists, it will be created.
    * Use 'global' to switch to global context.
    */
  @scala.inline
  def setContext(identifier: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(identifier.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Detaches KeyboardJS from the window and document/element
    */
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  /**
    * Unbinds a keyCombo completely or only specific pressed & released callback combos.
    * @param keyCombo String of keys to be pressed to execute callbacks.
    * @param pressed Callback that gets executed when the keyComboState is 'pressed', can be null.
    * @param released Callback that gets executed when the keyComboState is 'released', can be null.
    */
  @scala.inline
  def unbind(keyCombo: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: String, pressed: Null, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: String, pressed: Unit, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: String, pressed: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: String, pressed: Callback, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: js.Array[String], pressed: Null, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: js.Array[String], pressed: Unit, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: js.Array[String], pressed: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unbind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(keyCombo.asInstanceOf[js.Any], pressed.asInstanceOf[js.Any], released.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // ---------- Attachment ---------- //
  /**
    * Attaches keyboardJS a specific window and a specific document or form.
    * @param myWin The window to attach to.
    * @param myDoc The document or form to attach to.
    */
  @scala.inline
  def watch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")().asInstanceOf[Unit]
  /**
    * Attaches keyboardJS to the current window and a specific document or form.
    * @param myDoc The document or form to attach to.
    */
  @scala.inline
  def watch(myDoc: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myDoc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def watch(myDoc: HTMLFormElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myDoc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def watch(myWin: Unit, myDoc: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myWin.asInstanceOf[js.Any], myDoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def watch(myWin: Unit, myDoc: HTMLFormElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myWin.asInstanceOf[js.Any], myDoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def watch(myWin: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myWin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def watch(myWin: Window, myDoc: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myWin.asInstanceOf[js.Any], myDoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def watch(myWin: Window, myDoc: HTMLFormElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(myWin.asInstanceOf[js.Any], myDoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Executes a Callback without loosing the current context.
    * @param identifier The name of the context the callback should be in. If the context doesn't exists, it will be created.
    * @param inContextCallBack The callback function. Will be executed in the given context.
    */
  @scala.inline
  def withContext(identifier: String, inContextCallBack: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withContext")(identifier.asInstanceOf[js.Any], inContextCallBack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Callback function when a keyCombo is triggered.
    * @see KeyEvent
    */
  type Callback = js.Function1[/* event */ js.UndefOr[KeyEvent], Unit]
  
  /**
    * Information and functions in the current callback.
    */
  @js.native
  trait KeyEvent
    extends StObject
       with KeyboardEvent {
    
    var pressedKeys: js.Array[String] = js.native
    
    def preventRepeat(): Unit = js.native
  }
}
