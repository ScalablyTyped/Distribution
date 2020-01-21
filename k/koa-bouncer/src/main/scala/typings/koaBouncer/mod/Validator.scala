package typings.koaBouncer.mod

import typings.koaBouncer.AnonCtx
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", "Validator")
@js.native
class Validator protected () extends js.Object {
  def this(props: AnonCtx) = this()
  def check(result: js.Any): Validator = js.native
  def check(result: js.Any, tip: String): Validator = js.native
  def checkNot(result: js.Any): Validator = js.native
  def checkNot(result: js.Any, tip: String): Validator = js.native
  def checkNotPred(pred: js.Any): Validator = js.native
  def checkNotPred(pred: js.Any, tip: String): Validator = js.native
  def checkPred(pred: js.Any): Validator = js.native
  def checkPred(pred: js.Any, tip: String): Validator = js.native
  def clamp(min: Double, max: Double): Validator = js.native
  def defaultTo(valueOrFunction: js.Any): Validator = js.native
  def encodeBase64(): Validator = js.native
  def encodeBase64(tip: String): Validator = js.native
  def eq(otherVal: String): Validator = js.native
  def eq(otherVal: String, tip: String): Validator = js.native
  def fromJson(): Validator = js.native
  def fromJson(tip: String): Validator = js.native
  def gt(otherVal: Double): Validator = js.native
  def gt(otherVal: Double, tip: String): Validator = js.native
  def gte(otherVal: Double): Validator = js.native
  def gte(otherVal: Double, tip: String): Validator = js.native
  def isAlpha(): Validator = js.native
  def isAlpha(tip: String): Validator = js.native
  def isAlphanumeric(): Validator = js.native
  def isAlphanumeric(tip: String): Validator = js.native
  def isArray(): Validator = js.native
  def isArray(tip: String): Validator = js.native
  def isAscii(): Validator = js.native
  def isAscii(tip: String): Validator = js.native
  def isBase64(): Validator = js.native
  def isBase64(tip: String): Validator = js.native
  def isEmail(): Validator = js.native
  def isEmail(tip: String): Validator = js.native
  def isFiniteNumber(): Validator = js.native
  def isFiniteNumber(tip: String): Validator = js.native
  def isHexColor(): Validator = js.native
  def isHexColor(tip: String): Validator = js.native
  def isIn(arr: js.Array[_]): Validator = js.native
  def isIn(arr: js.Array[_], tip: String): Validator = js.native
  def isInt(): Validator = js.native
  def isInt(tip: String): Validator = js.native
  def isJson(): Validator = js.native
  def isJson(tip: String): Validator = js.native
  def isLength(min: Double, max: Double): Validator = js.native
  def isLength(min: Double, max: Double, tip: String): Validator = js.native
  def isNotIn(arr: js.Array[_]): Validator = js.native
  def isNotIn(arr: js.Array[_], tip: String): Validator = js.native
  def isNumeric(): Validator = js.native
  def isNumeric(tip: String): Validator = js.native
  def isString(): Validator = js.native
  def isString(tip: String): Validator = js.native
  def isUuid(): Validator = js.native
  def isUuid(tip: String): Validator = js.native
  def lt(otherVal: Double): Validator = js.native
  def lt(otherVal: Double, tip: String): Validator = js.native
  def lte(otherVal: Double): Validator = js.native
  def lte(otherVal: Double, tip: String): Validator = js.native
  def `match`(regexp: RegExp): Validator = js.native
  def `match`(regexp: RegExp, tip: String): Validator = js.native
  def notMatch(regexp: RegExp): Validator = js.native
  def notMatch(regexp: RegExp, tip: String): Validator = js.native
  def optional(): Validator = js.native
  def required(): Validator = js.native
  def required(tip: String): Validator = js.native
  def tap(f: js.Function1[/* arg */ js.Any, _]): Validator = js.native
  def tap(f: js.Function1[/* arg */ js.Any, _], tip: String): Validator = js.native
  def toArray(): Validator = js.native
  def toBoolean(): Validator = js.native
  def toDecimal(): Validator = js.native
  def toDecimal(tip: String): Validator = js.native
  def toFiniteFloat(): Validator = js.native
  def toFloat(): Validator = js.native
  def toFloat(tip: String): Validator = js.native
  def toInt(): Validator = js.native
  def toInt(tip: String): Validator = js.native
  def toInts(): Validator = js.native
  def toInts(tip: String): Validator = js.native
  def trim(): Validator = js.native
  def uniq(): Validator = js.native
}

/* static members */
@JSImport("koa-bouncer", "Validator")
@js.native
object Validator extends js.Object {
  def addMethod(name: String, fn: js.Function): Unit = js.native
}

