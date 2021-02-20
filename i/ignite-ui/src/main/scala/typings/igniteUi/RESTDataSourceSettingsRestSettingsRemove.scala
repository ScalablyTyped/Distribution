package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTDataSourceSettingsRestSettingsRemove
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies whether update requests will be sent in batches
    */
  var batch: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a remote URL template. Use ${id} in place of the resource id.
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * Specifies a remote URL to which remove requests will be sent. This will be used for both batch and non-batch, however if template is also set, this URL will only be used for batch requests.
    */
  var url: js.UndefOr[String] = js.native
}
object RESTDataSourceSettingsRestSettingsRemove {
  
  @scala.inline
  def apply(): RESTDataSourceSettingsRestSettingsRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RESTDataSourceSettingsRestSettingsRemove]
  }
  
  @scala.inline
  implicit class RESTDataSourceSettingsRestSettingsRemoveMutableBuilder[Self <: RESTDataSourceSettingsRestSettingsRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
