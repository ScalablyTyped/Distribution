package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannel extends StObject {
  
  /**
    * Type of channel.
    */
  var channelType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel name. Format is "{product\}/platforms/{platform\}/channels/{channel\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannel {
  
  inline def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  extension [Self <: SchemaChannel](x: Self) {
    
    inline def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeNull: Self = StObject.set(x, "channelType", null)
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
