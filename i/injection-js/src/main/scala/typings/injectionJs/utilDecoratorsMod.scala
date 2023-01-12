package typings.injectionJs

import org.scalablytyped.runtime.StringDictionary
import typings.injectionJs.facadeTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilDecoratorsMod {
  
  @JSImport("injection-js/util/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Class(clsDef: ClassDefinition): Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Class")(clsDef.asInstanceOf[js.Any]).asInstanceOf[Type[Any]]
  
  inline def makeDecorator(name: String, props: StringDictionary[Any]): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  inline def makeDecorator(name: String, props: StringDictionary[Any], parentClass: Any): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  inline def makeDecorator(
    name: String,
    props: StringDictionary[Any],
    parentClass: Any,
    chainFn: js.Function1[/* fn */ js.Function, Unit]
  ): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], chainFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  inline def makeDecorator(
    name: String,
    props: StringDictionary[Any],
    parentClass: Unit,
    chainFn: js.Function1[/* fn */ js.Function, Unit]
  ): js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], chainFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Function1[/* cls */ Any, Any]]]
  
  inline def makeParamDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeParamDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeParamDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]], parentClass: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeParamDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makePropDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makePropDecorator(name: String, props: js.Array[(js.Tuple2[String, Any]) | StringDictionary[Any]], parentClass: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ClassDefinition
    extends StObject
       with /**
    * Other methods on the class. Note that values should have type 'Function' but TS requires
    * all properties to have a narrower type than the index signature.
    */
  /* x */ StringDictionary[Type[Any] | js.Function | js.Array[Any]] {
    
    /**
      * Required constructor function for a class.
      *
      * The function may be optionally wrapped in an `Array`, in which case additional parameter
      * annotations may be specified.
      * The number of arguments and the number of parameter annotations must match.
      *
      * See {@link Class} for example of usage.
      */
    var constructor: js.Function | js.Array[Any]
    
    /**
      * Optional argument for specifying the superclass.
      */
    var `extends`: js.UndefOr[Type[Any]] = js.undefined
  }
  object ClassDefinition {
    
    inline def apply(constructor: js.Function | js.Array[Any]): ClassDefinition = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassDefinition] (val x: Self) extends AnyVal {
      
      inline def setConstructor(value: js.Function | js.Array[Any]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setConstructorVarargs(value: Any*): Self = StObject.set(x, "constructor", js.Array(value*))
      
      inline def setExtends(value: Type[Any]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    }
  }
  
  @js.native
  trait TypeDecorator extends StObject {
    
    def apply(target: js.Object): Unit = js.native
    def apply(target: js.Object, propertyKey: String): Unit = js.native
    def apply(target: js.Object, propertyKey: String, parameterIndex: Double): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol, parameterIndex: Double): Unit = js.native
    def apply(target: js.Object, propertyKey: Unit, parameterIndex: Double): Unit = js.native
    /**
      * Invoke as ES7 decorator.
      */
    def apply[T /* <: Type[Any] */](`type`: T): T = js.native
    
    /**
      * Generate a class from the definition and annotate it with {@link TypeDecorator#annotations}.
      */
    def Class(obj: ClassDefinition): Type[Any] = js.native
    
    /**
      * Storage for the accumulated annotations so far used by the DSL syntax.
      *
      * Used by {@link Class} to annotate the generated class.
      */
    var annotations: js.Array[Any] = js.native
  }
}
