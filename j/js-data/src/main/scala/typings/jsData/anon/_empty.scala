package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _empty extends js.Object {
  @JSName("=")
  def Equalssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName("==")
  def EqualssignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName("===")
  def EqualssignEqualssignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName("!=")
  def ExclamationmarkEqualssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName("!==")
  def ExclamationmarkEqualssignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName(">")
  def Greaterthansign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName(">=")
  def GreaterthansignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName("<")
  def Lessthansign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  @JSName("<=")
  def LessthansignEqualssign(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  def contains(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  def in(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  def isectEmpty(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  def isectNotEmpty(value: js.Any, predicate: js.Any): Double = js.native
  def notContains(value: js.Any, predicate: js.Any): scala.Boolean = js.native
  def notIn(value: js.Any, predicate: js.Any): scala.Boolean = js.native
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
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("=", js.Any.fromFunction2(value))
    @scala.inline
    def setEqualssignEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("==", js.Any.fromFunction2(value))
    @scala.inline
    def setEqualssignEqualssignEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("===", js.Any.fromFunction2(value))
    @scala.inline
    def setExclamationmarkEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("!=", js.Any.fromFunction2(value))
    @scala.inline
    def setExclamationmarkEqualssignEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("!==", js.Any.fromFunction2(value))
    @scala.inline
    def setGreaterthansign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set(">", js.Any.fromFunction2(value))
    @scala.inline
    def setGreaterthansignEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set(">=", js.Any.fromFunction2(value))
    @scala.inline
    def setLessthansign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("<", js.Any.fromFunction2(value))
    @scala.inline
    def setLessthansignEqualssign(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("<=", js.Any.fromFunction2(value))
    @scala.inline
    def setContains(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    @scala.inline
    def setIn(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("in", js.Any.fromFunction2(value))
    @scala.inline
    def setIsectEmpty(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("isectEmpty", js.Any.fromFunction2(value))
    @scala.inline
    def setIsectNotEmpty(value: (js.Any, js.Any) => Double): Self = this.set("isectNotEmpty", js.Any.fromFunction2(value))
    @scala.inline
    def setNotContains(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("notContains", js.Any.fromFunction2(value))
    @scala.inline
    def setNotIn(value: (js.Any, js.Any) => scala.Boolean): Self = this.set("notIn", js.Any.fromFunction2(value))
  }
  
}

