package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImClient extends StObject {
  
  /**
    * Output only. The protocol of the IM client formatted in the viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedProtocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of the IM client translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the IM client.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The protocol of the IM client. The protocol can be custom or one of these predefined values: * `aim` * `msn` * `yahoo` * `skype` * `qq` * `googleTalk` * `icq` * `jabber` * `netMeeting`
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the IM client. The type can be custom or one of these predefined values: * `home` * `work` * `other`
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user name used in the IM client.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaImClient {
  
  inline def apply(): SchemaImClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImClient]
  }
  
  extension [Self <: SchemaImClient](x: Self) {
    
    inline def setFormattedProtocol(value: String): Self = StObject.set(x, "formattedProtocol", value.asInstanceOf[js.Any])
    
    inline def setFormattedProtocolNull: Self = StObject.set(x, "formattedProtocol", null)
    
    inline def setFormattedProtocolUndefined: Self = StObject.set(x, "formattedProtocol", js.undefined)
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeNull: Self = StObject.set(x, "formattedType", null)
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
