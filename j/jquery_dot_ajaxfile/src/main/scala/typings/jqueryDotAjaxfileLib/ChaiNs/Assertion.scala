package typings
package jqueryDotAjaxfileLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  var Arguments: Assertion = js.native
  @JSName("Throw")
  var Throw_Original: Throw = js.native
  @JSName("a")
  var a_Original: TypeComparison = js.native
  @JSName("an")
  var an_Original: TypeComparison = js.native
  var arguments: Assertion = js.native
  @JSName("contain")
  var contain_Original: Include = js.native
  var deep: Deep = js.native
  var empty: Assertion = js.native
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
  var exist: Assertion = js.native
  var `false`: Assertion = js.native
  @JSName("haveOwnProperty")
  var haveOwnProperty_Original: OwnProperty = js.native
  @JSName("include")
  var include_Original: Include = js.native
  var itself: Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  @JSName("lengthOf")
  var lengthOf_Original: Length = js.native
  @JSName("length")
  var length_Original: Length = js.native
  @JSName("members")
  var members_Original: Members = js.native
  var not: Assertion = js.native
  var `null`: Assertion = js.native
  var ok: Assertion = js.native
  @JSName("ownProperty")
  var ownProperty_Original: OwnProperty = js.native
  @JSName("property")
  var property_Original: Property = js.native
  @JSName("throw")
  var throw_Original: Throw = js.native
  @JSName("throws")
  var throws_Original: Throw = js.native
  var `true`: Assertion = js.native
  var undefined: Assertion = js.native
  def Throw(): Assertion = js.native
  def Throw(constructor: js.Function): Assertion = js.native
  def Throw(constructor: js.Function, expected: java.lang.String): Assertion = js.native
  def Throw(constructor: js.Function, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(constructor: js.Function, expected: stdLib.RegExp): Assertion = js.native
  def Throw(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def Throw(constructor: stdLib.Error): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: java.lang.String): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: stdLib.RegExp): Assertion = js.native
  def Throw(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def Throw(expected: java.lang.String): Assertion = js.native
  def Throw(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def Throw(expected: stdLib.RegExp): Assertion = js.native
  def Throw(expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def a(`type`: java.lang.String): Assertion = js.native
  def a(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def an(`type`: java.lang.String): Assertion = js.native
  def an(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def closeTo(expected: scala.Double, delta: scala.Double): Assertion = js.native
  def closeTo(expected: scala.Double, delta: scala.Double, message: java.lang.String): Assertion = js.native
  def contain(value: java.lang.String): Assertion = js.native
  def contain(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def contain(value: js.Object): Assertion = js.native
  def contain(value: js.Object, message: java.lang.String): Assertion = js.native
  def contain(value: scala.Double): Assertion = js.native
  def contain(value: scala.Double, message: java.lang.String): Assertion = js.native
  def eq(value: js.Any): Assertion = js.native
  def eq(value: js.Any, message: java.lang.String): Assertion = js.native
  def eql(value: js.Any): Assertion = js.native
  def eql(value: js.Any, message: java.lang.String): Assertion = js.native
  def eqls(value: js.Any): Assertion = js.native
  def eqls(value: js.Any, message: java.lang.String): Assertion = js.native
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: java.lang.String): Assertion = js.native
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: java.lang.String): Assertion = js.native
  def haveOwnProperty(name: java.lang.String): Assertion = js.native
  def haveOwnProperty(name: java.lang.String, message: java.lang.String): Assertion = js.native
  def include(value: java.lang.String): Assertion = js.native
  def include(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def include(value: js.Object): Assertion = js.native
  def include(value: js.Object, message: java.lang.String): Assertion = js.native
  def include(value: scala.Double): Assertion = js.native
  def include(value: scala.Double, message: java.lang.String): Assertion = js.native
  def key(string: java.lang.String): Assertion = js.native
  def keys(keys: java.lang.String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def length(length: scala.Double): Assertion = js.native
  def length(length: scala.Double, message: java.lang.String): Assertion = js.native
  def lengthOf(length: scala.Double): Assertion = js.native
  def lengthOf(length: scala.Double, message: java.lang.String): Assertion = js.native
  def `match`(regexp: java.lang.String): Assertion = js.native
  def `match`(regexp: java.lang.String, message: java.lang.String): Assertion = js.native
  def `match`(regexp: stdLib.RegExp): Assertion = js.native
  def `match`(regexp: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: java.lang.String): Assertion = js.native
  def ownProperty(name: java.lang.String): Assertion = js.native
  def ownProperty(name: java.lang.String, message: java.lang.String): Assertion = js.native
  def property(name: java.lang.String): Assertion = js.native
  def property(name: java.lang.String, value: js.Any): Assertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): Assertion = js.native
  def respondTo(method: java.lang.String): Assertion = js.native
  def respondTo(method: java.lang.String, message: java.lang.String): Assertion = js.native
  def satisfy(matcher: js.Function): Assertion = js.native
  def satisfy(matcher: js.Function, message: java.lang.String): Assertion = js.native
  def string(string: java.lang.String): Assertion = js.native
  def string(string: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(): Assertion = js.native
  def `throw`(constructor: js.Function): Assertion = js.native
  def `throw`(constructor: js.Function, expected: java.lang.String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(constructor: js.Function, expected: stdLib.RegExp): Assertion = js.native
  def `throw`(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def `throw`(constructor: stdLib.Error): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: java.lang.String): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: stdLib.RegExp): Assertion = js.native
  def `throw`(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def `throw`(expected: java.lang.String): Assertion = js.native
  def `throw`(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def `throw`(expected: stdLib.RegExp): Assertion = js.native
  def `throw`(expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def throws(): Assertion = js.native
  def throws(constructor: js.Function): Assertion = js.native
  def throws(constructor: js.Function, expected: java.lang.String): Assertion = js.native
  def throws(constructor: js.Function, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def throws(constructor: js.Function, expected: stdLib.RegExp): Assertion = js.native
  def throws(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def throws(constructor: stdLib.Error): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: java.lang.String): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: stdLib.RegExp): Assertion = js.native
  def throws(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def throws(expected: java.lang.String): Assertion = js.native
  def throws(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def throws(expected: stdLib.RegExp): Assertion = js.native
  def throws(expected: stdLib.RegExp, message: java.lang.String): Assertion = js.native
}

