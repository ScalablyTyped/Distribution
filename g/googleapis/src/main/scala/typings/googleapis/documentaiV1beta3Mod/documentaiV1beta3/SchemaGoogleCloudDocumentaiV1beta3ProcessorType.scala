package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ProcessorType extends StObject {
  
  /**
    * Whether the processor type allows creation. If true, users can create a processor of this processor type. Otherwise, users need to request access.
    */
  var allowCreation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The locations in which this processor is available.
    */
  var availableLocations: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo]] = js.undefined
  
  /**
    * The processor category, used by UI to group processor types.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Launch stage of the processor type
    */
  var launchStage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the processor type. Format: projects/{project\}/processorTypes/{processor_type\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the processor, e.g., "invoice_parsing".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ProcessorType {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ProcessorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ProcessorType]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ProcessorType](x: Self) {
    
    inline def setAllowCreation(value: Boolean): Self = StObject.set(x, "allowCreation", value.asInstanceOf[js.Any])
    
    inline def setAllowCreationNull: Self = StObject.set(x, "allowCreation", null)
    
    inline def setAllowCreationUndefined: Self = StObject.set(x, "allowCreation", js.undefined)
    
    inline def setAvailableLocations(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo]): Self = StObject.set(x, "availableLocations", value.asInstanceOf[js.Any])
    
    inline def setAvailableLocationsUndefined: Self = StObject.set(x, "availableLocations", js.undefined)
    
    inline def setAvailableLocationsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo*): Self = StObject.set(x, "availableLocations", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageNull: Self = StObject.set(x, "launchStage", null)
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
