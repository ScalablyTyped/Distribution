package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overArgsMod {
  
  @JSImport("lodash-decorators/overArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: js.Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def OverArgs_(transforms: js.Function*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("OverArgs")(transforms.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  inline def overArgs(transforms: js.Function*): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("overArgs")(transforms.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
}
