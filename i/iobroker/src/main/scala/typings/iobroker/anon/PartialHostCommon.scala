package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typings.iobroker.iobrokerStrings.`js-controller`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.HostCommon> */
trait PartialHostCommon extends StObject {
  
  var address: js.UndefOr[js.Array[String]] = js.undefined
  
  var cmd: js.UndefOr[String] = js.undefined
  
  var custom: Unit
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var installedVersion: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[JavascriptSlashNodeDotjs] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[`js-controller`] = js.undefined
}
object PartialHostCommon {
  
  inline def apply(custom: Unit): PartialHostCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHostCommon]
  }
  
  extension [Self <: PartialHostCommon](x: Self) {
    
    inline def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    inline def setInstalledVersionUndefined: Self = StObject.set(x, "installedVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatform(value: JavascriptSlashNodeDotjs): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: `js-controller`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
