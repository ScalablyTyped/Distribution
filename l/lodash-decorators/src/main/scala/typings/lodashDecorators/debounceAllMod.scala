package typings.lodashDecorators

import typings.lodashDecorators.factoryCommonMod.LodashMethodDecorator
import typings.lodashDecorators.sharedMod.DebounceOptions
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceAllMod {
  
  @JSImport("lodash-decorators/debounceAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def DebounceAll_(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")().asInstanceOf[LodashMethodDecorator]
  inline def DebounceAll_(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def DebounceAll_(wait: Double, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def DebounceAll_(wait: Unit, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("DebounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  inline def debounceAll(): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")().asInstanceOf[LodashMethodDecorator]
  inline def debounceAll(wait: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  inline def debounceAll(wait: Double, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  inline def debounceAll(wait: Unit, options: DebounceOptions): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceAll")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
}
