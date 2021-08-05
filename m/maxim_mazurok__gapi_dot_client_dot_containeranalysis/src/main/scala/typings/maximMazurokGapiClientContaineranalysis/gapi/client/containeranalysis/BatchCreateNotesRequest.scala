package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateNotesRequest extends StObject {
  
  /** Required. The notes to create, the key is expected to be the note ID. Max allowed length is 1000. */
  var notes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.Note}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.BatchCreateNotesRequest & TopLevel[js.Any]
  ] = js.undefined
}
object BatchCreateNotesRequest {
  
  inline def apply(): BatchCreateNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateNotesRequest]
  }
  
  extension [Self <: BatchCreateNotesRequest](x: Self) {
    
    inline def setNotes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.Note}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.BatchCreateNotesRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
