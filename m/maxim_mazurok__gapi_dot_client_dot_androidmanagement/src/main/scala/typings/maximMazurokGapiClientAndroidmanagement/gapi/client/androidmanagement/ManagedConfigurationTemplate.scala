package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedConfigurationTemplate extends StObject {
  
  /** Optional, a map containing configuration variables defined for the configuration. */
  var configurationVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ManagedConfigurationTemplate & TopLevel[js.Any]
  ] = js.undefined
  
  /** The ID of the managed configurations template. */
  var templateId: js.UndefOr[String] = js.undefined
}
object ManagedConfigurationTemplate {
  
  inline def apply(): ManagedConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationTemplate]
  }
  
  extension [Self <: ManagedConfigurationTemplate](x: Self) {
    
    inline def setConfigurationVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ManagedConfigurationTemplate & TopLevel[js.Any]
    ): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
