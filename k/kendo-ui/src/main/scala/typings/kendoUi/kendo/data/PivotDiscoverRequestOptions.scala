package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotDiscoverRequestOptions extends StObject {
  
  var data: PivotDiscoverRequestDataOptions = js.native
}
object PivotDiscoverRequestOptions {
  
  @scala.inline
  def apply(data: PivotDiscoverRequestDataOptions): PivotDiscoverRequestOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestOptions]
  }
  
  @scala.inline
  implicit class PivotDiscoverRequestOptionsMutableBuilder[Self <: PivotDiscoverRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PivotDiscoverRequestDataOptions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
