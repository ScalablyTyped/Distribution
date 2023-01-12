package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedGroupConfig extends StObject {
  
  /** Output only. The name of the Instance Group Manager for this group. */
  var instanceGroupManagerName: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the Instance Template used for the Managed Instance Group. */
  var instanceTemplateName: js.UndefOr[String] = js.undefined
}
object ManagedGroupConfig {
  
  inline def apply(): ManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedGroupConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedGroupConfig] (val x: Self) extends AnyVal {
    
    inline def setInstanceGroupManagerName(value: String): Self = StObject.set(x, "instanceGroupManagerName", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupManagerNameUndefined: Self = StObject.set(x, "instanceGroupManagerName", js.undefined)
    
    inline def setInstanceTemplateName(value: String): Self = StObject.set(x, "instanceTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateNameUndefined: Self = StObject.set(x, "instanceTemplateName", js.undefined)
  }
}
