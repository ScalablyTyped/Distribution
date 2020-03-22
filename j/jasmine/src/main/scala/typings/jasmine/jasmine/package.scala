package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type CustomAsyncMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.jasmine.jasmine.CustomAsyncMatcherFactory]
  type CustomAsyncMatcherFactory = js.Function2[
    /* util */ typings.jasmine.jasmine.MatchersUtil_, 
    /* customEqualityTesters */ js.Array[typings.jasmine.jasmine.CustomEqualityTester], 
    typings.jasmine.jasmine.CustomAsyncMatcher
  ]
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean | scala.Unit]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.jasmine.jasmine.CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ typings.jasmine.jasmine.MatchersUtil_, 
    /* customEqualityTesters */ js.Array[typings.jasmine.jasmine.CustomEqualityTester], 
    typings.jasmine.jasmine.CustomMatcher
  ]
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.jasmine.jasmine.ObjectContaining_[T]
    - typings.jasmine.jasmine.AsymmetricMatcher[js.Any]
    - typings.jasmine.jasmine.Any_
    - typings.jasmine.jasmine.Spy
    - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / typings.jasmine.jasmineStrings.Expected with T
  */
  type Expected[T] = typings.jasmine.jasmine._Expected[T] | typings.jasmine.jasmine.AsymmetricMatcher[js.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typings.jasmine.jasmineStrings.Expected with T) | T
  type ExpectedRecursive[T] = T | typings.jasmine.jasmine.ObjectContaining_[T] | typings.jasmine.jasmine.AsymmetricMatcher[js.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
    */ typings.jasmine.jasmineStrings.ExpectedRecursive with js.Any)
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type ImplementationCallback = js.Function0[js.Thenable[js.Any]] | (js.Function1[/* done */ typings.jasmine.DoneFn, scala.Unit])
  type PassedExpectation = typings.jasmine.jasmine.CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typings.jasmine.jasmine.Spec], scala.Unit]
  type SpyObj[T] = T with typings.jasmine.jasmineStrings.SpyObj with js.Any
  type SpyObjMethodNames[T] = js.Array[java.lang.String] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
    */ typings.jasmine.jasmineStrings.SpyObjMethodNames with js.Any) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type SpyObjPropertyNames[T] = js.Array[java.lang.String] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.jasmine.jasmineStrings.SpyObjPropertyNames with T) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type StringPrettyPrinter = typings.jasmine.jasmine.PrettyPrinter
}
