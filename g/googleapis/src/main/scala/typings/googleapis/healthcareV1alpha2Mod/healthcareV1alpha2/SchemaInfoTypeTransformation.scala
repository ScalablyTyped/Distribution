package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaInfoTypeTransformation extends StObject {
  
  /**
    * Config for character mask.
    */
  var characterMaskConfig: js.UndefOr[SchemaCharacterMaskConfig] = js.native
  
  /**
    * Config for crypto hash.
    */
  var cryptoHashConfig: js.UndefOr[SchemaCryptoHashConfig] = js.native
  
  /**
    * Config for date shift.
    */
  var dateShiftConfig: js.UndefOr[SchemaDateShiftConfig] = js.native
  
  /**
    * InfoTypes to apply this transformation to. If this is not specified, the
    * transformation applies to any info_type.
    */
  var infoTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Config for text redaction.
    */
  var redactConfig: js.UndefOr[SchemaRedactConfig] = js.native
  
  /**
    * Config for replace with InfoType.
    */
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaReplaceWithInfoTypeConfig] = js.native
}
object SchemaInfoTypeTransformation {
  
  @scala.inline
  def apply(): SchemaInfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInfoTypeTransformation]
  }
  
  @scala.inline
  implicit class SchemaInfoTypeTransformationMutableBuilder[Self <: SchemaInfoTypeTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacterMaskConfig(value: SchemaCharacterMaskConfig): Self = StObject.set(x, "characterMaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterMaskConfigUndefined: Self = StObject.set(x, "characterMaskConfig", js.undefined)
    
    @scala.inline
    def setCryptoHashConfig(value: SchemaCryptoHashConfig): Self = StObject.set(x, "cryptoHashConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoHashConfigUndefined: Self = StObject.set(x, "cryptoHashConfig", js.undefined)
    
    @scala.inline
    def setDateShiftConfig(value: SchemaDateShiftConfig): Self = StObject.set(x, "dateShiftConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateShiftConfigUndefined: Self = StObject.set(x, "dateShiftConfig", js.undefined)
    
    @scala.inline
    def setInfoTypes(value: js.Array[String]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: String*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setRedactConfig(value: SchemaRedactConfig): Self = StObject.set(x, "redactConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactConfigUndefined: Self = StObject.set(x, "redactConfig", js.undefined)
    
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: SchemaReplaceWithInfoTypeConfig): Self = StObject.set(x, "replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceWithInfoTypeConfigUndefined: Self = StObject.set(x, "replaceWithInfoTypeConfig", js.undefined)
  }
}
