package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationContext extends StObject {
  
  /**
    * IDs representing the geo location for this context. Please refer to the [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv) file for different geo
    * criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object LocationContext {
  
  @scala.inline
  def apply(): LocationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationContext]
  }
  
  @scala.inline
  implicit class LocationContextMutableBuilder[Self <: LocationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoCriteriaIds(value: js.Array[Double]): Self = StObject.set(x, "geoCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoCriteriaIdsUndefined: Self = StObject.set(x, "geoCriteriaIds", js.undefined)
    
    @scala.inline
    def setGeoCriteriaIdsVarargs(value: Double*): Self = StObject.set(x, "geoCriteriaIds", js.Array(value :_*))
  }
}
