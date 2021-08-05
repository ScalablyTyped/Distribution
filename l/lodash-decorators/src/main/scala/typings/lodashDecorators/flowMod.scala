package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  @JSImport("lodash-decorators/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def Flow_(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Flow")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def flow(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
