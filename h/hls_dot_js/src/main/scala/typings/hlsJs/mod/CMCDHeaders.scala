package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CMCD Headers
  */
trait CMCDHeaders extends StObject {
  
  var `CMCD-Object`: String
  
  var `CMCD-Request`: String
  
  var `CMCD-Session`: String
  
  var `CMCD-Status`: String
}
object CMCDHeaders {
  
  inline def apply(`CMCD-Object`: String, `CMCD-Request`: String, `CMCD-Session`: String, `CMCD-Status`: String): CMCDHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CMCD-Object")(`CMCD-Object`.asInstanceOf[js.Any])
    __obj.updateDynamic("CMCD-Request")(`CMCD-Request`.asInstanceOf[js.Any])
    __obj.updateDynamic("CMCD-Session")(`CMCD-Session`.asInstanceOf[js.Any])
    __obj.updateDynamic("CMCD-Status")(`CMCD-Status`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMCDHeaders]
  }
  
  extension [Self <: CMCDHeaders](x: Self) {
    
    inline def `setCMCD-Object`(value: String): Self = StObject.set(x, "CMCD-Object", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-Request`(value: String): Self = StObject.set(x, "CMCD-Request", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-Session`(value: String): Self = StObject.set(x, "CMCD-Session", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-Status`(value: String): Self = StObject.set(x, "CMCD-Status", value.asInstanceOf[js.Any])
  }
}
