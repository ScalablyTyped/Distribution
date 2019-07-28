package typings.graphqlDashTools.distInterfacesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogger extends js.Object {
  def log(message: String): Unit = js.native
  def log(message: Error): Unit = js.native
}

