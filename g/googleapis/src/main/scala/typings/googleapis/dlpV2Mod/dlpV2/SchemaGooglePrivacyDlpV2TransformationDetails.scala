package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TransformationDetails extends StObject {
  
  /**
    * The top level name of the container where the transformation is located (this will be the source file name or table name).
    */
  var containerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the job that completed the transformation.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the transformation, if transformation was not successful, this will specify what caused it to fail, otherwise it will show that the transformation was successful.
    */
  var statusDetails: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationResultStatus] = js.undefined
  
  /**
    * Description of transformation. This would only contain more than one element if there were multiple matching transformations and which one to apply was ambiguous. Not set for states that contain no transformation, currently only state that contains no transformation is TransformationResultStateType.METADATA_UNRETRIEVABLE.
    */
  var transformation: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TransformationDescription]] = js.undefined
  
  /**
    * The precise location of the transformed content in the original container.
    */
  var transformationLocation: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationLocation] = js.undefined
  
  /**
    * The number of bytes that were transformed. If transformation was unsuccessful or did not take place because there was no content to transform, this will be zero.
    */
  var transformedBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2TransformationDetails {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TransformationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationDetails]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TransformationDetails](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameNull: Self = StObject.set(x, "containerName", null)
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setStatusDetails(value: SchemaGooglePrivacyDlpV2TransformationResultStatus): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "statusDetails", js.undefined)
    
    inline def setTransformation(value: js.Array[SchemaGooglePrivacyDlpV2TransformationDescription]): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
    
    inline def setTransformationLocation(value: SchemaGooglePrivacyDlpV2TransformationLocation): Self = StObject.set(x, "transformationLocation", value.asInstanceOf[js.Any])
    
    inline def setTransformationLocationUndefined: Self = StObject.set(x, "transformationLocation", js.undefined)
    
    inline def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
    
    inline def setTransformationVarargs(value: SchemaGooglePrivacyDlpV2TransformationDescription*): Self = StObject.set(x, "transformation", js.Array(value*))
    
    inline def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    inline def setTransformedBytesNull: Self = StObject.set(x, "transformedBytes", null)
    
    inline def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
