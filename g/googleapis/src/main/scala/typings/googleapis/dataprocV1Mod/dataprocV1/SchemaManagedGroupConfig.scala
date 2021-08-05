package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the resources used to actively manage an instance group.
  */
trait SchemaManagedGroupConfig extends StObject {
  
  /**
    * Output only. The name of the Instance Group Manager for this group.
    */
  var instanceGroupManagerName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name of the Instance Template used for the Managed
    * Instance Group.
    */
  var instanceTemplateName: js.UndefOr[String] = js.undefined
}
object SchemaManagedGroupConfig {
  
  inline def apply(): SchemaManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedGroupConfig]
  }
  
  extension [Self <: SchemaManagedGroupConfig](x: Self) {
    
    inline def setInstanceGroupManagerName(value: String): Self = StObject.set(x, "instanceGroupManagerName", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupManagerNameUndefined: Self = StObject.set(x, "instanceGroupManagerName", js.undefined)
    
    inline def setInstanceTemplateName(value: String): Self = StObject.set(x, "instanceTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateNameUndefined: Self = StObject.set(x, "instanceTemplateName", js.undefined)
  }
}
