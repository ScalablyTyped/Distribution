package typings.lodashDashDecorators

import typings.lodashDashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/overArgs", JSImport.Namespace)
@js.native
object overArgsMod extends js.Object {
  def OverArgs(transforms: js.Function*): LodashMethodDecorator = js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
}

