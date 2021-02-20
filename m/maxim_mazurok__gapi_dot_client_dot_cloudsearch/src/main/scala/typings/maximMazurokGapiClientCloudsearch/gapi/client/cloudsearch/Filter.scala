package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  var compositeFilter: js.UndefOr[CompositeFilter] = js.native
  
  var valueFilter: js.UndefOr[ValueFilter] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeFilter(value: CompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    @scala.inline
    def setValueFilter(value: ValueFilter): Self = StObject.set(x, "valueFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFilterUndefined: Self = StObject.set(x, "valueFilter", js.undefined)
  }
}
