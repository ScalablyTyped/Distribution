package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod extends Shortcut {
  
  @JSImport("@material-ui/core/colors/common", JSImport.Default)
  @js.native
  val default: CommonColors = js.native
  
  trait CommonColors extends StObject {
    
    var black: String
    
    var white: String
  }
  object CommonColors {
    
    @scala.inline
    def apply(black: String, white: String): CommonColors = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonColors]
    }
    
    @scala.inline
    implicit class CommonColorsMutableBuilder[Self <: CommonColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CommonColors
  
  /* This means you don't have to write `default`, but can instead just say `commonMod.foo` */
  override def _to: CommonColors = default
}
