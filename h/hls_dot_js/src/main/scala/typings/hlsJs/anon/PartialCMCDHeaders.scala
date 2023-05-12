package typings.hlsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hls.js.hls.js.CMCDHeaders> */
trait PartialCMCDHeaders extends StObject {
  
  var `CMCD-Object`: js.UndefOr[String] = js.undefined
  
  var `CMCD-Request`: js.UndefOr[String] = js.undefined
  
  var `CMCD-Session`: js.UndefOr[String] = js.undefined
  
  var `CMCD-Status`: js.UndefOr[String] = js.undefined
}
object PartialCMCDHeaders {
  
  inline def apply(): PartialCMCDHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCMCDHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCMCDHeaders] (val x: Self) extends AnyVal {
    
    inline def `setCMCD-Object`(value: String): Self = StObject.set(x, "CMCD-Object", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-ObjectUndefined`: Self = StObject.set(x, "CMCD-Object", js.undefined)
    
    inline def `setCMCD-Request`(value: String): Self = StObject.set(x, "CMCD-Request", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-RequestUndefined`: Self = StObject.set(x, "CMCD-Request", js.undefined)
    
    inline def `setCMCD-Session`(value: String): Self = StObject.set(x, "CMCD-Session", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-SessionUndefined`: Self = StObject.set(x, "CMCD-Session", js.undefined)
    
    inline def `setCMCD-Status`(value: String): Self = StObject.set(x, "CMCD-Status", value.asInstanceOf[js.Any])
    
    inline def `setCMCD-StatusUndefined`: Self = StObject.set(x, "CMCD-Status", js.undefined)
  }
}
