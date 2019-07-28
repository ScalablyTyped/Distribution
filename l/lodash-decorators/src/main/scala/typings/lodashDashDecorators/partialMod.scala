package typings.lodashDashDecorators

import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/partial", JSImport.Namespace)
@js.native
object partialMod extends js.Object {
  def Partial(partials: js.Any*): PropertyDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def partial(partials: js.Any*): PropertyDecorator = js.native
}

