package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterMod {
  
  @JSImport("lodash-decorators/after", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def After_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("After")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def after(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
