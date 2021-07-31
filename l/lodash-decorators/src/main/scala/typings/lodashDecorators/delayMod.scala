package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashMethodDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("lodash-decorators/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(args: js.Any*): MethodDecorator & PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator & PropertyDecorator]
  
  @scala.inline
  def Delay_(wait: Double, args: js.Any*): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Delay")(wait.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
  
  @scala.inline
  def delay(wait: Double, args: js.Any*): LodashMethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(wait.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[LodashMethodDecorator]
}
