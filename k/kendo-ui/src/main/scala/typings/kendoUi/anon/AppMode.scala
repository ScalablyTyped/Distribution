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
  
  var tablet: js.Any
}
object AppMode {
  
  @scala.inline
  def apply(
    appMode: Boolean,
    browser: String,
    device: String,
    flatVersion: Double,
    majorVersion: String,
    minorVersion: String,
    name: String,
    tablet: js.Any
  ): AppMode = {
    val __obj = js.Dynamic.literal(appMode = appMode.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], flatVersion = flatVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMode]
  }
  
  @scala.inline
  implicit class AppModeMutableBuilder[Self <: AppMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppMode(value: Boolean): Self = StObject.set(x, "appMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatVersion(value: Double): Self = StObject.set(x, "flatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: String): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: String): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablet(value: js.Any): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
