package typings.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/marak/colors.js/}
  */
trait String extends StObject {
  
  var blue: java.lang.String
  
  var cyan: java.lang.String
  
  var green: java.lang.String
  
  var grey: java.lang.String
  
  var magenta: java.lang.String
  
  var red: java.lang.String
  
  var white: java.lang.String
  
  var yellow: java.lang.String
}
object String {
  
  inline def apply(
    blue: java.lang.String,
    cyan: java.lang.String,
    green: java.lang.String,
    grey: java.lang.String,
    magenta: java.lang.String,
    red: java.lang.String,
    white: java.lang.String,
    yellow: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setBlue(value: java.lang.String): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setCyan(value: java.lang.String): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: java.lang.String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGrey(value: java.lang.String): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: java.lang.String): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setRed(value: java.lang.String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setWhite(value: java.lang.String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: java.lang.String): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
