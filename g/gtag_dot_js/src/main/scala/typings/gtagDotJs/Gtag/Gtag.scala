package typings.gtagDotJs.Gtag

import typings.gtagDotJs.gtagDotJsStrings.JS
import typings.gtagDotJs.gtagDotJsStrings.config
import typings.gtagDotJs.gtagDotJsStrings.event
import typings.gtagDotJs.gtagDotJsStrings.set
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gtag extends js.Object {
  def apply(command: JS, config: Date): Unit = js.native
  def apply(command: config, targetId: String): Unit = js.native
  def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
  def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
  def apply(command: config, targetId: String, config: EventParams): Unit = js.native
  def apply(command: event, eventName: String): Unit = js.native
  def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  def apply(command: event, eventName: EventNames): Unit = js.native
  def apply(command: event, eventName: EventNames, eventParams: ControlParams): Unit = js.native
  def apply(command: event, eventName: EventNames, eventParams: CustomParams): Unit = js.native
  def apply(command: event, eventName: EventNames, eventParams: EventParams): Unit = js.native
  def apply(command: set, config: CustomParams): Unit = js.native
}

