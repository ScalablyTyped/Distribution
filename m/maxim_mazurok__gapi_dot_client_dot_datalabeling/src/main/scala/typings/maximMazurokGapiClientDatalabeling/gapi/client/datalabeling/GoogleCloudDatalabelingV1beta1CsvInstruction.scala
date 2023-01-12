package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1CsvInstruction extends StObject {
  
  /** CSV file for the instruction. Only gcs path is allowed. */
  var gcsFileUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1CsvInstruction {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1CsvInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CsvInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1CsvInstruction] (val x: Self) extends AnyVal {
    
    inline def setGcsFileUri(value: String): Self = StObject.set(x, "gcsFileUri", value.asInstanceOf[js.Any])
    
    inline def setGcsFileUriUndefined: Self = StObject.set(x, "gcsFileUri", js.undefined)
  }
}
