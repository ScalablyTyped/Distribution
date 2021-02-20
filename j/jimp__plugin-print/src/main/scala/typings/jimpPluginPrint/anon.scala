package typings.jimpPluginPrint

import typings.jimpCore.etcMod.GenericCallback
import typings.jimpPluginPrint.mod.Font
import typings.jimpPluginPrint.mod.PrintableText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlignmentX extends StObject {
    
    var alignmentX: Double = js.native
    
    var alignmentY: Double = js.native
    
    var text: String = js.native
  }
  object AlignmentX {
    
    @scala.inline
    def apply(alignmentX: Double, alignmentY: Double, text: String): AlignmentX = {
      val __obj = js.Dynamic.literal(alignmentX = alignmentX.asInstanceOf[js.Any], alignmentY = alignmentY.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignmentX]
    }
    
    @scala.inline
    implicit class AlignmentXMutableBuilder[Self <: AlignmentX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignmentX(value: Double): Self = StObject.set(x, "alignmentX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentY(value: Double): Self = StObject.set(x, "alignmentY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FONTSANS10BLACK extends StObject {
    
    var FONT_SANS_10_BLACK: String = js.native
    
    var FONT_SANS_128_BLACK: String = js.native
    
    var FONT_SANS_128_WHITE: String = js.native
    
    var FONT_SANS_12_BLACK: String = js.native
    
    var FONT_SANS_14_BLACK: String = js.native
    
    var FONT_SANS_16_BLACK: String = js.native
    
    var FONT_SANS_16_WHITE: String = js.native
    
    var FONT_SANS_32_BLACK: String = js.native
    
    var FONT_SANS_32_WHITE: String = js.native
    
    var FONT_SANS_64_BLACK: String = js.native
    
    var FONT_SANS_64_WHITE: String = js.native
    
    // Font locations
    var FONT_SANS_8_BLACK: String = js.native
    
    var FONT_SANS_8_WHITE: String = js.native
    
    def loadFont(file: String): js.Promise[Font] = js.native
    def loadFont(file: String, cb: GenericCallback[Font, _, _]): js.Promise[scala.Nothing] = js.native
    
    def measureText(font: Font, text: PrintableText): Double = js.native
    
    def measureTextHeight(font: Font, text: PrintableText, maxWidth: Double): Double = js.native
  }
}
