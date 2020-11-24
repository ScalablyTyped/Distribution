package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  
  @JSName("Delay")
  def Delay_(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
  
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = js.native
}
