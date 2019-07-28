package typings.jsDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  def `!=`(value: js.Any, predicate: js.Any): Boolean
  def `!==`(value: js.Any, predicate: js.Any): Boolean
  def `<`(value: js.Any, predicate: js.Any): Boolean
  def `<=`(value: js.Any, predicate: js.Any): Boolean
  def `==`(value: js.Any, predicate: js.Any): Boolean
  def `===`(value: js.Any, predicate: js.Any): Boolean
  def `>`(value: js.Any, predicate: js.Any): Boolean
  def `>=`(value: js.Any, predicate: js.Any): Boolean
  def contains(value: js.Any, predicate: js.Any): Boolean
  def in(value: js.Any, predicate: js.Any): Boolean
  def isectEmpty(value: js.Any, predicate: js.Any): Boolean
  def isectNotEmpty(value: js.Any, predicate: js.Any): Double
  def notContains(value: js.Any, predicate: js.Any): Boolean
  def notIn(value: js.Any, predicate: js.Any): Boolean
}

object Anon_ {
  @scala.inline
  def apply(
    `!=`: (js.Any, js.Any) => Boolean,
    `!==`: (js.Any, js.Any) => Boolean,
    `<`: (js.Any, js.Any) => Boolean,
    `<=`: (js.Any, js.Any) => Boolean,
    `==`: (js.Any, js.Any) => Boolean,
    `===`: (js.Any, js.Any) => Boolean,
    `>`: (js.Any, js.Any) => Boolean,
    `>=`: (js.Any, js.Any) => Boolean,
    contains: (js.Any, js.Any) => Boolean,
    in: (js.Any, js.Any) => Boolean,
    isectEmpty: (js.Any, js.Any) => Boolean,
    isectNotEmpty: (js.Any, js.Any) => Double,
    notContains: (js.Any, js.Any) => Boolean,
    notIn: (js.Any, js.Any) => Boolean
  ): Anon_ = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), in = js.Any.fromFunction2(in), isectEmpty = js.Any.fromFunction2(isectEmpty), isectNotEmpty = js.Any.fromFunction2(isectNotEmpty), notContains = js.Any.fromFunction2(notContains), notIn = js.Any.fromFunction2(notIn))
    __obj.updateDynamic("!=")(js.Any.fromFunction2(`!=`))
    __obj.updateDynamic("!==")(js.Any.fromFunction2(`!==`))
    __obj.updateDynamic("<")(js.Any.fromFunction2(`<`))
    __obj.updateDynamic("<=")(js.Any.fromFunction2(`<=`))
    __obj.updateDynamic("==")(js.Any.fromFunction2(`==`))
    __obj.updateDynamic("===")(js.Any.fromFunction2(`===`))
    __obj.updateDynamic(">")(js.Any.fromFunction2(`>`))
    __obj.updateDynamic(">=")(js.Any.fromFunction2(`>=`))
    __obj.asInstanceOf[Anon_]
  }
}

