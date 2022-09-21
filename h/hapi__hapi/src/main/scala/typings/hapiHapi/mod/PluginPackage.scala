package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginPackage extends StObject {
  
  /**
    * Alternatively, the name and version can be included via the pkg property containing the 'package.json' file for the module which already has the name and version included
    */
  var pkg: Any
}
object PluginPackage {
  
  inline def apply(pkg: Any): PluginPackage = {
    val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPackage]
  }
  
  extension [Self <: PluginPackage](x: Self) {
    
    inline def setPkg(value: Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
  }
}
