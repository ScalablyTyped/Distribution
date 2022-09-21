package typings.guardianProsemirrorInvisibles

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.Decoration
import typings.prosemirrorView.mod.DecorationSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@guardian/prosemirror-invisibles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(builders: js.Array[Builder]): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(builders.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  inline def character(`type`: String): js.Function1[/* predicate */ js.Function1[/* char */ String, Boolean], Builder] = ^.asInstanceOf[js.Dynamic].applyDynamic("character")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* predicate */ js.Function1[/* char */ String, Boolean], Builder]]
  
  inline def createDeco(pos: Double, `type`: String): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeco")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Decoration]
  
  inline def hardBreak(): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")().asInstanceOf[Builder]
  inline def hardBreak(predicate: js.Function1[/* node */ Node, Boolean]): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(predicate.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  inline def node(`type`: String, toPosition: js.Function2[/* node */ Node, /* pos */ Double, Double]): js.Function1[/* predicate */ js.Function1[/* node */ Node, Boolean], Builder] = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(`type`.asInstanceOf[js.Any], toPosition.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* predicate */ js.Function1[/* node */ Node, Boolean], Builder]]
  
  inline def paragraph(): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")().asInstanceOf[Builder]
  inline def paragraph(predicate: js.Function1[/* node */ Node, Boolean]): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(predicate.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  inline def space(): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("space")().asInstanceOf[Builder]
  inline def space(predicate: js.Function1[/* char */ String, Boolean]): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("space")(predicate.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  inline def textBetween(from: Double, to: Double, doc: Node): js.Array[TextBetweenPosition] = (^.asInstanceOf[js.Dynamic].applyDynamic("textBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextBetweenPosition]]
  
  type Builder = js.Function4[
    /* from */ Double, 
    /* to */ Double, 
    /* doc */ Node, 
    /* decos */ DecorationSet, 
    DecorationSet
  ]
  
  trait TextBetweenPosition extends StObject {
    
    var pos: Double
    
    var text: String
  }
  object TextBetweenPosition {
    
    inline def apply(pos: Double, text: String): TextBetweenPosition = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextBetweenPosition]
    }
    
    extension [Self <: TextBetweenPosition](x: Self) {
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
