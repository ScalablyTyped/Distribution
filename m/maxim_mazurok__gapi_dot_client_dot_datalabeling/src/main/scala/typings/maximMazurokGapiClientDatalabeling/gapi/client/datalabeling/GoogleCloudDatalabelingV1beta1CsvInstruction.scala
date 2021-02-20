package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1CsvInstruction extends StObject {
  
  /** CSV file for the instruction. Only gcs path is allowed. */
  var gcsFileUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1CsvInstruction {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1CsvInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1CsvInstruction]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1CsvInstructionMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1CsvInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsFileUri(value: String): Self = StObject.set(x, "gcsFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsFileUriUndefined: Self = StObject.set(x, "gcsFileUri", js.undefined)
  }
}
