package typings
package gtagDotJsLib.GtagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gtag extends js.Object {
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.config, targetId: java.lang.String): scala.Unit = js.native
  def apply(
    command: gtagDotJsLib.gtagDotJsLibStrings.config,
    targetId: java.lang.String,
    config: ControlParams
  ): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.config, targetId: java.lang.String, config: CustomParams): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.config, targetId: java.lang.String, config: EventParams): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.event, eventName: EventNames): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.event, eventName: EventNames, eventParams: ControlParams): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.event, eventName: EventNames, eventParams: CustomParams): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.event, eventName: EventNames, eventParams: EventParams): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.event, eventName: java.lang.String): scala.Unit = js.native
  def apply(
    command: gtagDotJsLib.gtagDotJsLibStrings.event,
    eventName: java.lang.String,
    eventParams: ControlParams
  ): scala.Unit = js.native
  def apply(
    command: gtagDotJsLib.gtagDotJsLibStrings.event,
    eventName: java.lang.String,
    eventParams: CustomParams
  ): scala.Unit = js.native
  def apply(
    command: gtagDotJsLib.gtagDotJsLibStrings.event,
    eventName: java.lang.String,
    eventParams: EventParams
  ): scala.Unit = js.native
  def apply(command: gtagDotJsLib.gtagDotJsLibStrings.set, config: CustomParams): scala.Unit = js.native
}

