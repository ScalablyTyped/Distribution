package typings.jqueryAjaxfile.Chai

import typings.jqueryAjaxfile.Object
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  @JSName("Arguments")
  var Arguments_Original: Assertion = js.native
  @JSName("Throw")
  var Throw_Original: Throw = js.native
  @JSName("a")
  var a_Original: TypeComparison = js.native
  @JSName("an")
  var an_Original: TypeComparison = js.native
  @JSName("arguments")
  var arguments_Original: Assertion = js.native
  @JSName("contain")
  var contain_Original: Include = js.native
  var deep: Deep = js.native
  @JSName("empty")
  var empty_Original: Assertion = js.native
  @JSName("eq")
  var eq_Original: Equal = js.native
  @JSName("eql")
  var eql_Original: Equal = js.native
  @JSName("eqls")
  var eqls_Original: Equal = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  @JSName("equals")
  var equals_Original: Equal = js.native
  @JSName("exist")
  var exist_Original: Assertion = js.native
  @JSName("false")
  var false_Original: Assertion = js.native
  @JSName("haveOwnProperty")
  var haveOwnProperty_Original: OwnProperty = js.native
  @JSName("include")
  var include_Original: Include = js.native
  @JSName("itself")
  var itself_Original: Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  @JSName("lengthOf")
  var lengthOf_Original: Length = js.native
  @JSName("length")
  var length_Original: Length = js.native
  @JSName("members")
  var members_Original: Members = js.native
  @JSName("not")
  var not_Original: Assertion = js.native
  @JSName("null")
  var null_Original: Assertion = js.native
  @JSName("ok")
  var ok_Original: Assertion = js.native
  @JSName("ownProperty")
  var ownProperty_Original: OwnProperty = js.native
  @JSName("property")
  var property_Original: Property = js.native
  @JSName("throw")
  var throw_Original: Throw = js.native
  @JSName("throws")
  var throws_Original: Throw = js.native
  @JSName("true")
  var true_Original: Assertion = js.native
  @JSName("undefined")
  var undefined_Original: Assertion = js.native
  def Arguments(`type`: String): Assertion = js.native
  def Arguments(`type`: String, message: String): Assertion = js.native
  def Throw(): Assertion = js.native
  def Throw(constructor: js.Function): Assertion = js.native
  def Throw(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def Throw(constructor: js.Function, expected: String): Assertion = js.native
  def Throw(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def Throw(constructor: js.Function, expected: RegExp): Assertion = js.native
  def Throw(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
  def Throw(constructor: Error): Assertion = js.native
  def Throw(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def Throw(constructor: Error, expected: String): Assertion = js.native
  def Throw(constructor: Error, expected: String, message: String): Assertion = js.native
  def Throw(constructor: Error, expected: RegExp): Assertion = js.native
  def Throw(constructor: Error, expected: RegExp, message: String): Assertion = js.native
  def Throw(expected: String): Assertion = js.native
  def Throw(expected: String, message: String): Assertion = js.native
  def Throw(expected: RegExp): Assertion = js.native
  def Throw(expected: RegExp, message: String): Assertion = js.native
  def a(`type`: String): Assertion = js.native
  def a(`type`: String, message: String): Assertion = js.native
  def an(`type`: String): Assertion = js.native
  def an(`type`: String, message: String): Assertion = js.native
  def arguments(`type`: String): Assertion = js.native
  def arguments(`type`: String, message: String): Assertion = js.native
  def closeTo(expected: Double, delta: Double): Assertion = js.native
  def closeTo(expected: Double, delta: Double, message: String): Assertion = js.native
  def contain(value: String): Assertion = js.native
  def contain(value: String, message: String): Assertion = js.native
  def contain(value: Double): Assertion = js.native
  def contain(value: Double, message: String): Assertion = js.native
  def contain(value: Object): Assertion = js.native
  def contain(value: Object, message: String): Assertion = js.native
  def empty(`type`: String): Assertion = js.native
  def empty(`type`: String, message: String): Assertion = js.native
  def eq(value: js.Any): Assertion = js.native
  def eq(value: js.Any, message: String): Assertion = js.native
  def eql(value: js.Any): Assertion = js.native
  def eql(value: js.Any, message: String): Assertion = js.native
  def eqls(value: js.Any): Assertion = js.native
  def eqls(value: js.Any, message: String): Assertion = js.native
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: String): Assertion = js.native
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: String): Assertion = js.native
  def exist(`type`: String): Assertion = js.native
  def exist(`type`: String, message: String): Assertion = js.native
  def `false`(`type`: String): Assertion = js.native
  def `false`(`type`: String, message: String): Assertion = js.native
  def haveOwnProperty(name: String): Assertion = js.native
  def haveOwnProperty(name: String, message: String): Assertion = js.native
  def include(value: String): Assertion = js.native
  def include(value: String, message: String): Assertion = js.native
  def include(value: Double): Assertion = js.native
  def include(value: Double, message: String): Assertion = js.native
  def include(value: Object): Assertion = js.native
  def include(value: Object, message: String): Assertion = js.native
  def itself(`type`: String): Assertion = js.native
  def itself(`type`: String, message: String): Assertion = js.native
  def key(string: String): Assertion = js.native
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def length(length: Double): Assertion = js.native
  def length(length: Double, message: String): Assertion = js.native
  def lengthOf(length: Double): Assertion = js.native
  def lengthOf(length: Double, message: String): Assertion = js.native
  def `match`(regexp: String): Assertion = js.native
  def `match`(regexp: String, message: String): Assertion = js.native
  def `match`(regexp: RegExp): Assertion = js.native
  def `match`(regexp: RegExp, message: String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  def not(`type`: String): Assertion = js.native
  def not(`type`: String, message: String): Assertion = js.native
  def `null`(`type`: String): Assertion = js.native
  def `null`(`type`: String, message: String): Assertion = js.native
  def ok(`type`: String): Assertion = js.native
  def ok(`type`: String, message: String): Assertion = js.native
  def ownProperty(name: String): Assertion = js.native
  def ownProperty(name: String, message: String): Assertion = js.native
  def property(name: String): Assertion = js.native
  def property(name: String, value: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def property(name: String, value: js.Any): Assertion = js.native
  def property(name: String, value: js.Any, message: String): Assertion = js.native
  def respondTo(method: String): Assertion = js.native
  def respondTo(method: String, message: String): Assertion = js.native
  def satisfy(matcher: js.Function): Assertion = js.native
  def satisfy(matcher: js.Function, message: String): Assertion = js.native
  def string(string: String): Assertion = js.native
  def string(string: String, message: String): Assertion = js.native
  def `throw`(): Assertion = js.native
  def `throw`(constructor: js.Function): Assertion = js.native
  def `throw`(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: RegExp): Assertion = js.native
  def `throw`(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
  def `throw`(constructor: Error): Assertion = js.native
  def `throw`(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def `throw`(constructor: Error, expected: String): Assertion = js.native
  def `throw`(constructor: Error, expected: String, message: String): Assertion = js.native
  def `throw`(constructor: Error, expected: RegExp): Assertion = js.native
  def `throw`(constructor: Error, expected: RegExp, message: String): Assertion = js.native
  def `throw`(expected: String): Assertion = js.native
  def `throw`(expected: String, message: String): Assertion = js.native
  def `throw`(expected: RegExp): Assertion = js.native
  def `throw`(expected: RegExp, message: String): Assertion = js.native
  def throws(): Assertion = js.native
  def throws(constructor: js.Function): Assertion = js.native
  def throws(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def throws(constructor: js.Function, expected: String): Assertion = js.native
  def throws(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def throws(constructor: js.Function, expected: RegExp): Assertion = js.native
  def throws(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
  def throws(constructor: Error): Assertion = js.native
  def throws(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def throws(constructor: Error, expected: String): Assertion = js.native
  def throws(constructor: Error, expected: String, message: String): Assertion = js.native
  def throws(constructor: Error, expected: RegExp): Assertion = js.native
  def throws(constructor: Error, expected: RegExp, message: String): Assertion = js.native
  def throws(expected: String): Assertion = js.native
  def throws(expected: String, message: String): Assertion = js.native
  def throws(expected: RegExp): Assertion = js.native
  def throws(expected: RegExp, message: String): Assertion = js.native
  def `true`(`type`: String): Assertion = js.native
  def `true`(`type`: String, message: String): Assertion = js.native
  def undefined(`type`: String): Assertion = js.native
  def undefined(`type`: String, message: String): Assertion = js.native
}

