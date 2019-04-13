package typings
package koaDashBouncerLib.koaDashBouncerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", "Validator")
@js.native
class Validator protected () extends js.Object {
  def this(props: koaDashBouncerLib.Anon_Ctx) = this()
  def check(result: js.Any): Validator = js.native
  def check(result: js.Any, tip: java.lang.String): Validator = js.native
  def checkNot(result: js.Any): Validator = js.native
  def checkNot(result: js.Any, tip: java.lang.String): Validator = js.native
  def checkNotPred(pred: js.Any): Validator = js.native
  def checkNotPred(pred: js.Any, tip: java.lang.String): Validator = js.native
  def checkPred(pred: js.Any): Validator = js.native
  def checkPred(pred: js.Any, tip: java.lang.String): Validator = js.native
  def clamp(min: scala.Double, max: scala.Double): Validator = js.native
  def defaultTo(valueOrFunction: js.Any): Validator = js.native
  def encodeBase64(): Validator = js.native
  def encodeBase64(tip: java.lang.String): Validator = js.native
  def eq(otherVal: java.lang.String): Validator = js.native
  def eq(otherVal: java.lang.String, tip: java.lang.String): Validator = js.native
  def fromJson(): Validator = js.native
  def fromJson(tip: java.lang.String): Validator = js.native
  def gt(otherVal: scala.Double): Validator = js.native
  def gt(otherVal: scala.Double, tip: java.lang.String): Validator = js.native
  def gte(otherVal: scala.Double): Validator = js.native
  def gte(otherVal: scala.Double, tip: java.lang.String): Validator = js.native
  def isAlpha(): Validator = js.native
  def isAlpha(tip: java.lang.String): Validator = js.native
  def isAlphanumeric(): Validator = js.native
  def isAlphanumeric(tip: java.lang.String): Validator = js.native
  def isArray(): Validator = js.native
  def isArray(tip: java.lang.String): Validator = js.native
  def isAscii(): Validator = js.native
  def isAscii(tip: java.lang.String): Validator = js.native
  def isBase64(): Validator = js.native
  def isBase64(tip: java.lang.String): Validator = js.native
  def isEmail(): Validator = js.native
  def isEmail(tip: java.lang.String): Validator = js.native
  def isFiniteNumber(): Validator = js.native
  def isFiniteNumber(tip: java.lang.String): Validator = js.native
  def isHexColor(): Validator = js.native
  def isHexColor(tip: java.lang.String): Validator = js.native
  def isIn(arr: js.Array[_]): Validator = js.native
  def isIn(arr: js.Array[_], tip: java.lang.String): Validator = js.native
  def isInt(): Validator = js.native
  def isInt(tip: java.lang.String): Validator = js.native
  def isJson(): Validator = js.native
  def isJson(tip: java.lang.String): Validator = js.native
  def isLength(min: scala.Double, max: scala.Double): Validator = js.native
  def isLength(min: scala.Double, max: scala.Double, tip: java.lang.String): Validator = js.native
  def isNotIn(arr: js.Array[_]): Validator = js.native
  def isNotIn(arr: js.Array[_], tip: java.lang.String): Validator = js.native
  def isNumeric(): Validator = js.native
  def isNumeric(tip: java.lang.String): Validator = js.native
  def isString(): Validator = js.native
  def isString(tip: java.lang.String): Validator = js.native
  def isUuid(): Validator = js.native
  def isUuid(tip: java.lang.String): Validator = js.native
  def lt(otherVal: scala.Double): Validator = js.native
  def lt(otherVal: scala.Double, tip: java.lang.String): Validator = js.native
  def lte(otherVal: scala.Double): Validator = js.native
  def lte(otherVal: scala.Double, tip: java.lang.String): Validator = js.native
  def `match`(regexp: stdLib.RegExp): Validator = js.native
  def `match`(regexp: stdLib.RegExp, tip: java.lang.String): Validator = js.native
  def notMatch(regexp: stdLib.RegExp): Validator = js.native
  def notMatch(regexp: stdLib.RegExp, tip: java.lang.String): Validator = js.native
  def optional(): Validator = js.native
  def required(): Validator = js.native
  def required(tip: java.lang.String): Validator = js.native
  def tap(f: js.Function1[/* arg */ js.Any, _]): Validator = js.native
  def tap(f: js.Function1[/* arg */ js.Any, _], tip: java.lang.String): Validator = js.native
  def toArray(): Validator = js.native
  def toBoolean(): Validator = js.native
  def toDecimal(): Validator = js.native
  def toDecimal(tip: java.lang.String): Validator = js.native
  def toFiniteFloat(): Validator = js.native
  def toFloat(): Validator = js.native
  def toFloat(tip: java.lang.String): Validator = js.native
  def toInt(): Validator = js.native
  def toInt(tip: java.lang.String): Validator = js.native
  def toInts(): Validator = js.native
  def toInts(tip: java.lang.String): Validator = js.native
  def trim(): Validator = js.native
  def uniq(): Validator = js.native
}

/* static members */
@JSImport("koa-bouncer", "Validator")
@js.native
object Validator extends js.Object {
  def addMethod(name: java.lang.String, fn: js.Function): scala.Unit = js.native
}

