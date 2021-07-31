package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneDnsSecConfig extends StObject {
  
  var defaultKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneDnsSecConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var nonExistence: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object SchemaManagedZoneDnsSecConfig {
  
  @scala.inline
  def apply(): SchemaManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneDnsSecConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneDnsSecConfigMutableBuilder[Self <: SchemaManagedZoneDnsSecConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = StObject.set(x, "defaultKeySpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKeySpecsUndefined: Self = StObject.set(x, "defaultKeySpecs", js.undefined)
    
    @scala.inline
    def setDefaultKeySpecsVarargs(value: SchemaDnsKeySpec*): Self = StObject.set(x, "defaultKeySpecs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNonExistence(value: String): Self = StObject.set(x, "nonExistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonExistenceUndefined: Self = StObject.set(x, "nonExistence", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
