package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a LaTeX typesetter.
  */
@js.native
trait ILatexTypesetter extends js.Object {
  /**
    * Typeset a DOM element.
    *
    * @param element - the DOM element to typeset. The typesetting may
    *   happen synchronously or asynchronously.
    *
    * #### Notes
    * The application-wide rendermime object has a settable
    * `latexTypesetter` property which is used wherever LaTeX
    * typesetting is required. Extensions wishing to provide their
    * own typesetter may replace that on the global `lab.rendermime`.
    */
  def typeset(element: HTMLElement): Unit = js.native
}

object ILatexTypesetter {
  @scala.inline
  def apply(typeset: HTMLElement => Unit): ILatexTypesetter = {
    val __obj = js.Dynamic.literal(typeset = js.Any.fromFunction1(typeset))
    __obj.asInstanceOf[ILatexTypesetter]
  }
  @scala.inline
  implicit class ILatexTypesetterOps[Self <: ILatexTypesetter] (val x: Self) extends AnyVal {
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
    def setTypeset(value: HTMLElement => Unit): Self = this.set("typeset", js.Any.fromFunction1(value))
  }
  
}

