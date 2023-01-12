package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typings.iobroker.iobrokerStrings.`js-controller`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostCommon
  extends StObject
     with ObjectCommon {
  
  /** An array of IP addresses this host exposes */
  var address: js.Array[String]
  
  // e.g. 1.2.3 (following semver)
  /** The command line of the executable */
  var cmd: String
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  var hostname: String
  
  var installedVersion: String
  
  /** The display name of this host */
  @JSName("name")
  var name_HostCommon: String
  
  var platform: JavascriptSlashNodeDotjs
  
  var title: String
  
  // IPv4 or IPv6
  var `type`: `js-controller`
}
object HostCommon {
  
  inline def apply(
    address: js.Array[String],
    cmd: String,
    custom: Unit,
    hostname: String,
    installedVersion: String,
    name: String,
    title: String
  ): HostCommon = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], installedVersion = installedVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = "Javascript/Node.js", title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("js-controller")
    __obj.asInstanceOf[HostCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostCommon] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: JavascriptSlashNodeDotjs): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: `js-controller`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
