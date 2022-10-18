package typings.lodashDecorators

import typings.lodashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.lodashDecorators.factoryCommonMod.ResolvableFunction
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapMod {
  
  @JSImport("lodash-decorators/wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def Wrap_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")().asInstanceOf[LodashMethodDecorator]
  inline def Wrap_(fnToWrap: ResolvableFunction): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Wrap")(fnToWrap.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  inline def wrap(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")().asInstanceOf[LodashMethodDecorator]
  inline def wrap(fnToWrap: ResolvableFunction): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fnToWrap.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
}
