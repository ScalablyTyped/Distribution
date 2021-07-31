package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinderPatternInfo extends StObject {
  
  val BottomLeft: AlignmentPattern
  
  val TopLeft: AlignmentPattern
  
  val TopRight: AlignmentPattern
}
object FinderPatternInfo {
  
  @scala.inline
  def apply(BottomLeft: AlignmentPattern, TopLeft: AlignmentPattern, TopRight: AlignmentPattern): FinderPatternInfo = {
    val __obj = js.Dynamic.literal(BottomLeft = BottomLeft.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any], TopRight = TopRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderPatternInfo]
  }
  
  @scala.inline
  implicit class FinderPatternInfoMutableBuilder[Self <: FinderPatternInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomLeft(value: AlignmentPattern): Self = StObject.set(x, "BottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeft(value: AlignmentPattern): Self = StObject.set(x, "TopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRight(value: AlignmentPattern): Self = StObject.set(x, "TopRight", value.asInstanceOf[js.Any])
  }
}
