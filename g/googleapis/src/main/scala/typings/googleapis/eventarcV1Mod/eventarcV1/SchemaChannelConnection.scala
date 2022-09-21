package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelConnection extends StObject {
  
  /**
    * Input only. Activation token for the channel. The token will be used during the creation of ChannelConnection to bind the channel with the provider project. This field will not be stored in the provider resource.
    */
  var activationToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the connected subscriber Channel. This is a weak reference to avoid cross project and cross accounts references. This must be in `projects/{project\}/location/{location\}/channels/{channel_id\}` format.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the connection.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Server assigned ID of the resource. The server guarantees uniqueness and immutability until deleted.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last-modified time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelConnection {
  
  inline def apply(): SchemaChannelConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelConnection]
  }
  
  extension [Self <: SchemaChannelConnection](x: Self) {
    
    inline def setActivationToken(value: String): Self = StObject.set(x, "activationToken", value.asInstanceOf[js.Any])
    
    inline def setActivationTokenNull: Self = StObject.set(x, "activationToken", null)
    
    inline def setActivationTokenUndefined: Self = StObject.set(x, "activationToken", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
