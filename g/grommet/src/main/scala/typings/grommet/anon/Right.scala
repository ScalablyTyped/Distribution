package typings.grommet.anon

import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Right extends StObject {
  
  var bottom: js.UndefOr[top | typings.grommet.grommetStrings.bottom] = js.native
  
  var left: js.UndefOr[right | typings.grommet.grommetStrings.left] = js.native
  
  var right: js.UndefOr[typings.grommet.grommetStrings.right | left] = js.native
  
  var top: js.UndefOr[typings.grommet.grommetStrings.top | bottom] = js.native
}
object Right {
  
  @scala.inline
  def apply(): Right = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Right]
  }
  
  @scala.inline
  implicit class RightMutableBuilder[Self <: Right] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: top | bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: right | left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: right | left): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: top | bottom): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
