package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerManager extends js.Object {
  def add(recogniser: Recognizer): HammerManager = js.native
  def add(recogniser: js.Array[Recognizer]): HammerManager = js.native
  @JSName("add")
  def add_Recognizer(recogniser: Recognizer): Recognizer = js.native
  @JSName("add")
  def add_Recognizer(recogniser: js.Array[Recognizer]): Recognizer = js.native
  def destroy(): scala.Unit = js.native
  def emit(event: java.lang.String, data: js.Any): scala.Unit = js.native
  def get(recogniser: Recognizer): Recognizer = js.native
  def get(recogniser: java.lang.String): Recognizer = js.native
  def off(events: java.lang.String): scala.Unit = js.native
  def off(events: java.lang.String, handler: HammerListener): scala.Unit = js.native
  def on(events: java.lang.String, handler: HammerListener): scala.Unit = js.native
  def recognize(inputData: js.Any): scala.Unit = js.native
  def remove(recogniser: Recognizer): HammerManager = js.native
  def remove(recogniser: java.lang.String): HammerManager = js.native
  def set(options: HammerOptions): HammerManager = js.native
  def stop(force: scala.Boolean): scala.Unit = js.native
}

