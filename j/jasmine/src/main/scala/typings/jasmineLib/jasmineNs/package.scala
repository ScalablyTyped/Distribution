package typings
package jasmineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineNs {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean | scala.Unit]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
  /* Rewritten from type alias, can be one of: 
    - T
    - ObjectContaining[T]
    - AsymmetricMatcher
    - Any
    - Spy
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / jasmineLib.jasmineLibStrings.Expected with T
  */
  type Expected[T] = _Expected[T] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ jasmineLib.jasmineLibStrings.Expected with T) | T
  /* Rewritten from type alias, can be one of: 
    - T
    - ObjectContaining[T]
    - AsymmetricMatcher
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: object | jasmine.jasmine.Any}
    * / jasmineLib.jasmineLibStrings.ExpectedRecursive with js.Any
  */
  type ExpectedRecursive[T] = _ExpectedRecursive[T] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: object | jasmine.jasmine.Any}
    */ jasmineLib.jasmineLibStrings.ExpectedRecursive with js.Any) | T
  type PassedExpectation = CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], scala.Unit]
  type SpyObj[T] = T with jasmineLib.jasmineLibStrings.SpyObj with js.Any
  type SpyObjMethodNames[T] = js.Array[java.lang.String] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.ReturnType<T[P] extends (args : ...any): any? T[P] : any>}
    */ jasmineLib.jasmineLibStrings.SpyObjMethodNames with js.Any) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type StringPrettyPrinter = PrettyPrinter
}
