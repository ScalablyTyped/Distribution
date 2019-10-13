package typings.jestDashJsonDashSchema.jestDashJsonDashSchemaMod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toBeValidSchema(): R
  def toMatchSchema(schema: js.Object): R
}

object Matchers {
  @scala.inline
  def apply[R](toBeValidSchema: () => R, toMatchSchema: js.Object => R): Matchers[R] = {
    val __obj = js.Dynamic.literal(toBeValidSchema = js.Any.fromFunction0(toBeValidSchema), toMatchSchema = js.Any.fromFunction1(toMatchSchema))
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

