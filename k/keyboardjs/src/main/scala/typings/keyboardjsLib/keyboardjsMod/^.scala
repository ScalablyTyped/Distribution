package typings
package keyboardjsLib.keyboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keyboardjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bind(keyCombo: java.lang.String, pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback): scala.Unit = js.native
  def bind(
    keyCombo: java.lang.String,
    pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    released: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback
  ): scala.Unit = js.native
  def bind(
    keyCombo: java.lang.String,
    pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    released: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    preventRepeatByDefault: scala.Boolean
  ): scala.Unit = js.native
  def bind(keyCombo: js.Array[java.lang.String], pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback): scala.Unit = js.native
  def bind(
    keyCombo: js.Array[java.lang.String],
    pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    released: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback
  ): scala.Unit = js.native
  def bind(
    keyCombo: js.Array[java.lang.String],
    pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    released: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    preventRepeatByDefault: scala.Boolean
  ): scala.Unit = js.native
  def getContext(): java.lang.String = js.native
  def pause(): scala.Unit = js.native
  def pressKey(keyCombo: java.lang.String): scala.Unit = js.native
  def pressKey(keyCombo: java.lang.String, event: keyboardjsLib.keyboardjsMod.keyboardjsNs.KeyEvent): scala.Unit = js.native
  def pressKey(keyCombo: scala.Double): scala.Unit = js.native
  def pressKey(keyCombo: scala.Double, event: keyboardjsLib.keyboardjsMod.keyboardjsNs.KeyEvent): scala.Unit = js.native
  def releaseAllKeys(): scala.Unit = js.native
  def releaseKey(keyCombo: java.lang.String): scala.Unit = js.native
  def releaseKey(keyCombo: java.lang.String, event: keyboardjsLib.keyboardjsMod.keyboardjsNs.KeyEvent): scala.Unit = js.native
  def releaseKey(keyCombo: scala.Double): scala.Unit = js.native
  def releaseKey(keyCombo: scala.Double, event: keyboardjsLib.keyboardjsMod.keyboardjsNs.KeyEvent): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def setContext(identifier: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def unbind(keyCombo: java.lang.String): scala.Unit = js.native
  def unbind(keyCombo: java.lang.String, pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback): scala.Unit = js.native
  def unbind(
    keyCombo: java.lang.String,
    pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    released: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback
  ): scala.Unit = js.native
  def unbind(keyCombo: js.Array[java.lang.String]): scala.Unit = js.native
  def unbind(keyCombo: js.Array[java.lang.String], pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback): scala.Unit = js.native
  def unbind(
    keyCombo: js.Array[java.lang.String],
    pressed: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback,
    released: keyboardjsLib.keyboardjsMod.keyboardjsNs.Callback
  ): scala.Unit = js.native
  def watch(): scala.Unit = js.native
  def watch(myDoc: stdLib.Document): scala.Unit = js.native
  def watch(myDoc: stdLib.HTMLFormElement): scala.Unit = js.native
  def watch(myWin: stdLib.Window, myDoc: stdLib.Document): scala.Unit = js.native
  def watch(myWin: stdLib.Window, myDoc: stdLib.HTMLFormElement): scala.Unit = js.native
  def withContext(identifier: java.lang.String, inContextCallBack: js.Function0[scala.Unit]): scala.Unit = js.native
}

