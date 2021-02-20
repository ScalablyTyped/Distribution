package typings.guardianProsemirrorInvisibles

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.Decoration
import typings.prosemirrorView.mod.DecorationSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@guardian/prosemirror-invisibles", JSImport.Default)
  @js.native
  def default(builders: js.Array[Builder]): Plugin[_, _] = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "character")
  @js.native
  def character(`type`: String): js.Function1[/* predicate */ js.Function1[/* char */ String, Boolean], Builder] = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "createDeco")
  @js.native
  def createDeco(pos: Double, `type`: String): Decoration[StringDictionary[_]] = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "hardBreak")
  @js.native
  def hardBreak(): Builder = js.native
  @JSImport("@guardian/prosemirror-invisibles", "hardBreak")
  @js.native
  def hardBreak(predicate: js.Function1[/* node */ Node[_], Boolean]): Builder = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "node")
  @js.native
  def node(`type`: String, toPosition: js.Function2[/* node */ Node[_], /* pos */ Double, Double]): js.Function1[/* predicate */ js.Function1[/* node */ Node[_], Boolean], Builder] = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "paragraph")
  @js.native
  def paragraph(): Builder = js.native
  @JSImport("@guardian/prosemirror-invisibles", "paragraph")
  @js.native
  def paragraph(predicate: js.Function1[/* node */ Node[_], Boolean]): Builder = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "space")
  @js.native
  def space(): Builder = js.native
  @JSImport("@guardian/prosemirror-invisibles", "space")
  @js.native
  def space(predicate: js.Function1[/* char */ String, Boolean]): Builder = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "textBetween")
  @js.native
  def textBetween(from: Double, to: Double, doc: Node[_]): js.Array[TextBetweenPosition] = js.native
  
  type Builder = js.Function4[
    /* from */ Double, 
    /* to */ Double, 
    /* doc */ Node[js.Any], 
    /* decos */ DecorationSet[js.Any], 
    DecorationSet[js.Any]
  ]
  
  @js.native
  trait TextBetweenPosition extends StObject {
    
    var pos: Double = js.native
    
    var text: String = js.native
  }
  object TextBetweenPosition {
    
    @scala.inline
    def apply(pos: Double, text: String): TextBetweenPosition = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextBetweenPosition]
    }
    
    @scala.inline
    implicit class TextBetweenPositionMutableBuilder[Self <: TextBetweenPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
