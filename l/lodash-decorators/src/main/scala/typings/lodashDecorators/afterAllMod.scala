package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterAllMod {
  
  @JSImport("lodash-decorators/afterAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def AfterAll_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AfterAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def afterAll(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("afterAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
