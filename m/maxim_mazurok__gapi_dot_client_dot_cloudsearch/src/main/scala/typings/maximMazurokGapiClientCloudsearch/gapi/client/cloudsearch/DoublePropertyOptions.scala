package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoublePropertyOptions extends StObject {
  
  /** If set, describes how the double should be used as a search operator. */
  var operatorOptions: js.UndefOr[DoubleOperatorOptions] = js.native
}
object DoublePropertyOptions {
  
  @scala.inline
  def apply(): DoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoublePropertyOptions]
  }
  
  @scala.inline
  implicit class DoublePropertyOptionsMutableBuilder[Self <: DoublePropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: DoubleOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
