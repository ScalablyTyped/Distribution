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
    */
  def typeset(element: HTMLElement): Unit
}
object ILatexTypesetter {
  
  inline def apply(typeset: HTMLElement => Unit): ILatexTypesetter = {
    val __obj = js.Dynamic.literal(typeset = js.Any.fromFunction1(typeset))
    __obj.asInstanceOf[ILatexTypesetter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILatexTypesetter] (val x: Self) extends AnyVal {
    
    inline def setTypeset(value: HTMLElement => Unit): Self = StObject.set(x, "typeset", js.Any.fromFunction1(value))
  }
}
