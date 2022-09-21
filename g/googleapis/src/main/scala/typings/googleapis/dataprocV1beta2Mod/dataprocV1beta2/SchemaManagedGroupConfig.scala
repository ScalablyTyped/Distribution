package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedGroupConfig extends StObject {
  
  /**
    * Output only. The name of the Instance Group Manager for this group.
    */
  var instanceGroupManagerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the Instance Template used for the Managed Instance Group.
    */
  var instanceTemplateName: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedGroupConfig {
  
  inline def apply(): SchemaManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedGroupConfig]
  }
  
  extension [Self <: SchemaManagedGroupConfig](x: Self) {
    
    inline def setInstanceGroupManagerName(value: String): Self = StObject.set(x, "instanceGroupManagerName", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupManagerNameNull: Self = StObject.set(x, "instanceGroupManagerName", null)
    
    inline def setInstanceGroupManagerNameUndefined: Self = StObject.set(x, "instanceGroupManagerName", js.undefined)
    
    inline def setInstanceTemplateName(value: String): Self = StObject.set(x, "instanceTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateNameNull: Self = StObject.set(x, "instanceTemplateName", null)
    
    inline def setInstanceTemplateNameUndefined: Self = StObject.set(x, "instanceTemplateName", js.undefined)
  }
}
