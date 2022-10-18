package typings.lodashDecorators

import typings.lodashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.lodashDecorators.sharedMod.ThrottleOptions
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleAllMod {
  
  @JSImport("lodash-decorators/throttleAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def ThrottleAll_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")().asInstanceOf[LodashMethodDecorator]
  inline def ThrottleAll_(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def ThrottleAll_(wait: Double, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def ThrottleAll_(wait: Unit, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ThrottleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  inline def throttleAll(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")().asInstanceOf[LodashMethodDecorator]
  inline def throttleAll(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def throttleAll(wait: Double, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def throttleAll(wait: Unit, options: ThrottleOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
}
