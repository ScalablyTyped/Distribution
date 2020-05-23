package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _empty extends js.Object {
  @JSName("=")
  def Equalssign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName("==")
  def EqualssignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName("===")
  def EqualssignEqualssignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName("!=")
  def ExclamationmarkEqualssign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName("!==")
  def ExclamationmarkEqualssignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName(">")
  def Greaterthansign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName(">=")
  def GreaterthansignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName("<")
  def Lessthansign(value: js.Any, predicate: js.Any): scala.Boolean
  @JSName("<=")
  def LessthansignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean
  def contains(value: js.Any, predicate: js.Any): scala.Boolean
  def in(value: js.Any, predicate: js.Any): scala.Boolean
  def isectEmpty(value: js.Any, predicate: js.Any): scala.Boolean
  def isectNotEmpty(value: js.Any, predicate: js.Any): Double
  def notContains(value: js.Any, predicate: js.Any): scala.Boolean
  def notIn(value: js.Any, predicate: js.Any): scala.Boolean
}

object _empty {
  @scala.inline
  def apply(
    Equalssign: (js.Any, js.Any) => scala.Boolean,
    EqualssignEqualssign: (js.Any, js.Any) => scala.Boolean,
    EqualssignEqualssignEqualssign: (js.Any, js.Any) => scala.Boolean,
    ExclamationmarkEqualssign: (js.Any, js.Any) => scala.Boolean,
    ExclamationmarkEqualssignEqualssign: (js.Any, js.Any) => scala.Boolean,
    Greaterthansign: (js.Any, js.Any) => scala.Boolean,
    GreaterthansignEqualssign: (js.Any, js.Any) => scala.Boolean,
    Lessthansign: (js.Any, js.Any) => scala.Boolean,
    LessthansignEqualssign: (js.Any, js.Any) => scala.Boolean,
    contains: (js.Any, js.Any) => scala.Boolean,
    in: (js.Any, js.Any) => scala.Boolean,
    isectEmpty: (js.Any, js.Any) => scala.Boolean,
    isectNotEmpty: (js.Any, js.Any) => Double,
    notContains: (js.Any, js.Any) => scala.Boolean,
    notIn: (js.Any, js.Any) => scala.Boolean
  ): _empty = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), in = js.Any.fromFunction2(in), isectEmpty = js.Any.fromFunction2(isectEmpty), isectNotEmpty = js.Any.fromFunction2(isectNotEmpty), notContains = js.Any.fromFunction2(notContains), notIn = js.Any.fromFunction2(notIn))
    __obj.updateDynamic("=")(js.Any.fromFunction2(Equalssign))
    __obj.updateDynamic("==")(js.Any.fromFunction2(EqualssignEqualssign))
    __obj.updateDynamic("===")(js.Any.fromFunction2(EqualssignEqualssignEqualssign))
    __obj.updateDynamic("!=")(js.Any.fromFunction2(ExclamationmarkEqualssign))
    __obj.updateDynamic("!==")(js.Any.fromFunction2(ExclamationmarkEqualssignEqualssign))
    __obj.updateDynamic(">")(js.Any.fromFunction2(Greaterthansign))
    __obj.updateDynamic(">=")(js.Any.fromFunction2(GreaterthansignEqualssign))
    __obj.updateDynamic("<")(js.Any.fromFunction2(Lessthansign))
    __obj.updateDynamic("<=")(js.Any.fromFunction2(LessthansignEqualssign))
    __obj.asInstanceOf[_empty]
  }
}

