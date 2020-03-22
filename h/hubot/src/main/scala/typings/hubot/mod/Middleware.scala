package typings.hubot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Middleware")
@js.native
class Middleware[T /* <: Adapter */] protected () extends js.Object {
  def this(robot: Robot[T]) = this()
  var stack: js.Array[MiddlewareHandler[T]] = js.native
  def execute(context: MiddlewareContext[T], next: NextFunction, done: DoneFunction): Unit = js.native
  def register(middleware: MiddlewareHandler[T]): Unit = js.native
}

