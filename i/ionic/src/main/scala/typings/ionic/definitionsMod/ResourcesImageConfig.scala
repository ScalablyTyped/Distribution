package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcesImageConfig extends StObject {
  
  var density: js.UndefOr[String] = js.native
  
  var height: Double = js.native
  
  var name: String = js.native
  
  var orientation: js.UndefOr[landscape | portrait] = js.native
  
  var width: Double = js.native
}
object ResourcesImageConfig {
  
  @scala.inline
  def apply(height: Double, name: String, width: Double): ResourcesImageConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesImageConfig]
  }
  
  @scala.inline
  implicit class ResourcesImageConfigMutableBuilder[Self <: ResourcesImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDensity(value: String): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
