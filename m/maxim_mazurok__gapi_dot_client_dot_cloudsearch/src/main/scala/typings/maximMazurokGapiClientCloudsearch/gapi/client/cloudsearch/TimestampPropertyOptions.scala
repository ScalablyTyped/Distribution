package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampPropertyOptions extends StObject {
  
  /** If set, describes how the timestamp should be used as a search operator. */
  var operatorOptions: js.UndefOr[TimestampOperatorOptions] = js.undefined
}
object TimestampPropertyOptions {
  
  @scala.inline
  def apply(): TimestampPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampPropertyOptions]
  }
  
  @scala.inline
  implicit class TimestampPropertyOptionsMutableBuilder[Self <: TimestampPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: TimestampOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
