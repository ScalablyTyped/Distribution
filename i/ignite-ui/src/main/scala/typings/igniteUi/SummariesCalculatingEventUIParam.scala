package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummariesCalculatingEventUIParam extends StObject {
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object SummariesCalculatingEventUIParam {
  
  @scala.inline
  def apply(): SummariesCalculatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesCalculatingEventUIParam]
  }
  
  @scala.inline
  implicit class SummariesCalculatingEventUIParamMutableBuilder[Self <: SummariesCalculatingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
