package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Instruction extends StObject {
  
  /** Output only. The names of any related resources that are blocking changes to the instruction. */
  var blockingResources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Creation time of instruction. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated: this instruction format is not supported any more. Instruction from a CSV file, such as for classification task. The CSV file should have exact two columns, in the
    * following format: * The first column is labeled data, such as an image reference, text. * The second column is comma separated labels associated with data.
    */
  var csvInstruction: js.UndefOr[GoogleCloudDatalabelingV1beta1CsvInstruction] = js.undefined
  
  /** Required. The data type of this instruction. */
  var dataType: js.UndefOr[String] = js.undefined
  
  /** Optional. User-provided description of the instruction. The description can be up to 10000 characters long. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the instruction. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Instruction resource name, format: projects/{project_id}/instructions/{instruction_id} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Instruction from a PDF document. The PDF should be in a Cloud Storage bucket. */
  var pdfInstruction: js.UndefOr[GoogleCloudDatalabelingV1beta1PdfInstruction] = js.undefined
  
  /** Output only. Last update time of instruction. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Instruction {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1Instruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Instruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Instruction] (val x: Self) extends AnyVal {
    
    inline def setBlockingResources(value: js.Array[String]): Self = StObject.set(x, "blockingResources", value.asInstanceOf[js.Any])
    
    inline def setBlockingResourcesUndefined: Self = StObject.set(x, "blockingResources", js.undefined)
    
    inline def setBlockingResourcesVarargs(value: String*): Self = StObject.set(x, "blockingResources", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCsvInstruction(value: GoogleCloudDatalabelingV1beta1CsvInstruction): Self = StObject.set(x, "csvInstruction", value.asInstanceOf[js.Any])
    
    inline def setCsvInstructionUndefined: Self = StObject.set(x, "csvInstruction", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPdfInstruction(value: GoogleCloudDatalabelingV1beta1PdfInstruction): Self = StObject.set(x, "pdfInstruction", value.asInstanceOf[js.Any])
    
    inline def setPdfInstructionUndefined: Self = StObject.set(x, "pdfInstruction", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
