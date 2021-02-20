package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for bytes to inspect or redact.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ByteContentItem extends StObject {
  
  /**
    * Content data to inspect or redact.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * The type of data stored in the bytes string. Default will be TEXT_UTF8.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2ByteContentItem {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ByteContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ByteContentItem]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ByteContentItemMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ByteContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
