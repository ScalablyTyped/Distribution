package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aryMod {
  
  @JSImport("lodash-decorators/ary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  inline def Ary_(n: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Ary")(n.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
  
  inline def ary(n: Double): LodashMethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ary")(n.asInstanceOf[js.Any]).asInstanceOf[LodashMethodDecorator]
}
