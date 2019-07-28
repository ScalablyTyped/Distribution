package typings.lodashDashDecorators

import typings.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  def Delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
}

