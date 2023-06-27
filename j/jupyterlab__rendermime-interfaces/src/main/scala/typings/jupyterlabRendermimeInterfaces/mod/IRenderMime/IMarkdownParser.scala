package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a Markdown parser.
  */
trait IMarkdownParser extends StObject {
  
  /**
    * Render a markdown source.
    *
    * @param source - The string to render.
    * @returns - A promise of the string.
    */
  def render(source: String): js.Promise[String]
}
object IMarkdownParser {
  
  inline def apply(render: String => js.Promise[String]): IMarkdownParser = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[IMarkdownParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMarkdownParser] (val x: Self) extends AnyVal {
    
    inline def setRender(value: String => js.Promise[String]): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
