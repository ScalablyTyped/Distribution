package typings.lodashDecorators

import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialRightMod {
  
  @JSImport("lodash-decorators/partialRight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def PartialRight_(partials: Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("PartialRight")(partials.asInstanceOf[Seq[js.Any]]*).asInstanceOf[PropertyDecorator]
  
  inline def partialRight(partials: Any*): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("partialRight")(partials.asInstanceOf[Seq[js.Any]]*).asInstanceOf[PropertyDecorator]
}
