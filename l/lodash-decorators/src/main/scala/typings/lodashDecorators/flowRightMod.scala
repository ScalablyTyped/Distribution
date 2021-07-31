package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.commonMod.ResolvableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowRightMod {
  
  @JSImport("lodash-decorators/flowRight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def FlowRight_(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("FlowRight")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def flowRight(fns: ResolvableFunction*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("flowRight")(fns.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
