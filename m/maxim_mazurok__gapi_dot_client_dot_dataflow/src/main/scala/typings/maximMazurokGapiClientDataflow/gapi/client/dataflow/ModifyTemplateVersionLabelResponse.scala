package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTemplateVersionLabelResponse extends StObject {
  
  /** All the label in the TemplateVersion. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ModifyTemplateVersionLabelResponse & TopLevel[js.Any]
  ] = js.undefined
}
object ModifyTemplateVersionLabelResponse {
  
  inline def apply(): ModifyTemplateVersionLabelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTemplateVersionLabelResponse]
  }
  
  extension [Self <: ModifyTemplateVersionLabelResponse](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ModifyTemplateVersionLabelResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
