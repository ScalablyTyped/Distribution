package typings.lodashDecorators

import typings.lodashDecorators.commonMod.LodashDecorator
import typings.lodashDecorators.sharedMod.DebounceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("lodash-decorators/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(args: js.Any*): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def Debounce_(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")().asInstanceOf[LodashDecorator]
  @scala.inline
  def Debounce_(wait: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  @scala.inline
  def Debounce_(wait: Double, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  @scala.inline
  def Debounce_(wait: Unit, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  
  @scala.inline
  def debounce(): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")().asInstanceOf[LodashDecorator]
  @scala.inline
  def debounce(wait: Double): LodashDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any]).asInstanceOf[LodashDecorator]
  @scala.inline
  def debounce(wait: Double, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
  @scala.inline
  def debounce(wait: Unit, options: DebounceOptions): LodashDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LodashDecorator]
}
