package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectValues extends StObject {
  
  var values: js.UndefOr[js.Array[StructuredDataObject]] = js.native
}
object ObjectValues {
  
  @scala.inline
  def apply(): ObjectValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectValues]
  }
  
  @scala.inline
  implicit class ObjectValuesMutableBuilder[Self <: ObjectValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[StructuredDataObject]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: StructuredDataObject*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
