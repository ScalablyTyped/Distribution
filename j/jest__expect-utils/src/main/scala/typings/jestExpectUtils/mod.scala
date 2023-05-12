package typings.jestExpectUtils

import typings.std.Record
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/expect-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBufferEquality(a: Any, b: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def emptyObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@jest/expect-utils", "equals")
  @js.native
  val equals_ : EqualsFunction = js.native
  
  inline def getObjectSubset(`object`: Any, subset: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSubset")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getObjectSubset(`object`: Any, subset: Any, customTesters: js.Array[Tester]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSubset")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getObjectSubset(
    `object`: Any,
    subset: Any,
    customTesters: js.Array[Tester],
    seenReferences: WeakMap[js.Object, Boolean]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSubset")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], seenReferences.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getObjectSubset(`object`: Any, subset: Any, customTesters: Unit, seenReferences: WeakMap[js.Object, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSubset")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], seenReferences.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getPath(`object`: Record[String, Any], propertyPath: String): GetPath_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[GetPath_]
  inline def getPath(`object`: Record[String, Any], propertyPath: js.Array[String]): GetPath_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[GetPath_]
  
  inline def isA[T](typeName: String, value: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isA")(typeName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def isError(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isOneline(expected: Any, received: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneline")(expected.asInstanceOf[js.Any], received.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iterableEquality(a: Any, b: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: js.Array[Tester]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: js.Array[Tester], aStack: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: js.Array[Tester], aStack: js.Array[Any], bStack: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: js.Array[Tester], aStack: Unit, bStack: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: Unit, aStack: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: Unit, aStack: js.Array[Any], bStack: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: Any, b: Any, customTesters: Unit, aStack: Unit, bStack: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def partition[T](items: js.Array[T], predicate: js.Function1[/* arg */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  inline def pathAsArray(propertyPath: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathAsArray")(propertyPath.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def sparseArrayEquality(a: Any, b: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseArrayEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def sparseArrayEquality(a: Any, b: Any, customTesters: js.Array[Tester]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseArrayEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def subsetEquality(`object`: Any, subset: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsetEquality")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def subsetEquality(`object`: Any, subset: Any, customTesters: js.Array[Tester]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsetEquality")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def typeEquality(a: Any, b: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  type EqualsFunction = js.Function4[
    /* a */ Any, 
    /* b */ Any, 
    /* customTesters */ js.UndefOr[js.Array[Tester]], 
    /* strictCheck */ js.UndefOr[Boolean], 
    Boolean
  ]
  
  trait GetPath_ extends StObject {
    
    var endPropIsDefined: js.UndefOr[Boolean] = js.undefined
    
    var hasEndProp: js.UndefOr[Boolean] = js.undefined
    
    var lastTraversedObject: Any
    
    var traversedPath: js.Array[String]
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object GetPath_ {
    
    inline def apply(lastTraversedObject: Any, traversedPath: js.Array[String]): GetPath_ = {
      val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPath_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPath_] (val x: Self) extends AnyVal {
      
      inline def setEndPropIsDefined(value: Boolean): Self = StObject.set(x, "endPropIsDefined", value.asInstanceOf[js.Any])
      
      inline def setEndPropIsDefinedUndefined: Self = StObject.set(x, "endPropIsDefined", js.undefined)
      
      inline def setHasEndProp(value: Boolean): Self = StObject.set(x, "hasEndProp", value.asInstanceOf[js.Any])
      
      inline def setHasEndPropUndefined: Self = StObject.set(x, "hasEndProp", js.undefined)
      
      inline def setLastTraversedObject(value: Any): Self = StObject.set(x, "lastTraversedObject", value.asInstanceOf[js.Any])
      
      inline def setTraversedPath(value: js.Array[String]): Self = StObject.set(x, "traversedPath", value.asInstanceOf[js.Any])
      
      inline def setTraversedPathVarargs(value: String*): Self = StObject.set(x, "traversedPath", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Tester = (this : @jest/expect-utils.@jest/expect-utils.TesterContext, a : any, b : any, customTesters : std.Array<@jest/expect-utils.@jest/expect-utils.Tester>): boolean | undefined
  }}}
  to avoid circular code involving: 
  - @jest/expect-utils.@jest/expect-utils.EqualsFunction
  - @jest/expect-utils.@jest/expect-utils.Tester
  */
  @js.native
  trait Tester extends StObject {
    
    def apply(a: Any, b: Any, customTesters: js.Array[Tester]): js.UndefOr[Boolean] = js.native
  }
  
  trait TesterContext extends StObject {
    
    def equals(a: Any, b: Any): Boolean
    def equals(a: Any, b: Any, customTesters: js.Array[Tester]): Boolean
    def equals(a: Any, b: Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean
    def equals(a: Any, b: Any, customTesters: Unit, strictCheck: Boolean): Boolean
    @JSName("equals")
    var equals_Original: EqualsFunction
  }
  object TesterContext {
    
    inline def apply(
      equals_ : (/* a */ Any, /* b */ Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean
    ): TesterContext = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction4(equals_))
      __obj.asInstanceOf[TesterContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TesterContext] (val x: Self) extends AnyVal {
      
      inline def setEquals_(
        value: (/* a */ Any, /* b */ Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "equals", js.Any.fromFunction4(value))
    }
  }
}
