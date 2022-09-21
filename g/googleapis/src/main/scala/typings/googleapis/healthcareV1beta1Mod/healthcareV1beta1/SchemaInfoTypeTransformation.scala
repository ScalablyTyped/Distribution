package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInfoTypeTransformation extends StObject {
  
  /**
    * Config for character mask.
    */
  var characterMaskConfig: js.UndefOr[SchemaCharacterMaskConfig] = js.undefined
  
  /**
    * Config for crypto hash.
    */
  var cryptoHashConfig: js.UndefOr[SchemaCryptoHashConfig] = js.undefined
  
  /**
    * Config for date shift.
    */
  var dateShiftConfig: js.UndefOr[SchemaDateShiftConfig] = js.undefined
  
  /**
    * InfoTypes to apply this transformation to. If this is not specified, this transformation becomes the default transformation, and is used for any info_type that is not specified in another transformation.
    */
  var infoTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Config for text redaction.
    */
  var redactConfig: js.UndefOr[SchemaRedactConfig] = js.undefined
  
  /**
    * Config for replace with InfoType.
    */
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaReplaceWithInfoTypeConfig] = js.undefined
}
object SchemaInfoTypeTransformation {
  
  inline def apply(): SchemaInfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInfoTypeTransformation]
  }
  
  extension [Self <: SchemaInfoTypeTransformation](x: Self) {
    
    inline def setCharacterMaskConfig(value: SchemaCharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    inline def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    inline def setCryptoHashConfig(value: SchemaCryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    inline def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    inline def setDateShiftConfig(value: SchemaDateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    inline def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    inline def setInfoTypes(value: js.Array[String]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesNull: Self = StObject.set(x, "infoTypes", null)
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: String*): Self = StObject.set(x, "infoTypes", js.Array(value*))
    
    inline def setRedactConfig(value: SchemaRedactConfig): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    inline def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    inline def setReplaceWithInfoTypeConfig(value: SchemaReplaceWithInfoTypeConfig): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
  }
}
