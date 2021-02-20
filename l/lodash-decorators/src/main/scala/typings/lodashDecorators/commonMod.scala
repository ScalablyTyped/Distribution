package typings.lodashDecorators

import org.scalablytyped.runtime.Instantiable0
import typings.lodashDecorators.applicatorsMod.Applicator
import typings.lodashDecorators.utilsMod.CompositeKeyWeakMap
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("lodash-decorators/factory/common", "InstanceChainMap")
  @js.native
  val InstanceChainMap: CompositeKeyWeakMap[InstanceChainData] = js.native
  
  @js.native
  trait ApplicatorToken extends Instantiable0[Applicator]
  
  type BiTypedDecorator = js.Function0[LodashDecorator] with LodashDecorator
  
  type BiTypedDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], LodashDecorator]) with LodashDecorator
  
  type BiTypedDecorator2[T, T2] = (js.Function2[/* arg1 */ js.UndefOr[T], /* arg2 */ js.UndefOr[T2], LodashDecorator]) with LodashDecorator
  
  type BiTypedDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    LodashDecorator
  ]) with LodashDecorator
  
  type BiTypedDecoratorN = (js.Function1[/* repeated */ js.Any, LodashDecorator]) with LodashDecorator
  
  type BiTypedMethodDecorator = js.Function0[LodashMethodDecorator] with LodashMethodDecorator
  
  type BiTypedMethodDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], LodashMethodDecorator]) with LodashMethodDecorator
  
  type BiTypedMethodDecorator2[T, T2] = (js.Function2[/* arg1 */ js.UndefOr[T], /* arg2 */ js.UndefOr[T2], LodashMethodDecorator]) with LodashMethodDecorator
  
  type BiTypedMethodDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    LodashMethodDecorator
  ]) with LodashMethodDecorator
  
  type BiTypedMethodDecoratorN = (js.Function1[/* repeated */ js.Any, LodashMethodDecorator]) with LodashMethodDecorator
  
  @js.native
  trait InstanceChainContext extends StObject {
    
    var getter: js.UndefOr[Boolean] = js.native
    
    var method: js.UndefOr[Boolean] = js.native
    
    var property: js.UndefOr[Boolean] = js.native
    
    var setter: js.UndefOr[Boolean] = js.native
    
    var value: js.Any = js.native
  }
  object InstanceChainContext {
    
    @scala.inline
    def apply(value: js.Any): InstanceChainContext = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceChainContext]
    }
    
    @scala.inline
    implicit class InstanceChainContextMutableBuilder[Self <: InstanceChainContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetter(value: Boolean): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      @scala.inline
      def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setProperty(value: Boolean): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setSetter(value: Boolean): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InstanceChainData extends StObject {
    
    var fns: js.Array[js.Function] = js.native
    
    var isGetter: Boolean = js.native
    
    var isMethod: Boolean = js.native
    
    var isProperty: Boolean = js.native
    
    var isSetter: Boolean = js.native
    
    var properties: js.Array[String] = js.native
  }
  object InstanceChainData {
    
    @scala.inline
    def apply(
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
    implicit class InstanceChainDataMutableBuilder[Self <: InstanceChainData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFns(value: js.Array[js.Function]): Self = StObject.set(x, "fns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnsVarargs(value: js.Function*): Self = StObject.set(x, "fns", js.Array(value :_*))
      
      @scala.inline
      def setIsGetter(value: Boolean): Self = StObject.set(x, "isGetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMethod(value: Boolean): Self = StObject.set(x, "isMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsProperty(value: Boolean): Self = StObject.set(x, "isProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSetter(value: Boolean): Self = StObject.set(x, "isSetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    }
  }
  
  type LodashDecorator = MethodDecorator with PropertyDecorator
  
  type LodashMethodDecorator = MethodDecorator
  
  type ResolvableFunction = String | js.Function
}
