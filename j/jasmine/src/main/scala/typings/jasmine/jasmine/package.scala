package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jasmine.DoneFn

  // Use trick with prototype to allow abstract classes.
  // More info: https://stackoverflow.com/a/38642922/2009373
  type Constructor = js.Function with js.Object
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, Boolean | Unit]
  type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.jasmine.jasmine.ObjectContaining[T]
    - typings.jasmine.jasmine.AsymmetricMatcher[js.Any]
    - typings.jasmine.jasmine.Any
    - typings.jasmine.jasmine.Spy
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / typings.jasmine.jasmineStrings.Expected with T
  */
  type Expected[T] = _Expected[T] | AsymmetricMatcher[js.Any] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typings.jasmine.jasmineStrings.Expected with T) | T
  type ExpectedRecursive[T] = T | ObjectContaining[T] | AsymmetricMatcher[js.Any] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
    */ typings.jasmine.jasmineStrings.ExpectedRecursive with js.Any)
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type ImplementationCallback = js.Function0[js.Thenable[js.Any]] | (js.Function1[/* done */ DoneFn, Unit])
  type PassedExpectation = CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], Unit]
  type SpyObj[T] = T with typings.jasmine.jasmineStrings.SpyObj with js.Any
  type SpyObjMethodNames[T] = js.Array[String] | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
    */ typings.jasmine.jasmineStrings.SpyObjMethodNames with js.Any) | StringDictionary[js.Any]
  type SpyObjPropertyNames[T] = js.Array[String] | StringDictionary[js.Any]
  type StringPrettyPrinter = PrettyPrinter
}
