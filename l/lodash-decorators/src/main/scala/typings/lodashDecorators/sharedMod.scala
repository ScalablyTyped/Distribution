package typings.lodashDecorators

import typings.lodashDecorators.anon.Instantiable
import typings.lodashDecorators.factoryCommonMod.ResolvableFunction
import typings.lodashDecorators.factoryMod.DecoratorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  trait ApplicateOptions extends StObject {
    
    var args: js.Array[Any]
    
    var config: DecoratorConfig
    
    var instance: js.UndefOr[js.Object] = js.undefined
    
    var target: Any
    
    var value: Any
  }
  object ApplicateOptions {
    
    inline def apply(args: js.Array[Any], config: DecoratorConfig, target: Any, value: Any): ApplicateOptions = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicateOptions]
    }
    
    extension [Self <: ApplicateOptions](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setConfig(value: DecoratorConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: js.Object): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DebounceOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var maxWait: js.UndefOr[Double] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
    
    @JSName("wait")
    var wait_FDebounceOptions: js.UndefOr[Double] = js.undefined
  }
  object DebounceOptions {
    
    inline def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    extension [Self <: DebounceOptions](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait MemoizeConfig[T, U] extends StObject {
    
    var cache: js.UndefOr[MemoizeMap[T, U]] = js.undefined
    
    var resolver: js.UndefOr[ResolvableFunction] = js.undefined
    
    var `type`: js.UndefOr[Instantiable[T, U]] = js.undefined
  }
  object MemoizeConfig {
    
    inline def apply[T, U](): MemoizeConfig[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoizeConfig[T, U]]
    }
    
    extension [Self <: MemoizeConfig[?, ?], T, U](x: Self & (MemoizeConfig[T, U])) {
      
      inline def setCache(value: MemoizeMap[T, U]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setResolver(value: ResolvableFunction): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setType(value: Instantiable[T, U]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MemoizeMap[T, U] extends StObject {
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def delete(key: T): Unit
    
    def get(key: T): U
    
    def has(key: T): Boolean
    
    def set(key: T, value: U): Unit
  }
  object MemoizeMap {
    
    inline def apply[T, U](delete: T => Unit, get: T => U, has: T => Boolean, set: (T, U) => Unit): MemoizeMap[T, U] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[MemoizeMap[T, U]]
    }
    
    extension [Self <: MemoizeMap[?, ?], T, U](x: Self & (MemoizeMap[T, U])) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setDelete(value: T => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: T => U): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (T, U) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait ThrottleOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object ThrottleOptions {
    
    inline def apply(): ThrottleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    extension [Self <: ThrottleOptions](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
