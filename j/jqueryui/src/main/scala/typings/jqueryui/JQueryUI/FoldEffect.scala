package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldEffect extends StObject {
  
  var horizFirst: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[js.Any] = js.native
}
object FoldEffect {
  
  @scala.inline
  def apply(): FoldEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldEffect]
  }
  
  @scala.inline
  implicit class FoldEffectMutableBuilder[Self <: FoldEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizFirst(value: Boolean): Self = StObject.set(x, "horizFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizFirstUndefined: Self = StObject.set(x, "horizFirst", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
