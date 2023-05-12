package typings.marked.mod.marked

import typings.marked.markedBooleans.`false`
import typings.marked.mod.marked.Tokens.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererExtension
  extends StObject
     with _TokenizerAndRendererExtension {
  
  var name: String
  
  def renderer(token: Generic): String | `false`
}
object RendererExtension {
  
  inline def apply(name: String, renderer: Generic => String | `false`): RendererExtension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[RendererExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererExtension] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Generic => String | `false`): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
