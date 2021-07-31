package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeMod {
  
  @JSImport("lodash-decorators/before", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def Before_(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Before")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def before(n: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(n.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
}
