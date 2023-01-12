package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutAMDTemplate extends StObject {
  
  var defaultPath: String
  
  var defaultRequireTextPluginName: String
  
  var defaultSuffix: String
}
object KnockoutAMDTemplate {
  
  inline def apply(defaultPath: String, defaultRequireTextPluginName: String, defaultSuffix: String): KnockoutAMDTemplate = {
    val __obj = js.Dynamic.literal(defaultPath = defaultPath.asInstanceOf[js.Any], defaultRequireTextPluginName = defaultRequireTextPluginName.asInstanceOf[js.Any], defaultSuffix = defaultSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutAMDTemplate] (val x: Self) extends AnyVal {
    
    inline def setDefaultPath(value: String): Self = StObject.set(x, "defaultPath", value.asInstanceOf[js.Any])
    
    inline def setDefaultRequireTextPluginName(value: String): Self = StObject.set(x, "defaultRequireTextPluginName", value.asInstanceOf[js.Any])
    
    inline def setDefaultSuffix(value: String): Self = StObject.set(x, "defaultSuffix", value.asInstanceOf[js.Any])
  }
}
