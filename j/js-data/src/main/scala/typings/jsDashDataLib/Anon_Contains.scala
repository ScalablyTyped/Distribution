package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contains extends js.Object {
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

object Anon_Contains {
  @scala.inline
  def apply(
    `!=`: js.Function2[js.Any, js.Any, scala.Boolean],
    `!==`: js.Function2[js.Any, js.Any, scala.Boolean],
    `<`: js.Function2[js.Any, js.Any, scala.Boolean],
    `<=`: js.Function2[js.Any, js.Any, scala.Boolean],
    `==`: js.Function2[js.Any, js.Any, scala.Boolean],
    `===`: js.Function2[js.Any, js.Any, scala.Boolean],
    `>`: js.Function2[js.Any, js.Any, scala.Boolean],
    `>=`: js.Function2[js.Any, js.Any, scala.Boolean],
    contains: js.Function2[js.Any, js.Any, scala.Boolean],
    in: js.Function2[js.Any, js.Any, scala.Boolean],
    isectEmpty: js.Function2[js.Any, js.Any, scala.Boolean],
    isectNotEmpty: js.Function2[js.Any, js.Any, scala.Double],
    notContains: js.Function2[js.Any, js.Any, scala.Boolean],
    notIn: js.Function2[js.Any, js.Any, scala.Boolean]
  ): Anon_Contains = {
    val __obj = js.Dynamic.literal(`!=` = `!=`, `!==` = `!==`, `<` = `<`, `<=` = `<=`, `==` = `==`, `===` = `===`, `>` = `>`, `>=` = `>=`)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("isectEmpty")(isectEmpty)
    __obj.updateDynamic("isectNotEmpty")(isectNotEmpty)
    __obj.updateDynamic("notContains")(notContains)
    __obj.updateDynamic("notIn")(notIn)
    __obj.asInstanceOf[Anon_Contains]
  }
}

