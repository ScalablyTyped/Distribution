package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapMod {
  
  @JSImport("lodash-decorators/wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(args: js.Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  @scala.inline
  def Wrap_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")().asInstanceOf[LodashMethodDecorator]
  @scala.inline
  def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")(fnToWrap.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  @scala.inline
  def wrap(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")().asInstanceOf[LodashMethodDecorator]
  @scala.inline
  def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fnToWrap.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
}
