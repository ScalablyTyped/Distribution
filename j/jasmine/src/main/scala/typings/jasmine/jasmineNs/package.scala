package typings.jasmine

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineNs {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, Boolean | Unit]
  type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.jasmine.jasmineNs.ObjectContaining[T]
    - typings.jasmine.jasmineNs.AsymmetricMatcher
    - typings.jasmine.jasmineNs.Any
    - typings.jasmine.jasmineNs.Spy
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / typings.jasmine.jasmineStrings.Expected with T
  */
  type Expected[T] = _Expected[T] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typings.jasmine.jasmineStrings.Expected with T) | T
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.jasmine.jasmineNs.ObjectContaining[T]
    - typings.jasmine.jasmineNs.AsymmetricMatcher
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: object | jasmine.jasmine.Any}
    * / typings.jasmine.jasmineStrings.ExpectedRecursive with js.Any
  */
  type ExpectedRecursive[T] = _ExpectedRecursive[T] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: object | jasmine.jasmine.Any}
    */ typings.jasmine.jasmineStrings.ExpectedRecursive with js.Any) | T
  type PassedExpectation = CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], Unit]
  type SpyObj[T] = T with typings.jasmine.jasmineStrings.SpyObj with js.Any
  type SpyObjMethodNames[T] = js.Array[String] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.ReturnType<T[P] extends (args : ...any): any? T[P] : any>}
    */ typings.jasmine.jasmineStrings.SpyObjMethodNames with js.Any) | StringDictionary[js.Any]
  type StringPrettyPrinter = PrettyPrinter
}
