package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSuccessEventUIParam extends StObject {
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to the event target form.
    */
  var target: js.UndefOr[String] = js.native
}
object FormSuccessEventUIParam {
  
  @scala.inline
  def apply(): FormSuccessEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormSuccessEventUIParam]
  }
  
  @scala.inline
  implicit class FormSuccessEventUIParamMutableBuilder[Self <: FormSuccessEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
