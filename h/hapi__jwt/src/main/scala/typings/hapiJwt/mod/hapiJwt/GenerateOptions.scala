package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateOptions extends StObject {
  
  /**
    * String to set the encoding use for stringify the payload. Default is utf8.
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * Object to put additional key/value pairs in the header of the token in addition to alg and typ.
    */
  var header: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Boolean if set to true will decode a valid headless token. Default is false.
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if set to false typ: 'JWT' is not included in the header.
    */
  var iat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Integer as an alternative way to set iat claim. Takes JavaScript style epoch time (with ms). iat claim must not be set and iat option must not be false. Milliseconds are truncated.
    */
  var now: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer as an alternative way to set exp claim. exp is set to be iat + ttlSec. exp claim must not be set.
    */
  var ttlSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Boolean if set to false typ: 'JWT' is not included in the header.
    */
  var typ: js.UndefOr[Boolean] = js.undefined
}
object GenerateOptions {
  
  inline def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setIat(value: Boolean): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setTtlSec(value: Double): Self = StObject.set(x, "ttlSec", value.asInstanceOf[js.Any])
    
    inline def setTtlSecUndefined: Self = StObject.set(x, "ttlSec", js.undefined)
    
    inline def setTyp(value: Boolean): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
    
    inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
  }
}
