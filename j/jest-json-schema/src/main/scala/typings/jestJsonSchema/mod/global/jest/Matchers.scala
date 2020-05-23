package typings.jestJsonSchema.mod.global.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toBeValidSchema(): R
  def toMatchSchema(schema: js.Object): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toBeValidSchema: () => R, toMatchSchema: js.Object => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toBeValidSchema = js.Any.fromFunction0(toBeValidSchema), toMatchSchema = js.Any.fromFunction1(toMatchSchema))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

