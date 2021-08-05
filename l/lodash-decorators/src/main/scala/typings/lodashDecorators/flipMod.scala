package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flipMod {
  
  @JSImport("lodash-decorators/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def Flip_(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")().asInstanceOf[LodashDecorator]
  inline def Flip_(fn: ResolvableFunction): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Flip")(fn.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def flip(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[LodashDecorator]
  inline def flip(fn: ResolvableFunction): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(fn.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
