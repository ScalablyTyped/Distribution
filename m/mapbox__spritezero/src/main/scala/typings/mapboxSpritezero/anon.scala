package typings.mapboxSpritezero

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var svg: Buffer
  }
  object Id {
    
    inline def apply(id: String, svg: Buffer): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: Buffer): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
