package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRequest extends StObject {
  
  var outputFormat: js.UndefOr[OutputFormat] = js.undefined
}
object BaseRequest {
  
  inline def apply(): BaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRequest]
  }
  
  extension [Self <: BaseRequest](x: Self) {
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
  }
}
