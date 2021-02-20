package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapMod {
  
  @JSImport("lodash-decorators/wrap", JSImport.Default)
  @js.native
  def default(args: js.Any*): MethodDecorator with PropertyDecorator = js.native
  
  @JSImport("lodash-decorators/wrap", "Wrap")
  @js.native
  def Wrap_(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators/wrap", "Wrap")
  @js.native
  def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
  
  @JSImport("lodash-decorators/wrap", "wrap")
  @js.native
  def wrap(): LodashMethodDecorator = js.native
  @JSImport("lodash-decorators/wrap", "wrap")
  @js.native
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = js.native
}
