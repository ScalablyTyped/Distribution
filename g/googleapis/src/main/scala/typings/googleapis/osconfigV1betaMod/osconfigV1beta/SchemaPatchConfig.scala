package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchConfig extends StObject {
  
  /**
    * Apt update settings. Use this setting to override the default `apt` patch rules.
    */
  var apt: js.UndefOr[SchemaAptSettings] = js.undefined
  
  /**
    * Goo update settings. Use this setting to override the default `goo` patch rules.
    */
  var goo: js.UndefOr[SchemaGooSettings] = js.undefined
  
  /**
    * Allows the patch job to run on Managed instance groups (MIGs).
    */
  var migInstancesAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The `ExecStep` to run after the patch update.
    */
  var postStep: js.UndefOr[SchemaExecStep] = js.undefined
  
  /**
    * The `ExecStep` to run before the patch update.
    */
  var preStep: js.UndefOr[SchemaExecStep] = js.undefined
  
  /**
    * Post-patch reboot settings.
    */
  var rebootConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Windows update settings. Use this override the default windows patch rules.
    */
  var windowsUpdate: js.UndefOr[SchemaWindowsUpdateSettings] = js.undefined
  
  /**
    * Yum update settings. Use this setting to override the default `yum` patch rules.
    */
  var yum: js.UndefOr[SchemaYumSettings] = js.undefined
  
  /**
    * Zypper update settings. Use this setting to override the default `zypper` patch rules.
    */
  var zypper: js.UndefOr[SchemaZypperSettings] = js.undefined
}
object SchemaPatchConfig {
  
  inline def apply(): SchemaPatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchConfig]
  }
  
  extension [Self <: SchemaPatchConfig](x: Self) {
    
    inline def setApt(value: SchemaAptSettings): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setGoo(value: SchemaGooSettings): Self = StObject.set(x, "goo", value.asInstanceOf[js.Any])
    
    inline def setGooUndefined: Self = StObject.set(x, "goo", js.undefined)
    
    inline def setMigInstancesAllowed(value: Boolean): Self = StObject.set(x, "migInstancesAllowed", value.asInstanceOf[js.Any])
    
    inline def setMigInstancesAllowedNull: Self = StObject.set(x, "migInstancesAllowed", null)
    
    inline def setMigInstancesAllowedUndefined: Self = StObject.set(x, "migInstancesAllowed", js.undefined)
    
    inline def setPostStep(value: SchemaExecStep): Self = StObject.set(x, "postStep", value.asInstanceOf[js.Any])
    
    inline def setPostStepUndefined: Self = StObject.set(x, "postStep", js.undefined)
    
    inline def setPreStep(value: SchemaExecStep): Self = StObject.set(x, "preStep", value.asInstanceOf[js.Any])
    
    inline def setPreStepUndefined: Self = StObject.set(x, "preStep", js.undefined)
    
    inline def setRebootConfig(value: String): Self = StObject.set(x, "rebootConfig", value.asInstanceOf[js.Any])
    
    inline def setRebootConfigNull: Self = StObject.set(x, "rebootConfig", null)
    
    inline def setRebootConfigUndefined: Self = StObject.set(x, "rebootConfig", js.undefined)
    
    inline def setWindowsUpdate(value: SchemaWindowsUpdateSettings): Self = StObject.set(x, "windowsUpdate", value.asInstanceOf[js.Any])
    
    inline def setWindowsUpdateUndefined: Self = StObject.set(x, "windowsUpdate", js.undefined)
    
    inline def setYum(value: SchemaYumSettings): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: SchemaZypperSettings): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
