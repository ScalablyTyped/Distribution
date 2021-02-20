package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferEffect extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String] = js.native
}
object TransferEffect {
  
  @scala.inline
  def apply(): TransferEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferEffect]
  }
  
  @scala.inline
  implicit class TransferEffectMutableBuilder[Self <: TransferEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
