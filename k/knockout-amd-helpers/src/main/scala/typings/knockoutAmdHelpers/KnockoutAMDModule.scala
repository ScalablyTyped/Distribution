package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutAMDModule extends StObject {
  
  var baseDir: String
  
  var disposeMethod: String
  
  var initializer: String
  
  var templateProperty: String
}
object KnockoutAMDModule {
  
  inline def apply(baseDir: String, disposeMethod: String, initializer: String, templateProperty: String): KnockoutAMDModule = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], disposeMethod = disposeMethod.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], templateProperty = templateProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutAMDModule] (val x: Self) extends AnyVal {
    
    inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    inline def setDisposeMethod(value: String): Self = StObject.set(x, "disposeMethod", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: String): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setTemplateProperty(value: String): Self = StObject.set(x, "templateProperty", value.asInstanceOf[js.Any])
  }
}
