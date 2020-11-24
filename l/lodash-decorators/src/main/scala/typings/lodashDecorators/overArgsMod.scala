package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/overArgs", JSImport.Namespace)
@js.native
object overArgsMod extends js.Object {
  
  @JSName("OverArgs")
  def OverArgs_(transforms: js.Function*): LodashMethodDecorator = js.native
  
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  
  def overArgs(transforms: js.Function*): LodashMethodDecorator = js.native
}
