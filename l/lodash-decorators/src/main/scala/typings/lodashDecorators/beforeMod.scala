package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lodash-decorators/before", JSImport.Namespace)
@js.native
object beforeMod extends js.Object {
  
  @JSName("Before")
  def Before_(n: Double): LodashDecorator = js.native
  
  def before(n: Double): LodashDecorator = js.native
  
  def default(args: js.Any*): LodashDecorator = js.native
}
