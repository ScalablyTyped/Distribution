package typings.lodashDecorators

import typings.lodashDecorators.factoryCommonMod.LodashDecorator
import typings.lodashDecorators.factoryCommonMod.ResolvableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowRightMod {
  
  @JSImport("lodash-decorators/flowRight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def FlowRight_(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("FlowRight")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
  
  inline def flowRight(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flowRight")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[LodashDecorator]
}
