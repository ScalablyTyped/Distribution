package typings.jestUtil

import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCyclicCopyMod {
  
  @JSImport("jest-util/build/deepCyclicCopy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def default[T](value: T, options: Unit, cycles: WeakMap[js.Any, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def default[T](value: T, options: DeepCyclicCopyOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def default[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[js.Any, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait DeepCyclicCopyOptions extends StObject {
    
    var blacklist: js.UndefOr[Set[String]] = js.undefined
    
    var keepPrototype: js.UndefOr[Boolean] = js.undefined
  }
  object DeepCyclicCopyOptions {
    
    @scala.inline
    def apply(): DeepCyclicCopyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepCyclicCopyOptions]
    }
    
    @scala.inline
    implicit class DeepCyclicCopyOptionsMutableBuilder[Self <: DeepCyclicCopyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: Set[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setKeepPrototype(value: Boolean): Self = StObject.set(x, "keepPrototype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepPrototypeUndefined: Self = StObject.set(x, "keepPrototype", js.undefined)
    }
  }
}
