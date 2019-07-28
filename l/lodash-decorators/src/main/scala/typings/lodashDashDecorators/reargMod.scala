package typings.lodashDashDecorators

import typings.lodashDashDecorators.factoryCommonMod.LodashDecorator
import typings.lodashDashDecorators.factoryCommonMod.ResolvableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/rearg", JSImport.Namespace)
@js.native
object reargMod extends js.Object {
  def Rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def Rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def Rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def default(args: js.Any*): LodashDecorator = js.native
  def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
}

