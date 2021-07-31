package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginPackage extends StObject {
  
  /**
    * Alternatively, the name and version can be included via the pkg property containing the 'package.json' file for the module which already has the name and version included
    */
  var pkg: js.Any
}
object PluginPackage {
  
  @scala.inline
  def apply(pkg: js.Any): PluginPackage = {
    val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPackage]
  }
  
  @scala.inline
  implicit class PluginPackageMutableBuilder[Self <: PluginPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPkg(value: js.Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
  }
}
