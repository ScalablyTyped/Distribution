package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jasmine {
  
  type CustomAsyncMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.jasmine.jasmine.CustomAsyncMatcherFactory]
  
  type CustomAsyncMatcherFactory = js.Function2[
    /* util */ typings.jasmine.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typings.jasmine.jasmine.CustomEqualityTester], 
    typings.jasmine.jasmine.CustomAsyncMatcher
  ]
  
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean | scala.Unit]
  
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.jasmine.jasmine.CustomMatcherFactory]
  
  type CustomMatcherFactory = js.Function2[
    /* util */ typings.jasmine.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typings.jasmine.jasmine.CustomEqualityTester], 
    typings.jasmine.jasmine.CustomMatcher
  ]
  
  type CustomObjectFormatter = js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String]]
  
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.jasmine.jasmine.ObjectContaining[T]
    - typings.jasmine.jasmine.AsymmetricMatcher[js.Any]
    - typings.jasmine.jasmine.Any
    - typings.jasmine.jasmine.Spy[typings.jasmine.jasmine.Func]
    - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / typings.jasmine.jasmineStrings.Expected with org.scalablytyped.runtime.TopLevel[T]
  */
  type Expected[T] = typings.jasmine.jasmine._Expected[T] | typings.jasmine.jasmine.AsymmetricMatcher[js.Any] | typings.jasmine.jasmine.Spy[typings.jasmine.jasmine.Func] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typings.jasmine.jasmineStrings.Expected with org.scalablytyped.runtime.TopLevel[T]) | T
  
  type ExpectedRecursive[T] = T | typings.jasmine.jasmine.ObjectContaining[T] | typings.jasmine.jasmine.AsymmetricMatcher[js.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
    */ typings.jasmine.jasmineStrings.ExpectedRecursive with org.scalablytyped.runtime.TopLevel[js.Any])
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  type ImplementationCallback = (js.Function0[js.Thenable[js.Any] | scala.Unit]) | (js.Function1[/* done */ typings.jasmine.DoneFn, scala.Unit])
  
  type MatchableArgs[Fn] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any[K] | jasmine.jasmine.AsymmetricMatcher<any>}
    */ typings.jasmine.jasmineStrings.MatchableArgs with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * It's like SpyObj, but doesn't verify argument/return types for functions.
    * Useful if TS cannot correctly infer type for complex objects.
    */
  type NonTypedSpyObj[T] = typings.jasmine.jasmine.SpyObj[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends jasmine.jasmine.Func? jasmine.jasmine.Func : T[K]}
    */ typings.jasmine.jasmineStrings.NonTypedSpyObj with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  
  type PassedExpectation = typings.jasmine.jasmine.CustomReportExpectation
  
  /**
    * Obtains the type that a promise-returning function can be rejected with.
    * This is so we can use .and.rejectWith() only for functions that return a promise.
    */
  type PromisedRejectType[Fn /* <: js.Function */] = js.Any
  
  /**
    * Obtains the promised type that a promise-returning function resolves to.
    */
  type PromisedReturnType[Fn /* <: typings.jasmine.jasmine.Func */] = js.Any
  
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typings.jasmine.jasmine.Spec], scala.Unit]
  
  type SpyObj[T] = T with typings.jasmine.jasmineStrings.SpyObj with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type SpyObjMethodNames[T] = (js.Array[/* keyof T */ java.lang.String]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
    */ typings.jasmine.jasmineStrings.SpyObjMethodNames with org.scalablytyped.runtime.TopLevel[js.Any]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SpyObjPropertyNames[T] = (js.Array[/* keyof T */ java.lang.String]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.jasmine.jasmineStrings.SpyObjPropertyNames with org.scalablytyped.runtime.TopLevel[T]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type StringPrettyPrinter = typings.jasmine.jasmine.PrettyPrinter
}
