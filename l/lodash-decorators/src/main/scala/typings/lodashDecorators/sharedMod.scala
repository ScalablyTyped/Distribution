package typings.lodashDecorators

import typings.lodashDecorators.anon.Instantiable
import typings.lodashDecorators.commonMod.ResolvableFunction
import typings.lodashDecorators.factoryMod.DecoratorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @js.native
  trait ApplicateOptions extends StObject {
    
    var args: js.Array[_] = js.native
    
    var config: DecoratorConfig = js.native
    
    var instance: js.UndefOr[js.Object] = js.native
    
    var target: js.Any = js.native
    
    var value: js.Any = js.native
  }
  object ApplicateOptions {
    
    @scala.inline
    def apply(args: js.Array[_], config: DecoratorConfig, target: js.Any, value: js.Any): ApplicateOptions = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicateOptions]
    }
    
    @scala.inline
    implicit class ApplicateOptionsMutableBuilder[Self <: ApplicateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: DecoratorConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: js.Object): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DebounceOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var maxWait: js.UndefOr[Double] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
    
    @JSName("wait")
    var wait_FDebounceOptions: js.UndefOr[Double] = js.native
  }
  object DebounceOptions {
    
    @scala.inline
    def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit class DebounceOptionsMutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  @js.native
  trait MemoizeConfig[T, U] extends StObject {
    
    var cache: js.UndefOr[MemoizeMap[T, U]] = js.native
    
    var resolver: js.UndefOr[ResolvableFunction] = js.native
    
    var `type`: js.UndefOr[Instantiable[T, U]] = js.native
  }
  object MemoizeConfig {
    
    @scala.inline
    def apply[T, U](): MemoizeConfig[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoizeConfig[T, U]]
    }
    
    @scala.inline
    implicit class MemoizeConfigMutableBuilder[Self <: MemoizeConfig[_, _], T, U] (val x: Self with (MemoizeConfig[T, U])) extends AnyVal {
      
      @scala.inline
      def setCache(value: MemoizeMap[T, U]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setResolver(value: ResolvableFunction): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      @scala.inline
      def setType(value: Instantiable[T, U]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MemoizeMap[T, U] extends StObject {
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    def delete(key: T): Unit = js.native
    
    def get(key: T): U = js.native
    
    def has(key: T): Boolean = js.native
    
    def set(key: T, value: U): Unit = js.native
  }
  object MemoizeMap {
    
    @scala.inline
    def apply[T, U](delete: T => Unit, get: T => U, has: T => Boolean, set: (T, U) => Unit): MemoizeMap[T, U] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[MemoizeMap[T, U]]
    }
    
    @scala.inline
    implicit class MemoizeMapMutableBuilder[Self <: MemoizeMap[_, _], T, U] (val x: Self with (MemoizeMap[T, U])) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setDelete(value: T => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: T => U): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (T, U) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ThrottleOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object ThrottleOptions {
    
    @scala.inline
    def apply(): ThrottleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    @scala.inline
    implicit class ThrottleOptionsMutableBuilder[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
