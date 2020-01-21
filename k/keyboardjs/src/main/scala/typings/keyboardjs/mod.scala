package typings.keyboardjs

import typings.std.Document_
import typings.std.HTMLFormElement
import typings.std.KeyboardEvent
import typings.std.Window_
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
  
  def bind(keyCombo: String, pressed: Callback): Unit = js.native
  def bind(keyCombo: String, pressed: Callback, released: Callback): Unit = js.native
  def bind(keyCombo: String, pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Callback): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = js.native
  def bind(keyCombo: js.Array[String], pressed: Callback, released: Callback, preventRepeatByDefault: Boolean): Unit = js.native
  def getContext(): String = js.native
  def pause(): Unit = js.native
  def pressKey(keyCombo: String): Unit = js.native
  def pressKey(keyCombo: String, event: KeyEvent): Unit = js.native
  def pressKey(keyCombo: Double): Unit = js.native
  def pressKey(keyCombo: Double, event: KeyEvent): Unit = js.native
  def releaseAllKeys(): Unit = js.native
  def releaseKey(keyCombo: String): Unit = js.native
  def releaseKey(keyCombo: String, event: KeyEvent): Unit = js.native
  def releaseKey(keyCombo: Double): Unit = js.native
  def releaseKey(keyCombo: Double, event: KeyEvent): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def setContext(identifier: String): Unit = js.native
  def stop(): Unit = js.native
  def unbind(keyCombo: String): Unit = js.native
  def unbind(keyCombo: String, pressed: Callback): Unit = js.native
  def unbind(keyCombo: String, pressed: Callback, released: Callback): Unit = js.native
  def unbind(keyCombo: js.Array[String]): Unit = js.native
  def unbind(keyCombo: js.Array[String], pressed: Callback): Unit = js.native
  def unbind(keyCombo: js.Array[String], pressed: Callback, released: Callback): Unit = js.native
  def watch(): Unit = js.native
  def watch(myDoc: Document_): Unit = js.native
  def watch(myDoc: HTMLFormElement): Unit = js.native
  def watch(myWin: Window_, myDoc: Document_): Unit = js.native
  def watch(myWin: Window_, myDoc: HTMLFormElement): Unit = js.native
  def withContext(identifier: String, inContextCallBack: js.Function0[Unit]): Unit = js.native
  /**
    * Callback function when a keyCombo is triggered.
    * @see KeyEvent
    */
  type Callback = js.Function1[/* e */ js.UndefOr[KeyEvent], Unit]
}

