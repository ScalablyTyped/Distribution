package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectivity extends StObject {
  
  /**
    * Free wifi. The hotel offers guests wifi for free.
    */
  var freeWifi: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free wifi exception.
    */
  var freeWifiException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Public area wifi available. Guests have the ability to wirelessly connect to the internet in the areas of the hotel accessible to anyone. Can be free or for a fee.
    */
  var publicAreaWifiAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Public area wifi available exception.
    */
  var publicAreaWifiAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Public internet terminal. An area of the hotel supplied with computers and designated for the purpose of providing guests with the ability to access the internet.
    */
  var publicInternetTerminal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Public internet terminal exception.
    */
  var publicInternetTerminalException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Wifi available. The hotel provides the ability for guests to wirelessly connect to the internet. Can be in the public areas of the hotel and/or in the guest rooms. Can be free or for a fee.
    */
  var wifiAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Wifi available exception.
    */
  var wifiAvailableException: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectivity {
  
  inline def apply(): SchemaConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectivity]
  }
  
  extension [Self <: SchemaConnectivity](x: Self) {
    
    inline def setFreeWifi(value: Boolean): Self = StObject.set(x, "freeWifi", value.asInstanceOf[js.Any])
    
    inline def setFreeWifiException(value: String): Self = StObject.set(x, "freeWifiException", value.asInstanceOf[js.Any])
    
    inline def setFreeWifiExceptionNull: Self = StObject.set(x, "freeWifiException", null)
    
    inline def setFreeWifiExceptionUndefined: Self = StObject.set(x, "freeWifiException", js.undefined)
    
    inline def setFreeWifiNull: Self = StObject.set(x, "freeWifi", null)
    
    inline def setFreeWifiUndefined: Self = StObject.set(x, "freeWifi", js.undefined)
    
    inline def setPublicAreaWifiAvailable(value: Boolean): Self = StObject.set(x, "publicAreaWifiAvailable", value.asInstanceOf[js.Any])
    
    inline def setPublicAreaWifiAvailableException(value: String): Self = StObject.set(x, "publicAreaWifiAvailableException", value.asInstanceOf[js.Any])
    
    inline def setPublicAreaWifiAvailableExceptionNull: Self = StObject.set(x, "publicAreaWifiAvailableException", null)
    
    inline def setPublicAreaWifiAvailableExceptionUndefined: Self = StObject.set(x, "publicAreaWifiAvailableException", js.undefined)
    
    inline def setPublicAreaWifiAvailableNull: Self = StObject.set(x, "publicAreaWifiAvailable", null)
    
    inline def setPublicAreaWifiAvailableUndefined: Self = StObject.set(x, "publicAreaWifiAvailable", js.undefined)
    
    inline def setPublicInternetTerminal(value: Boolean): Self = StObject.set(x, "publicInternetTerminal", value.asInstanceOf[js.Any])
    
    inline def setPublicInternetTerminalException(value: String): Self = StObject.set(x, "publicInternetTerminalException", value.asInstanceOf[js.Any])
    
    inline def setPublicInternetTerminalExceptionNull: Self = StObject.set(x, "publicInternetTerminalException", null)
    
    inline def setPublicInternetTerminalExceptionUndefined: Self = StObject.set(x, "publicInternetTerminalException", js.undefined)
    
    inline def setPublicInternetTerminalNull: Self = StObject.set(x, "publicInternetTerminal", null)
    
    inline def setPublicInternetTerminalUndefined: Self = StObject.set(x, "publicInternetTerminal", js.undefined)
    
    inline def setWifiAvailable(value: Boolean): Self = StObject.set(x, "wifiAvailable", value.asInstanceOf[js.Any])
    
    inline def setWifiAvailableException(value: String): Self = StObject.set(x, "wifiAvailableException", value.asInstanceOf[js.Any])
    
    inline def setWifiAvailableExceptionNull: Self = StObject.set(x, "wifiAvailableException", null)
    
    inline def setWifiAvailableExceptionUndefined: Self = StObject.set(x, "wifiAvailableException", js.undefined)
    
    inline def setWifiAvailableNull: Self = StObject.set(x, "wifiAvailable", null)
    
    inline def setWifiAvailableUndefined: Self = StObject.set(x, "wifiAvailable", js.undefined)
  }
}
