package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1PdfInstruction extends StObject {
  
  /**
    * PDF file for the instruction. Only gcs path is allowed.
    */
  var gcsFileUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1PdfInstruction {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1PdfInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1PdfInstruction]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1PdfInstruction](x: Self) {
    
    inline def setGcsFileUri(value: String): Self = StObject.set(x, "gcsFileUri", value.asInstanceOf[js.Any])
    
    inline def setGcsFileUriNull: Self = StObject.set(x, "gcsFileUri", null)
    
    inline def setGcsFileUriUndefined: Self = StObject.set(x, "gcsFileUri", js.undefined)
  }
}
