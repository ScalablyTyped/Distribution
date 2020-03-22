package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName("=")
  def Equalssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("==")
  def EqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("===")
  def EqualssignEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("!=")
  def ExclamationmarkEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("!==")
  def ExclamationmarkEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName(">")
  def Greaterthansign(value: js.Any, predicate: js.Any): Boolean
  @JSName(">=")
  def GreaterthansignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("<")
  def Lessthansign(value: js.Any, predicate: js.Any): Boolean
  @JSName("<=")
  def LessthansignEqualssign(value: js.Any, predicate: js.Any): Boolean
  def contains(value: js.Any, predicate: js.Any): Boolean
  def in(value: js.Any, predicate: js.Any): Boolean
  def isectEmpty(value: js.Any, predicate: js.Any): Boolean
  def isectNotEmpty(value: js.Any, predicate: js.Any): Double
  def notContains(value: js.Any, predicate: js.Any): Boolean
  def notIn(value: js.Any, predicate: js.Any): Boolean
}

object Anon {
  @scala.inline
  def apply(
    Equalssign: (js.Any, js.Any) => Boolean,
    EqualssignEqualssign: (js.Any, js.Any) => Boolean,
    EqualssignEqualssignEqualssign: (js.Any, js.Any) => Boolean,
    ExclamationmarkEqualssign: (js.Any, js.Any) => Boolean,
    ExclamationmarkEqualssignEqualssign: (js.Any, js.Any) => Boolean,
    Greaterthansign: (js.Any, js.Any) => Boolean,
    GreaterthansignEqualssign: (js.Any, js.Any) => Boolean,
    Lessthansign: (js.Any, js.Any) => Boolean,
    LessthansignEqualssign: (js.Any, js.Any) => Boolean,
    contains: (js.Any, js.Any) => Boolean,
    in: (js.Any, js.Any) => Boolean,
    isectEmpty: (js.Any, js.Any) => Boolean,
    isectNotEmpty: (js.Any, js.Any) => Double,
    notContains: (js.Any, js.Any) => Boolean,
    notIn: (js.Any, js.Any) => Boolean
  ): Anon = {
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
    __obj.asInstanceOf[Anon]
  }
}

