package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryPositionOptions extends StObject {
  
  var at: js.UndefOr[String] = js.native
  
  var collision: js.UndefOr[String] = js.native
  
  var my: js.UndefOr[String] = js.native
  
  var of: js.UndefOr[js.Any] = js.native
  
  var using: js.UndefOr[js.Function] = js.native
  
  var within: js.UndefOr[js.Any] = js.native
}
object JQueryPositionOptions {
  
  @scala.inline
  def apply(): JQueryPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPositionOptions]
  }
  
  @scala.inline
  implicit class JQueryPositionOptionsMutableBuilder[Self <: JQueryPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    @scala.inline
    def setCollision(value: String): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    @scala.inline
    def setMy(value: String): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    @scala.inline
    def setOf(value: js.Any): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    @scala.inline
    def setUsing(value: js.Function): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    
    @scala.inline
    def setWithin(value: js.Any): Self = StObject.set(x, "within", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithinUndefined: Self = StObject.set(x, "within", js.undefined)
  }
}
