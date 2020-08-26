package typings.jsplumb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIComponent extends js.Object {
  def getParameter(name: String): js.Any = js.native
  def getParameters(): Record[String, _] = js.native
  def setParameter(name: String, value: js.Any): Unit = js.native
  def setParameters(parameters: Record[String, _]): Unit = js.native
}

object UIComponent {
  @scala.inline
  def apply(
    getParameter: String => js.Any,
    getParameters: () => Record[String, _],
    setParameter: (String, js.Any) => Unit,
    setParameters: Record[String, _] => Unit
  ): UIComponent = {
    val __obj = js.Dynamic.literal(getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), setParameter = js.Any.fromFunction2(setParameter), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[UIComponent]
  }
  @scala.inline
  implicit class UIComponentOps[Self <: UIComponent] (val x: Self) extends AnyVal {
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
    def setGetParameter(value: String => js.Any): Self = this.set("getParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setGetParameters(value: () => Record[String, _]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setSetParameter(value: (String, js.Any) => Unit): Self = this.set("setParameter", js.Any.fromFunction2(value))
    @scala.inline
    def setSetParameters(value: Record[String, _] => Unit): Self = this.set("setParameters", js.Any.fromFunction1(value))
  }
  
}

