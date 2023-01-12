package typings.lodashDecorators

import org.scalablytyped.runtime.Instantiable0
import typings.lodashDecorators.applicatorsMod.Applicator
import typings.lodashDecorators.utilsMod.CompositeKeyWeakMap
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryCommonMod {
  
  @JSImport("lodash-decorators/factory/common", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @js.native
  trait ApplicatorToken
    extends StObject
       with Instantiable0[Applicator]
  
  type BiTypedDecorator = js.Function0[LodashDecorator] & LodashDecorator
  
  type BiTypedDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], LodashDecorator]) & LodashDecorator
  
  type BiTypedDecorator2[T, T2] = (js.Function2[/* arg1 */ js.UndefOr[T], /* arg2 */ js.UndefOr[T2], LodashDecorator]) & LodashDecorator
  
  type BiTypedDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    LodashDecorator
  ]) & LodashDecorator
  
  type BiTypedDecoratorN = (js.Function1[/* repeated */ Any, LodashDecorator]) & LodashDecorator
  
  type BiTypedMethodDecorator = js.Function0[LodashMethodDecorator] & LodashMethodDecorator
  
  type BiTypedMethodDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], LodashMethodDecorator]) & LodashMethodDecorator
  
  type BiTypedMethodDecorator2[T, T2] = (js.Function2[/* arg1 */ js.UndefOr[T], /* arg2 */ js.UndefOr[T2], LodashMethodDecorator]) & LodashMethodDecorator
  
  type BiTypedMethodDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    LodashMethodDecorator
  ]) & LodashMethodDecorator
  
  type BiTypedMethodDecoratorN = (js.Function1[/* repeated */ Any, LodashMethodDecorator]) & LodashMethodDecorator
  
  trait InstanceChainContext extends StObject {
    
    var getter: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[Boolean] = js.undefined
    
    var setter: js.UndefOr[Boolean] = js.undefined
    
    var value: Any
  }
  object InstanceChainContext {
    
    inline def apply(value: Any): InstanceChainContext = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceChainContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceChainContext] (val x: Self) extends AnyVal {
      
      inline def setGetter(value: Boolean): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      inline def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setProperty(value: Boolean): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setSetter(value: Boolean): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
      
      inline def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstanceChainData extends StObject {
    
    var fns: js.Array[js.Function]
    
    var isGetter: Boolean
    
    var isMethod: Boolean
    
    var isProperty: Boolean
    
    var isSetter: Boolean
    
    var properties: js.Array[String]
  }
  object InstanceChainData {
    
    inline def apply(
      fns: js.Array[js.Function],
      isGetter: Boolean,
      isMethod: Boolean,
      isProperty: Boolean,
      isSetter: Boolean,
      properties: js.Array[String]
    ): InstanceChainData = {
      val __obj = js.Dynamic.literal(fns = fns.asInstanceOf[js.Any], isGetter = isGetter.asInstanceOf[js.Any], isMethod = isMethod.asInstanceOf[js.Any], isProperty = isProperty.asInstanceOf[js.Any], isSetter = isSetter.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceChainData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceChainData] (val x: Self) extends AnyVal {
      
      inline def setFns(value: js.Array[js.Function]): Self = StObject.set(x, "fns", value.asInstanceOf[js.Any])
      
      inline def setFnsVarargs(value: js.Function*): Self = StObject.set(x, "fns", js.Array(value*))
      
      inline def setIsGetter(value: Boolean): Self = StObject.set(x, "isGetter", value.asInstanceOf[js.Any])
      
      inline def setIsMethod(value: Boolean): Self = StObject.set(x, "isMethod", value.asInstanceOf[js.Any])
      
      inline def setIsProperty(value: Boolean): Self = StObject.set(x, "isProperty", value.asInstanceOf[js.Any])
      
      inline def setIsSetter(value: Boolean): Self = StObject.set(x, "isSetter", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  @js.native
  trait LodashDecorator
    extends MethodDecorator
       with PropertyDecorator {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* target */ js.Object,
      arg2: /* propertyKey */ String | js.Symbol,
      arg3: /* descriptor */ TypedPropertyDescriptor[Any]
    ): TypedPropertyDescriptor[Any] | Unit = js.native
  }
  
  type LodashMethodDecorator = MethodDecorator
  
  type ResolvableFunction = String | js.Function
}
