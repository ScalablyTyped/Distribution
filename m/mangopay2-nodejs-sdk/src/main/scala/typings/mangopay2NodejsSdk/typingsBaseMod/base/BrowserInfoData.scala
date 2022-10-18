package typings.mangopay2NodejsSdk.typingsBaseMod.base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserInfoData extends StObject {
  
  var AcceptHeader: String
  
  var ColorDepth: Double
  
  var JavaEnabled: Boolean
  
  var JavascriptEnabled: Boolean
  
  var Language: String
  
  var ScreenHeight: Double
  
  var ScreenWidth: Double
  
  var TimeZoneOffset: String
  
  var UserAgent: String
}
object BrowserInfoData {
  
  inline def apply(
    AcceptHeader: String,
    ColorDepth: Double,
    JavaEnabled: Boolean,
    JavascriptEnabled: Boolean,
    Language: String,
    ScreenHeight: Double,
    ScreenWidth: Double,
    TimeZoneOffset: String,
    UserAgent: String
  ): BrowserInfoData = {
    val __obj = js.Dynamic.literal(AcceptHeader = AcceptHeader.asInstanceOf[js.Any], ColorDepth = ColorDepth.asInstanceOf[js.Any], JavaEnabled = JavaEnabled.asInstanceOf[js.Any], JavascriptEnabled = JavascriptEnabled.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], ScreenHeight = ScreenHeight.asInstanceOf[js.Any], ScreenWidth = ScreenWidth.asInstanceOf[js.Any], TimeZoneOffset = TimeZoneOffset.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserInfoData]
  }
  
  extension [Self <: BrowserInfoData](x: Self) {
    
    inline def setAcceptHeader(value: String): Self = StObject.set(x, "AcceptHeader", value.asInstanceOf[js.Any])
    
    inline def setColorDepth(value: Double): Self = StObject.set(x, "ColorDepth", value.asInstanceOf[js.Any])
    
    inline def setJavaEnabled(value: Boolean): Self = StObject.set(x, "JavaEnabled", value.asInstanceOf[js.Any])
    
    inline def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "JavascriptEnabled", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setScreenHeight(value: Double): Self = StObject.set(x, "ScreenHeight", value.asInstanceOf[js.Any])
    
    inline def setScreenWidth(value: Double): Self = StObject.set(x, "ScreenWidth", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneOffset(value: String): Self = StObject.set(x, "TimeZoneOffset", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
  }
}
