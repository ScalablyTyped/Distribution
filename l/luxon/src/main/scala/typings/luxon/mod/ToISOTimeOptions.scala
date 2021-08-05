package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToISOTimeOptions extends StObject {
  
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.undefined
  
  /**
    * @default true
    */
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var suppressMilliseconds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var suppressSeconds: js.UndefOr[Boolean] = js.undefined
}
object ToISOTimeOptions {
  
  inline def apply(): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISOTimeOptions]
  }
  
  extension [Self <: ToISOTimeOptions](x: Self) {
    
    inline def setFormat(value: ToISOFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIncludeOffset(value: Boolean): Self = StObject.set(x, "includeOffset", value.asInstanceOf[js.Any])
    
    inline def setIncludeOffsetUndefined: Self = StObject.set(x, "includeOffset", js.undefined)
    
    inline def setSuppressMilliseconds(value: Boolean): Self = StObject.set(x, "suppressMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setSuppressMillisecondsUndefined: Self = StObject.set(x, "suppressMilliseconds", js.undefined)
    
    inline def setSuppressSeconds(value: Boolean): Self = StObject.set(x, "suppressSeconds", value.asInstanceOf[js.Any])
    
    inline def setSuppressSecondsUndefined: Self = StObject.set(x, "suppressSeconds", js.undefined)
  }
}
