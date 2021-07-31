package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummariesCalculatedEventUIParam extends StObject {
  
  /**
    * Gets the data for calculated summaries.
    */
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object SummariesCalculatedEventUIParam {
  
  @scala.inline
  def apply(): SummariesCalculatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesCalculatedEventUIParam]
  }
  
  @scala.inline
  implicit class SummariesCalculatedEventUIParamMutableBuilder[Self <: SummariesCalculatedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
