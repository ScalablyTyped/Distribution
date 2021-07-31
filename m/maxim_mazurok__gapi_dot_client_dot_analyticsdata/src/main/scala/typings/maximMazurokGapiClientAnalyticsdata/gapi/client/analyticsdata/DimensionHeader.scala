package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionHeader extends StObject {
  
  /** The dimension's name. */
  var name: js.UndefOr[String] = js.undefined
}
object DimensionHeader {
  
  @scala.inline
  def apply(): DimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionHeader]
  }
  
  @scala.inline
  implicit class DimensionHeaderMutableBuilder[Self <: DimensionHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
