package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InfoType description.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeDescription extends StObject {
  
  /**
    * Description of the infotype. Translated when language is provided in the
    * request.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Human readable form of the infoType name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Internal name of the infoType.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Which parts of the API supports this InfoType.
    */
  var supportedBy: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGooglePrivacyDlpV2InfoTypeDescription {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeDescription]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeDescriptionMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InfoTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSupportedBy(value: js.Array[String]): Self = StObject.set(x, "supportedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedByUndefined: Self = StObject.set(x, "supportedBy", js.undefined)
    
    @scala.inline
    def setSupportedByVarargs(value: String*): Self = StObject.set(x, "supportedBy", js.Array(value :_*))
  }
}
