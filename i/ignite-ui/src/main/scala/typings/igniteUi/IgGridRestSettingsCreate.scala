package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridRestSettingsCreate
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies whether create requests will be sent in batches
    *
    */
  var batch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a remote URL template. Use ${id} in place of the resource id.
    *
    */
  var template: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL to which create requests will be sent. This will be used for both batch and non-batch, however if template is also set, this URL will only be used for batch requests.
    *
    */
  var url: js.UndefOr[String] = js.undefined
}
object IgGridRestSettingsCreate {
  
  @scala.inline
  def apply(): IgGridRestSettingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRestSettingsCreate]
  }
  
  @scala.inline
  implicit class IgGridRestSettingsCreateMutableBuilder[Self <: IgGridRestSettingsCreate] (val x: Self) extends AnyVal {
    
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
