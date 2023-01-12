package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMode extends StObject {
  
  var appMode: Boolean
  
  var browser: String
  
  var device: String
  
  var flatVersion: Double
  
  var majorVersion: String
  
  var minorVersion: String
  
  var name: String
  
  var tablet: Any
}
object AppMode {
  
  inline def apply(
    appMode: Boolean,
    browser: String,
    device: String,
    flatVersion: Double,
    majorVersion: String,
    minorVersion: String,
    name: String,
    tablet: Any
  ): AppMode = {
    val __obj = js.Dynamic.literal(appMode = appMode.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], flatVersion = flatVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppMode] (val x: Self) extends AnyVal {
    
    inline def setAppMode(value: Boolean): Self = StObject.set(x, "appMode", value.asInstanceOf[js.Any])
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFlatVersion(value: Double): Self = StObject.set(x, "flatVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: String): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTablet(value: Any): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
