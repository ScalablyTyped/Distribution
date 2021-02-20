package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
@js.native
trait SchemaDicomConfig extends StObject {
  
  /**
    * Tag filtering profile that determines which tags to keep/remove.
    */
  var filterProfile: js.UndefOr[String] = js.native
  
  /**
    * List of tags to keep. Remove all other tags.
    */
  var keepList: js.UndefOr[SchemaTagFilterList] = js.native
  
  /**
    * List of tags to remove. Keep all other tags.
    */
  var removeList: js.UndefOr[SchemaTagFilterList] = js.native
}
object SchemaDicomConfig {
  
  @scala.inline
  def apply(): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomConfig]
  }
  
  @scala.inline
  implicit class SchemaDicomConfigMutableBuilder[Self <: SchemaDicomConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterProfile(value: String): Self = StObject.set(x, "filterProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterProfileUndefined: Self = StObject.set(x, "filterProfile", js.undefined)
    
    @scala.inline
    def setKeepList(value: SchemaTagFilterList): Self = StObject.set(x, "keepList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepListUndefined: Self = StObject.set(x, "keepList", js.undefined)
    
    @scala.inline
    def setRemoveList(value: SchemaTagFilterList): Self = StObject.set(x, "removeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveListUndefined: Self = StObject.set(x, "removeList", js.undefined)
  }
}
