package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHierarchicalGridRestSettingsUpdate
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies whether update requests will be sent in batches
    */
  var batch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a remote URL template. Use ${id} in place of the resource id.
    */
  var template: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL to which update requests will be sent. This will be used for both batch and non-batch, however if template is also set, this URL will only be used for batch requests.
    */
  var url: js.UndefOr[String] = js.undefined
}
object IgHierarchicalGridRestSettingsUpdate {
  
  inline def apply(): IgHierarchicalGridRestSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridRestSettingsUpdate]
  }
  
  extension [Self <: IgHierarchicalGridRestSettingsUpdate](x: Self) {
    
    inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
