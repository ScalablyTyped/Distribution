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
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def Partial_(partials: Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Partial")(partials.asInstanceOf[Seq[js.Any]]*).asInstanceOf[PropertyDecorator]
  
  inline def partial(partials: Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(partials.asInstanceOf[Seq[js.Any]]*).asInstanceOf[PropertyDecorator]
}
