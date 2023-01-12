package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDiscoverRequestOptions extends StObject {
  
  var data: PivotDiscoverRequestDataOptions
}
object PivotDiscoverRequestOptions {
  
  inline def apply(data: PivotDiscoverRequestDataOptions): PivotDiscoverRequestOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotDiscoverRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: PivotDiscoverRequestDataOptions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
