package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.jsdevtoolsOnoBooleans.`true`
import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@jsdevtools/ono/esm/stack", "isLazyStack")
  @js.native
  def isLazyStack(): /* is @jsdevtools/ono.@jsdevtools/ono/esm/stack.LazyStack */ Boolean = js.native
  @JSImport("@jsdevtools/ono/esm/stack", "isLazyStack")
  @js.native
  def isLazyStack(stackProp: PropertyDescriptor): /* is @jsdevtools/ono.@jsdevtools/ono/esm/stack.LazyStack */ Boolean = js.native
  
  @JSImport("@jsdevtools/ono/esm/stack", "isWritableStack")
  @js.native
  def isWritableStack(): Boolean = js.native
  @JSImport("@jsdevtools/ono/esm/stack", "isWritableStack")
  @js.native
  def isWritableStack(stackProp: PropertyDescriptor): Boolean = js.native
  
  @JSImport("@jsdevtools/ono/esm/stack", "joinStacks")
  @js.native
  def joinStacks(newError: ErrorLike): js.UndefOr[String] = js.native
  @JSImport("@jsdevtools/ono/esm/stack", "joinStacks")
  @js.native
  def joinStacks(newError: ErrorLike, originalError: ErrorLike): js.UndefOr[String] = js.native
  
  @JSImport("@jsdevtools/ono/esm/stack", "lazyJoinStacks")
  @js.native
  def lazyJoinStacks(lazyStack: LazyStack, newError: ErrorLike): Unit = js.native
  @JSImport("@jsdevtools/ono/esm/stack", "lazyJoinStacks")
  @js.native
  def lazyJoinStacks(lazyStack: LazyStack, newError: ErrorLike, originalError: ErrorLike): Unit = js.native
  
  /**
    * The Property Descriptor of a lazily-computed `stack` property.
    */
  @js.native
  trait LazyStack extends StObject {
    
    var configurable: `true` = js.native
    
    /**
      * Lazily computes the error's stack trace.
      */
    def get(): js.UndefOr[String] = js.native
  }
  object LazyStack {
    
    @scala.inline
    def apply(configurable: `true`, get: () => js.UndefOr[String]): LazyStack = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[LazyStack]
    }
    
    @scala.inline
    implicit class LazyStackMutableBuilder[Self <: LazyStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: `true`): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: () => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
}
