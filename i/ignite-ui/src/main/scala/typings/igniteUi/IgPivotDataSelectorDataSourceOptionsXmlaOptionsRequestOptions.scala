package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * A callback to be invoked right before the request is send to the server. Extends beforeSend callback of jQuery.ajax’s options object.
    */
  var beforeSend: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The value is applied to XmlHttpRequest.withCredentials if supported by the user agent.
    * Setting this property to true will allow IE8/IE9 to make authenticated cross-origin requests to tusted domains through XmlHttpRequest instead of XDomainRequest
    * and will prompt the user for credentials.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions {
  
  inline def apply(): IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions]
  }
  
  extension [Self <: IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions](x: Self) {
    
    inline def setBeforeSend(value: js.Function): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
