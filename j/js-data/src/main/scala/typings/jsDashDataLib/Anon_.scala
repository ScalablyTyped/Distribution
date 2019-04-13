package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  def `!=`(value: js.Any, predicate: js.Any): scala.Boolean
  def `!==`(value: js.Any, predicate: js.Any): scala.Boolean
  def `<`(value: js.Any, predicate: js.Any): scala.Boolean
  def `<=`(value: js.Any, predicate: js.Any): scala.Boolean
  def `==`(value: js.Any, predicate: js.Any): scala.Boolean
  def `===`(value: js.Any, predicate: js.Any): scala.Boolean
  def `>`(value: js.Any, predicate: js.Any): scala.Boolean
  def `>=`(value: js.Any, predicate: js.Any): scala.Boolean
  def contains(value: js.Any, predicate: js.Any): scala.Boolean
  def in(value: js.Any, predicate: js.Any): scala.Boolean
  def isectEmpty(value: js.Any, predicate: js.Any): scala.Boolean
  def isectNotEmpty(value: js.Any, predicate: js.Any): scala.Double
  def notContains(value: js.Any, predicate: js.Any): scala.Boolean
  def notIn(value: js.Any, predicate: js.Any): scala.Boolean
}

object Anon_ {
  @scala.inline
  def apply(
    `!=`: (js.Any, js.Any) => scala.Boolean,
    `!==`: (js.Any, js.Any) => scala.Boolean,
    `<`: (js.Any, js.Any) => scala.Boolean,
    `<=`: (js.Any, js.Any) => scala.Boolean,
    `==`: (js.Any, js.Any) => scala.Boolean,
    `===`: (js.Any, js.Any) => scala.Boolean,
    `>`: (js.Any, js.Any) => scala.Boolean,
    `>=`: (js.Any, js.Any) => scala.Boolean,
    contains: (js.Any, js.Any) => scala.Boolean,
    in: (js.Any, js.Any) => scala.Boolean,
    isectEmpty: (js.Any, js.Any) => scala.Boolean,
    isectNotEmpty: (js.Any, js.Any) => scala.Double,
    notContains: (js.Any, js.Any) => scala.Boolean,
    notIn: (js.Any, js.Any) => scala.Boolean
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

