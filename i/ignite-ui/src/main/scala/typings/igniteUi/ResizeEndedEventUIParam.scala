package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeEndedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ResizeEndedEventUIParam {
  
  @scala.inline
  def apply(): ResizeEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeEndedEventUIParam]
  }
  
  @scala.inline
  implicit class ResizeEndedEventUIParamMutableBuilder[Self <: ResizeEndedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
