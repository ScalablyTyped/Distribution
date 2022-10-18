package typings.lodashDecorators

import typings.lodashDecorators.factoryCommonMod.LodashDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterMod {
  
  @JSImport("lodash-decorators/after", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def After_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("After")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def after(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
