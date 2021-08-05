package typings.lodashDecorators

import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialMod {
  
  @JSImport("lodash-decorators/partial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: js.Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def Partial_(partials: js.Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Partial")(partials.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def partial(partials: js.Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(partials.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
