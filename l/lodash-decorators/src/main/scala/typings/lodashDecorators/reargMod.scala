package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/rearg", JSImport.Namespace)
@js.native
object reargMod extends js.Object {
  
  @JSName("Rearg")
  def Rearg_(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSName("Rearg")
  def Rearg_(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  @JSName("Rearg")
  def Rearg_(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  
  def default(args: js.Any*): LodashDecorator = js.native
  
  def rearg(indexes: js.Array[Double], args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: Double, args: (Double | js.Array[Double])*): LodashDecorator = js.native
  def rearg(indexes: ResolvableFunction, args: (Double | js.Array[Double])*): LodashDecorator = js.native
}
