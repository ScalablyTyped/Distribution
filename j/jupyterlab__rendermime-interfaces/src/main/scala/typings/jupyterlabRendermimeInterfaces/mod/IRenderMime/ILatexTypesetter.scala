package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a LaTeX typesetter.
  */
trait ILatexTypesetter extends StObject {
  
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
  
  @scala.inline
  implicit class ILatexTypesetterMutableBuilder[Self <: ILatexTypesetter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeset(value: HTMLElement => Unit): Self = StObject.set(x, "typeset", js.Any.fromFunction1(value))
  }
}
