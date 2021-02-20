package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for instant messenger of an user.
  */
@js.native
trait SchemaUserIm extends StObject {
  
  /**
    * Custom protocol.
    */
  var customProtocol: js.UndefOr[String] = js.native
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * Instant messenger id.
    */
  var im: js.UndefOr[String] = js.native
  
  /**
    * If this is user&#39;s primary im. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * Protocol used in the instant messenger. It should be one of the values
    * from ImProtocolTypes map. Similar to type, it can take a CUSTOM value and
    * specify the custom name in customProtocol field.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example instant messengers could be of home, work etc. In addition to
    * the standard type, an entry can have a custom type and can take any
    * value. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUserIm {
  
  @scala.inline
  def apply(): SchemaUserIm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserIm]
  }
  
  @scala.inline
  implicit class SchemaUserImMutableBuilder[Self <: SchemaUserIm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomProtocol(value: String): Self = StObject.set(x, "customProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomProtocolUndefined: Self = StObject.set(x, "customProtocol", js.undefined)
    
    @scala.inline
    def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setIm(value: String): Self = StObject.set(x, "im", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImUndefined: Self = StObject.set(x, "im", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
