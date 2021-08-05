package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
trait SchemaDicomConfig extends StObject {
  
  /**
    * Tag filtering profile that determines which tags to keep/remove.
    */
  var filterProfile: js.UndefOr[String] = js.undefined
  
  /**
    * List of tags to keep. Remove all other tags.
    */
  var keepList: js.UndefOr[SchemaTagFilterList] = js.undefined
  
  /**
    * List of tags to remove. Keep all other tags.
    */
  var removeList: js.UndefOr[SchemaTagFilterList] = js.undefined
}
object SchemaDicomConfig {
  
  inline def apply(): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomConfig]
  }
  
  extension [Self <: SchemaDicomConfig](x: Self) {
    
    inline def setFilterProfile(value: String): Self = StObject.set(x, "filterProfile", value.asInstanceOf[js.Any])
    
    inline def setFilterProfileUndefined: Self = StObject.set(x, "filterProfile", js.undefined)
    
    inline def setKeepList(value: SchemaTagFilterList): Self = StObject.set(x, "keepList", value.asInstanceOf[js.Any])
    
    inline def setKeepListUndefined: Self = StObject.set(x, "keepList", js.undefined)
    
    inline def setRemoveList(value: SchemaTagFilterList): Self = StObject.set(x, "removeList", value.asInstanceOf[js.Any])
    
    inline def setRemoveListUndefined: Self = StObject.set(x, "removeList", js.undefined)
  }
}
