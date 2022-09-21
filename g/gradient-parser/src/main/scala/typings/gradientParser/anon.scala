package typings.gradientParser

import typings.gradientParser.mod.EmNode
import typings.gradientParser.mod.ExtentKeywordNode
import typings.gradientParser.mod.PercentNode
import typings.gradientParser.mod.PositionKeywordNode
import typings.gradientParser.mod.PxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait X extends StObject {
    
    var x: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode
    
    var y: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode
  }
  object X {
    
    inline def apply(
      x: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode,
      y: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode
    ): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
