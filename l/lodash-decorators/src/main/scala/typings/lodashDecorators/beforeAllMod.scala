package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeAllMod {
  
  @JSImport("lodash-decorators/beforeAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def BeforeAll_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BeforeAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  inline def beforeAll(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAll")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
