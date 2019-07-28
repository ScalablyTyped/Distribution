package typings.jestDashJsonDashSchema.jestDashJsonDashSchemaMod.Global.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toMatchSchema(schema: js.Object): R
}

object Matchers {
  @scala.inline
  def apply[R](toMatchSchema: js.Object => R): Matchers[R] = {
    val __obj = js.Dynamic.literal(toMatchSchema = js.Any.fromFunction1(toMatchSchema))
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

