package typings.jasmine.jasmine

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jasmine.DoneFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Use trick with prototype to allow abstract classes.
// More info: https://stackoverflow.com/a/38642922/2009373
type Constructor = js.Function

type CustomAsyncMatcherFactories = StringDictionary[CustomAsyncMatcherFactory]

type CustomAsyncMatcherFactory = js.Function1[/* util */ MatchersUtil, CustomAsyncMatcher]

type CustomEqualityTester = js.Function2[/* first */ scala.Any, /* second */ scala.Any, Boolean | Unit]

type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]

type CustomMatcherFactory = js.Function1[/* util */ MatchersUtil, CustomMatcher]

type CustomObjectFormatter = js.Function1[/* value */ scala.Any, js.UndefOr[String]]

/** @deprecated Please use `Configuration` instead of `EnvConfiguration`. */
type EnvConfiguration = Configuration

/* Rewritten from type alias, can be one of: 
  - T
  - typings.jasmine.jasmine.ObjectContaining[T]
  - typings.jasmine.jasmine.AsymmetricMatcher[scala.Any]
  - typings.jasmine.jasmine.Any
  - typings.jasmine.jasmine.Spy[typings.jasmine.jasmine.Func]
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
  * / typings.jasmine.jasmineStrings.Expected & org.scalablytyped.runtime.TopLevel[T]
*/
type Expected[T] = _Expected[T] | AsymmetricMatcher[scala.Any] | Spy[Func] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
  */ typings.jasmine.jasmineStrings.Expected & TopLevel[T]) | T

type ExpectedRecursive[T] = T | ObjectContaining[T] | AsymmetricMatcher[scala.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]> | jasmine.jasmine.Any}
  */ typings.jasmine.jasmineStrings.ExpectedRecursive & TopLevel[T])

type ImplementationCallback = (js.Function0[js.Thenable[scala.Any] | Unit]) | (js.Function1[/* done */ DoneFn, Unit])

type MatchableArgs[Fn] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof any ]: jasmine.jasmine.Expected<any[K]>}
  */ typings.jasmine.jasmineStrings.MatchableArgs & TopLevel[scala.Any]

/**
  * It's like SpyObj, but doesn't verify argument/return types for functions.
  * Useful if TS cannot correctly infer type for complex objects.
  */
type NonTypedSpyObj[T] = SpyObj[
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: T[K] extends jasmine.jasmine.Func? jasmine.jasmine.Func : T[K]}
  */ typings.jasmine.jasmineStrings.NonTypedSpyObj & TopLevel[scala.Any]]

type PassedExpectation = CustomReportExpectation

/**
  * Obtains the type that a promise-returning function can be rejected with.
  * This is so we can use .and.rejectWith() only for functions that return a promise.
  */
type PromisedRejectType[Fn /* <: js.Function */] = scala.Any

/**
  * Obtains the promised type that a promise-returning function resolves to.
  */
type PromisedReturnType[Fn /* <: Func */] = scala.Any

/** @deprecated use JasmineDoneInfo instead */
type RunDetails = JasmineDoneInfo

type SpecFilter = js.Function1[/* spec */ Spec, Boolean]

/** @deprecated Please use `SpecFilter` instead of `SpecFunction`. */
type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], Unit]

type SpyObj[T] = T & typings.jasmine.jasmineStrings.SpyObj & TopLevel[scala.Any]

type SpyObjMethodNames[T] = (js.Array[/* keyof T */ String]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
  */ typings.jasmine.jasmineStrings.SpyObjMethodNames & TopLevel[scala.Any]) | StringDictionary[scala.Any]

type SpyObjPropertyNames[T] = (js.Array[/* keyof T */ String]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ typings.jasmine.jasmineStrings.SpyObjPropertyNames & TopLevel[T]) | StringDictionary[scala.Any]

/** @deprecated use JasmineStartedInfo instead */
type SuiteInfo = JasmineStartedInfo
