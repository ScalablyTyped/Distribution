package typings.mapboxSpritezero

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var svg: Buffer = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, svg: Buffer): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg(value: Buffer): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
