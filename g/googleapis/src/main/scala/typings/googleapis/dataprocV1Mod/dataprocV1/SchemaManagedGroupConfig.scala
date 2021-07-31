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
  
  @scala.inline
  def apply(): SchemaManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedGroupConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedGroupConfigMutableBuilder[Self <: SchemaManagedGroupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceGroupManagerName(value: String): Self = StObject.set(x, "instanceGroupManagerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupManagerNameUndefined: Self = StObject.set(x, "instanceGroupManagerName", js.undefined)
    
    @scala.inline
    def setInstanceTemplateName(value: String): Self = StObject.set(x, "instanceTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateNameUndefined: Self = StObject.set(x, "instanceTemplateName", js.undefined)
  }
}
