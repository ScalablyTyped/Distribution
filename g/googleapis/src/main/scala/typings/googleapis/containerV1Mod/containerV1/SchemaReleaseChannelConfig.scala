package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReleaseChannelConfig extends StObject {
  
  /**
    * The release channel this configuration applies to.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default version for newly created clusters on the channel.
    */
  var defaultVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of valid versions for the channel.
    */
  var validVersions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaReleaseChannelConfig {
  
  inline def apply(): SchemaReleaseChannelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReleaseChannelConfig]
  }
  
  extension [Self <: SchemaReleaseChannelConfig](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDefaultVersion(value: String): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionNull: Self = StObject.set(x, "defaultVersion", null)
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setValidVersions(value: js.Array[String]): Self = StObject.set(x, "validVersions", value.asInstanceOf[js.Any])
    
    inline def setValidVersionsNull: Self = StObject.set(x, "validVersions", null)
    
    inline def setValidVersionsUndefined: Self = StObject.set(x, "validVersions", js.undefined)
    
    inline def setValidVersionsVarargs(value: String*): Self = StObject.set(x, "validVersions", js.Array(value*))
  }
}
