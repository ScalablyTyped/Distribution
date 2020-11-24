package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/flip", JSImport.Namespace)
@js.native
object flipMod extends js.Object {
  
  @JSName("Flip")
  def Flip_(): LodashDecorator = js.native
  @JSName("Flip")
  def Flip_(fn: ResolvableFunction): LodashDecorator = js.native
  
  def default(args: js.Any*): LodashDecorator = js.native
  
  def flip(): LodashDecorator = js.native
  def flip(fn: ResolvableFunction): LodashDecorator = js.native
}
