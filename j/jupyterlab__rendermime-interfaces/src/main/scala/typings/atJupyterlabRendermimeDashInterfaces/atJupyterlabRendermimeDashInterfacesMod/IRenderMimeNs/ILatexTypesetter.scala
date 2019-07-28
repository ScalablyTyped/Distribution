package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a LaTeX typesetter.
  */
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
  def typeset(element: HTMLElement): Unit
}

object ILatexTypesetter {
  @scala.inline
  def apply(typeset: HTMLElement => Unit): ILatexTypesetter = {
    val __obj = js.Dynamic.literal(typeset = js.Any.fromFunction1(typeset))
  
    __obj.asInstanceOf[ILatexTypesetter]
  }
}

