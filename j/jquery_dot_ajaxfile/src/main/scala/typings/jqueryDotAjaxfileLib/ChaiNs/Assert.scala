package typings
package jqueryDotAjaxfileLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  /**
           * @param expression Expression to test for truthiness.
           * @param message Message to display on error.
           */
  def apply(expression: js.Any): scala.Unit = js.native
  /**
           * @param expression Expression to test for truthiness.
           * @param message Message to display on error.
           */
  def apply(expression: js.Any, message: java.lang.String): scala.Unit = js.native
  def Throw(fn: js.Function): scala.Unit = js.native
  def Throw(fn: js.Function, errType: js.Function): scala.Unit = js.native
  def Throw(fn: js.Function, errType: js.Function, msg: java.lang.String): scala.Unit = js.native
  def Throw(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def Throw(fn: js.Function, msg: java.lang.String): scala.Unit = js.native
  def Throw(fn: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def closeTo(act: scala.Double, exp: scala.Double, delta: scala.Double): scala.Unit = js.native
  def closeTo(act: scala.Double, exp: scala.Double, delta: scala.Double, msg: java.lang.String): scala.Unit = js.native
  def deepEqual(act: js.Any, exp: js.Any): scala.Unit = js.native
  def deepEqual(act: js.Any, exp: js.Any, msg: java.lang.String): scala.Unit = js.native
  def deepProperty(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String): scala.Unit = js.native
  def deepProperty(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def deepPropertyNotVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def deepPropertyNotVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def deepPropertyVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def deepPropertyVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def doesNotThrow(fn: js.Function): scala.Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function): scala.Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, msg: java.lang.String): scala.Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def doesNotThrow(fn: js.Function, msg: java.lang.String): scala.Unit = js.native
  def doesNotThrow(fn: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def equal(act: js.Any, exp: js.Any): scala.Unit = js.native
  def equal(act: js.Any, exp: js.Any, msg: java.lang.String): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(actual: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, msg: java.lang.String, operator: java.lang.String): scala.Unit = js.native
  def ifError(`val`: js.Any): scala.Unit = js.native
  def ifError(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def include(exp: java.lang.String, inc: js.Any): scala.Unit = js.native
  def include(exp: java.lang.String, inc: js.Any, msg: java.lang.String): scala.Unit = js.native
  def include(exp: js.Array[_], inc: js.Any): scala.Unit = js.native
  def include(exp: js.Array[_], inc: js.Any, msg: java.lang.String): scala.Unit = js.native
  def includeMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  def includeMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): scala.Unit = js.native
  def instanceOf(`val`: js.Any, `type`: js.Function): scala.Unit = js.native
  def instanceOf(`val`: js.Any, `type`: js.Function, msg: java.lang.String): scala.Unit = js.native
  def isArray(`val`: js.Any): scala.Unit = js.native
  def isArray(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isBoolean(`val`: js.Any): scala.Unit = js.native
  def isBoolean(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isDefined(`val`: js.Any): scala.Unit = js.native
  def isDefined(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isFalse(`val`: js.Any): scala.Unit = js.native
  def isFalse(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isFunction(`val`: js.Any): scala.Unit = js.native
  def isFunction(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotArray(`val`: js.Any): scala.Unit = js.native
  def isNotArray(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotBoolean(`val`: js.Any): scala.Unit = js.native
  def isNotBoolean(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotFunction(`val`: js.Any): scala.Unit = js.native
  def isNotFunction(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotNull(`val`: js.Any): scala.Unit = js.native
  def isNotNull(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotNumber(`val`: js.Any): scala.Unit = js.native
  def isNotNumber(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotObject(`val`: js.Any): scala.Unit = js.native
  def isNotObject(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotString(`val`: js.Any): scala.Unit = js.native
  def isNotString(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNull(`val`: js.Any): scala.Unit = js.native
  def isNull(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNumber(`val`: js.Any): scala.Unit = js.native
  def isNumber(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isObject(`val`: js.Any): scala.Unit = js.native
  def isObject(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isString(`val`: js.Any): scala.Unit = js.native
  def isString(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isTrue(`val`: js.Any): scala.Unit = js.native
  def isTrue(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isUndefined(`val`: js.Any): scala.Unit = js.native
  def isUndefined(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def lengthOf(exp: js.Any, len: scala.Double): scala.Unit = js.native
  def lengthOf(exp: js.Any, len: scala.Double, msg: java.lang.String): scala.Unit = js.native
  def `match`(exp: js.Any, re: stdLib.RegExp): scala.Unit = js.native
  def `match`(exp: js.Any, re: stdLib.RegExp, msg: java.lang.String): scala.Unit = js.native
  def notDeepEqual(act: js.Any, exp: js.Any): scala.Unit = js.native
  def notDeepEqual(act: js.Any, exp: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notDeepProperty(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String): scala.Unit = js.native
  def notDeepProperty(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def notEqual(act: js.Any, exp: js.Any): scala.Unit = js.native
  def notEqual(act: js.Any, exp: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notInclude(exp: java.lang.String, inc: js.Any): scala.Unit = js.native
  def notInclude(exp: java.lang.String, inc: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notInclude(exp: js.Array[_], inc: js.Any): scala.Unit = js.native
  def notInclude(exp: js.Array[_], inc: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notInstanceOf(`val`: js.Any, `type`: js.Function): scala.Unit = js.native
  def notInstanceOf(`val`: js.Any, `type`: js.Function, msg: java.lang.String): scala.Unit = js.native
  def notMatch(exp: js.Any, re: stdLib.RegExp): scala.Unit = js.native
  def notMatch(exp: js.Any, re: stdLib.RegExp, msg: java.lang.String): scala.Unit = js.native
  def notOk(`val`: js.Any): scala.Unit = js.native
  def notOk(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notProperty(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String): scala.Unit = js.native
  def notProperty(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def notStrictEqual(act: js.Any, exp: js.Any): scala.Unit = js.native
  def notStrictEqual(act: js.Any, exp: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notTypeOf(`val`: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def notTypeOf(`val`: js.Any, `type`: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def ok(`val`: js.Any): scala.Unit = js.native
  def ok(`val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def operator(`val`: js.Any, operator: java.lang.String, val2: js.Any): scala.Unit = js.native
  def operator(`val`: js.Any, operator: java.lang.String, val2: js.Any, msg: java.lang.String): scala.Unit = js.native
  def property(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String): scala.Unit = js.native
  def property(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def propertyNotVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def propertyNotVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def propertyVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def propertyVal(obj: jqueryDotAjaxfileLib.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): scala.Unit = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): scala.Unit = js.native
  def strictEqual(act: js.Any, exp: js.Any): scala.Unit = js.native
  def strictEqual(act: js.Any, exp: js.Any, msg: java.lang.String): scala.Unit = js.native
  //alias frenzy
  def `throw`(fn: js.Function): scala.Unit = js.native
  def `throw`(fn: js.Function, errType: js.Function): scala.Unit = js.native
  def `throw`(fn: js.Function, errType: js.Function, msg: java.lang.String): scala.Unit = js.native
  def `throw`(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  //alias frenzy
  def `throw`(fn: js.Function, msg: java.lang.String): scala.Unit = js.native
  def `throw`(fn: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def throws(fn: js.Function): scala.Unit = js.native
  def throws(fn: js.Function, errType: js.Function): scala.Unit = js.native
  def throws(fn: js.Function, errType: js.Function, msg: java.lang.String): scala.Unit = js.native
  def throws(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def throws(fn: js.Function, msg: java.lang.String): scala.Unit = js.native
  def throws(fn: js.Function, regExp: stdLib.RegExp): scala.Unit = js.native
  def typeOf(`val`: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def typeOf(`val`: js.Any, `type`: java.lang.String, msg: java.lang.String): scala.Unit = js.native
}

