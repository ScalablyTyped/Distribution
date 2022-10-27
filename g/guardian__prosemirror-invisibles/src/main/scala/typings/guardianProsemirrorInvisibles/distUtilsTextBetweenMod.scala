package typings.guardianProsemirrorInvisibles

import typings.prosemirrorModel.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTextBetweenMod {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/utils/text-between", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(from: Double, to: Double, doc: Node): js.Array[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Position]]
  
  trait Position extends StObject {
    
    var pos: Double
    
    var text: String
  }
  object Position {
    
    inline def apply(pos: Double, text: String): Position = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
