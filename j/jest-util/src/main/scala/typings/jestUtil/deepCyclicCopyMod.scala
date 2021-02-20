package typings.jestUtil

import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCyclicCopyMod {
  
  @JSImport("jest-util/build/deepCyclicCopy", JSImport.Default)
  @js.native
  def default[T](value: T): T = js.native
  @JSImport("jest-util/build/deepCyclicCopy", JSImport.Default)
  @js.native
  def default[T](value: T, options: js.UndefOr[scala.Nothing], cycles: WeakMap[_, _]): T = js.native
  @JSImport("jest-util/build/deepCyclicCopy", JSImport.Default)
  @js.native
  def default[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  @JSImport("jest-util/build/deepCyclicCopy", JSImport.Default)
  @js.native
  def default[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
  
  @js.native
  trait DeepCyclicCopyOptions extends StObject {
    
    var blacklist: js.UndefOr[Set[String]] = js.native
    
    var keepPrototype: js.UndefOr[Boolean] = js.native
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
