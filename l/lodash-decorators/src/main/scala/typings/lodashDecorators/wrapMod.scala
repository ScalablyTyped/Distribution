package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/wrap", JSImport.Namespace)
@js.native
object wrapMod extends js.Object {
  @JSName("Wrap")
  def Wrap_(): LodashMethodDecorator = js.native
  @JSName("Wrap")
  def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def wrap(): LodashMethodDecorator = js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
}

