package typings.graphqlToolsSchema.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def log(error: Error): Unit
}

object ILogger {
  @scala.inline
  def apply(log: Error => Unit): ILogger = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[ILogger]
  }
}

