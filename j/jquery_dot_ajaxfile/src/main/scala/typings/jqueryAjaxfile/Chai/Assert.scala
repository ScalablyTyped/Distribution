package typings.jqueryAjaxfile.Chai

import typings.jqueryAjaxfile.Object
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  /**
    * @param expression Expression to test for truthiness.
    * @param message Message to display on error.
    */
  def apply(expression: js.Any): Unit = js.native
  def apply(expression: js.Any, message: String): Unit = js.native
  def Throw(fn: js.Function): Unit = js.native
  def Throw(fn: js.Function, errType: js.Function): Unit = js.native
  def Throw(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
  def Throw(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  def Throw(fn: js.Function, msg: String): Unit = js.native
  def Throw(fn: js.Function, regExp: RegExp): Unit = js.native
  def closeTo(act: Double, exp: Double, delta: Double): Unit = js.native
  def closeTo(act: Double, exp: Double, delta: Double, msg: String): Unit = js.native
  def deepEqual(act: js.Any, exp: js.Any): Unit = js.native
  def deepEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
  def deepProperty(obj: Object, prop: String): Unit = js.native
  def deepProperty(obj: Object, prop: String, msg: String): Unit = js.native
  def deepPropertyNotVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
  def deepPropertyNotVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
  def deepPropertyVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
  def deepPropertyVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
  def doesNotThrow(fn: js.Function): Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function): Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  def doesNotThrow(fn: js.Function, msg: String): Unit = js.native
  def doesNotThrow(fn: js.Function, regExp: RegExp): Unit = js.native
  def equal(act: js.Any, exp: js.Any): Unit = js.native
  def equal(act: js.Any, exp: js.Any, msg: String): Unit = js.native
  def fail(): Unit = js.native
  def fail(actual: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, msg: String, operator: String): Unit = js.native
  def ifError(`val`: js.Any): Unit = js.native
  def ifError(`val`: js.Any, msg: String): Unit = js.native
  def include(exp: String, inc: js.Any): Unit = js.native
  def include(exp: String, inc: js.Any, msg: String): Unit = js.native
  def include(exp: js.Array[_], inc: js.Any): Unit = js.native
  def include(exp: js.Array[_], inc: js.Any, msg: String): Unit = js.native
  def includeMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def includeMembers(set1: js.Array[_], set2: js.Array[_], msg: String): Unit = js.native
  def instanceOf(`val`: js.Any, `type`: js.Function): Unit = js.native
  def instanceOf(`val`: js.Any, `type`: js.Function, msg: String): Unit = js.native
  def isArray(`val`: js.Any): Unit = js.native
  def isArray(`val`: js.Any, msg: String): Unit = js.native
  def isBoolean(`val`: js.Any): Unit = js.native
  def isBoolean(`val`: js.Any, msg: String): Unit = js.native
  def isDefined(`val`: js.Any): Unit = js.native
  def isDefined(`val`: js.Any, msg: String): Unit = js.native
  def isFalse(`val`: js.Any): Unit = js.native
  def isFalse(`val`: js.Any, msg: String): Unit = js.native
  def isFunction(`val`: js.Any): Unit = js.native
  def isFunction(`val`: js.Any, msg: String): Unit = js.native
  def isNotArray(`val`: js.Any): Unit = js.native
  def isNotArray(`val`: js.Any, msg: String): Unit = js.native
  def isNotBoolean(`val`: js.Any): Unit = js.native
  def isNotBoolean(`val`: js.Any, msg: String): Unit = js.native
  def isNotFunction(`val`: js.Any): Unit = js.native
  def isNotFunction(`val`: js.Any, msg: String): Unit = js.native
  def isNotNull(`val`: js.Any): Unit = js.native
  def isNotNull(`val`: js.Any, msg: String): Unit = js.native
  def isNotNumber(`val`: js.Any): Unit = js.native
  def isNotNumber(`val`: js.Any, msg: String): Unit = js.native
  def isNotObject(`val`: js.Any): Unit = js.native
  def isNotObject(`val`: js.Any, msg: String): Unit = js.native
  def isNotString(`val`: js.Any): Unit = js.native
  def isNotString(`val`: js.Any, msg: String): Unit = js.native
  def isNull(`val`: js.Any): Unit = js.native
  def isNull(`val`: js.Any, msg: String): Unit = js.native
  def isNumber(`val`: js.Any): Unit = js.native
  def isNumber(`val`: js.Any, msg: String): Unit = js.native
  def isObject(`val`: js.Any): Unit = js.native
  def isObject(`val`: js.Any, msg: String): Unit = js.native
  def isString(`val`: js.Any): Unit = js.native
  def isString(`val`: js.Any, msg: String): Unit = js.native
  def isTrue(`val`: js.Any): Unit = js.native
  def isTrue(`val`: js.Any, msg: String): Unit = js.native
  def isUndefined(`val`: js.Any): Unit = js.native
  def isUndefined(`val`: js.Any, msg: String): Unit = js.native
  def lengthOf(exp: js.Any, len: Double): Unit = js.native
  def lengthOf(exp: js.Any, len: Double, msg: String): Unit = js.native
  def `match`(exp: js.Any, re: RegExp): Unit = js.native
  def `match`(exp: js.Any, re: RegExp, msg: String): Unit = js.native
  def notDeepEqual(act: js.Any, exp: js.Any): Unit = js.native
  def notDeepEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
  def notDeepProperty(obj: Object, prop: String): Unit = js.native
  def notDeepProperty(obj: Object, prop: String, msg: String): Unit = js.native
  def notEqual(act: js.Any, exp: js.Any): Unit = js.native
  def notEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
  def notInclude(exp: String, inc: js.Any): Unit = js.native
  def notInclude(exp: String, inc: js.Any, msg: String): Unit = js.native
  def notInclude(exp: js.Array[_], inc: js.Any): Unit = js.native
  def notInclude(exp: js.Array[_], inc: js.Any, msg: String): Unit = js.native
  def notInstanceOf(`val`: js.Any, `type`: js.Function): Unit = js.native
  def notInstanceOf(`val`: js.Any, `type`: js.Function, msg: String): Unit = js.native
  def notMatch(exp: js.Any, re: RegExp): Unit = js.native
  def notMatch(exp: js.Any, re: RegExp, msg: String): Unit = js.native
  def notOk(`val`: js.Any): Unit = js.native
  def notOk(`val`: js.Any, msg: String): Unit = js.native
  def notProperty(obj: Object, prop: String): Unit = js.native
  def notProperty(obj: Object, prop: String, msg: String): Unit = js.native
  def notStrictEqual(act: js.Any, exp: js.Any): Unit = js.native
  def notStrictEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
  def notTypeOf(`val`: js.Any, `type`: String): Unit = js.native
  def notTypeOf(`val`: js.Any, `type`: String, msg: String): Unit = js.native
  def ok(`val`: js.Any): Unit = js.native
  def ok(`val`: js.Any, msg: String): Unit = js.native
  def operator(`val`: js.Any, operator: String, val2: js.Any): Unit = js.native
  def operator(`val`: js.Any, operator: String, val2: js.Any, msg: String): Unit = js.native
  def property(obj: Object, prop: String): Unit = js.native
  def property(obj: Object, prop: String, msg: String): Unit = js.native
  def propertyNotVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
  def propertyNotVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
  def propertyVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
  def propertyVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_], msg: String): Unit = js.native
  def strictEqual(act: js.Any, exp: js.Any): Unit = js.native
  def strictEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
  //alias frenzy
  def `throw`(fn: js.Function): Unit = js.native
  def `throw`(fn: js.Function, errType: js.Function): Unit = js.native
  def `throw`(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
  def `throw`(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  def `throw`(fn: js.Function, msg: String): Unit = js.native
  def `throw`(fn: js.Function, regExp: RegExp): Unit = js.native
  def throws(fn: js.Function): Unit = js.native
  def throws(fn: js.Function, errType: js.Function): Unit = js.native
  def throws(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
  def throws(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
  def throws(fn: js.Function, msg: String): Unit = js.native
  def throws(fn: js.Function, regExp: RegExp): Unit = js.native
  def typeOf(`val`: js.Any, `type`: String): Unit = js.native
  def typeOf(`val`: js.Any, `type`: String, msg: String): Unit = js.native
}

