package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrinter extends StObject {
  
  /**
    * Output only. Auxiliary messages about issues with the printer configuration if any.
    */
  var auxiliaryMessages: js.UndefOr[js.Array[SchemaAuxiliaryMessage]] = js.undefined
  
  /**
    * Output only. Time when printer was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Editable. Description of printer.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Editable. Name of printer.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of the printer. (During printer creation leave empty)
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Editable. Make and model of printer. e.g. Lexmark MS610de Value must be in format as seen in ListPrinterModels response.
    */
  var makeAndModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the Printer object, in the format customers/{customer-id\}/printers/{printer-id\} (During printer creation leave empty)
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Organization Unit that owns this printer (Only can be set during Printer creation)
    */
  var orgUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Editable. Printer URI.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Editable. flag to use driverless configuration or not. If it's set to be true, make_and_model can be ignored
    */
  var useDriverlessConfig: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPrinter {
  
  inline def apply(): SchemaPrinter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrinter]
  }
  
  extension [Self <: SchemaPrinter](x: Self) {
    
    inline def setAuxiliaryMessages(value: js.Array[SchemaAuxiliaryMessage]): Self = StObject.set(x, "auxiliaryMessages", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryMessagesUndefined: Self = StObject.set(x, "auxiliaryMessages", js.undefined)
    
    inline def setAuxiliaryMessagesVarargs(value: SchemaAuxiliaryMessage*): Self = StObject.set(x, "auxiliaryMessages", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMakeAndModel(value: String): Self = StObject.set(x, "makeAndModel", value.asInstanceOf[js.Any])
    
    inline def setMakeAndModelNull: Self = StObject.set(x, "makeAndModel", null)
    
    inline def setMakeAndModelUndefined: Self = StObject.set(x, "makeAndModel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdNull: Self = StObject.set(x, "orgUnitId", null)
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUseDriverlessConfig(value: Boolean): Self = StObject.set(x, "useDriverlessConfig", value.asInstanceOf[js.Any])
    
    inline def setUseDriverlessConfigNull: Self = StObject.set(x, "useDriverlessConfig", null)
    
    inline def setUseDriverlessConfigUndefined: Self = StObject.set(x, "useDriverlessConfig", js.undefined)
  }
}
