package typings.humaneDashJs.humaneDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnLogFunction extends js.Object {
  def apply(message: logMessage): Humane = js.native
  def apply(message: logMessage, callback: completionCallback): Humane = js.native
  def apply(message: logMessage, callback: completionCallback, options: HumaneMessageOptions): Humane = js.native
  def apply(message: logMessage, options: HumaneMessageOptions): Humane = js.native
}

