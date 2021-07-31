package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scan configuration specifies whether Cloud components in a project have a
  * particular type of analysis being run. For example, it can configure
  * whether vulnerability scanning is being done on Docker images or not.
  */
trait SchemaScanConfig extends StObject {
  
  /**
    * Output only. The time this scan config was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A human-readable description of what the scan configuration
    * does.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the scan is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The name of the scan configuration in the form of
    * `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this scan config was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaScanConfig {
  
  @scala.inline
  def apply(): SchemaScanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanConfig]
  }
  
  @scala.inline
  implicit class SchemaScanConfigMutableBuilder[Self <: SchemaScanConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
