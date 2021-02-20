package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitTableTransitTimeRow extends StObject {
  
  var values: js.UndefOr[js.Array[TransitTableTransitTimeRowTransitTimeValue]] = js.native
}
object TransitTableTransitTimeRow {
  
  @scala.inline
  def apply(): TransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTableTransitTimeRow]
  }
  
  @scala.inline
  implicit class TransitTableTransitTimeRowMutableBuilder[Self <: TransitTableTransitTimeRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[TransitTableTransitTimeRowTransitTimeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: TransitTableTransitTimeRowTransitTimeValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
