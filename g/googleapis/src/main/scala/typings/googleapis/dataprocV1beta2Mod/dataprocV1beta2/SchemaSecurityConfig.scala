package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Security related configuration, including encryption, Kerberos, etc.
  */
trait SchemaSecurityConfig extends StObject {
  
  /**
    * Kerberos related configuration.
    */
  var kerberosConfig: js.UndefOr[SchemaKerberosConfig] = js.undefined
}
object SchemaSecurityConfig {
  
  @scala.inline
  def apply(): SchemaSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityConfig]
  }
  
  @scala.inline
  implicit class SchemaSecurityConfigMutableBuilder[Self <: SchemaSecurityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKerberosConfig(value: SchemaKerberosConfig): Self = StObject.set(x, "kerberosConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerberosConfigUndefined: Self = StObject.set(x, "kerberosConfig", js.undefined)
  }
}
