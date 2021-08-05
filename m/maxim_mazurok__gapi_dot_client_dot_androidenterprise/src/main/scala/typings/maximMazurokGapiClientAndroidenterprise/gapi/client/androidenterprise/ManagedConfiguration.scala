package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedConfiguration extends StObject {
  
  /** Contains the ID of the managed configuration profile and the set of configuration variables (if any) defined for the user. */
  var configurationVariables: js.UndefOr[ConfigurationVariables] = js.undefined
  
  /** Deprecated. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The set of managed properties for this configuration. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
  
  /** The ID of the product that the managed configuration is for, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
}
object ManagedConfiguration {
  
  inline def apply(): ManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfiguration]
  }
  
  extension [Self <: ManagedConfiguration](x: Self) {
    
    inline def setConfigurationVariables(value: ConfigurationVariables): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedProperty(value: js.Array[ManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    inline def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    inline def setManagedPropertyVarargs(value: ManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value :_*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
