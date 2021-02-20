package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutAMDModule extends StObject {
  
  var baseDir: String = js.native
  
  var disposeMethod: String = js.native
  
  var initializer: String = js.native
  
  var templateProperty: String = js.native
}
object KnockoutAMDModule {
  
  @scala.inline
  def apply(baseDir: String, disposeMethod: String, initializer: String, templateProperty: String): KnockoutAMDModule = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], disposeMethod = disposeMethod.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], templateProperty = templateProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDModule]
  }
  
  @scala.inline
  implicit class KnockoutAMDModuleMutableBuilder[Self <: KnockoutAMDModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposeMethod(value: String): Self = StObject.set(x, "disposeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: String): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateProperty(value: String): Self = StObject.set(x, "templateProperty", value.asInstanceOf[js.Any])
  }
}
