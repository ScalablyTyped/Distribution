package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToISOTimeOptions extends StObject {
  
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.native
  
  /**
    * @default true
    */
  var includeOffset: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var suppressMilliseconds: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var suppressSeconds: js.UndefOr[Boolean] = js.native
}
object ToISOTimeOptions {
  
  @scala.inline
  def apply(): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISOTimeOptions]
  }
  
  @scala.inline
  implicit class ToISOTimeOptionsMutableBuilder[Self <: ToISOTimeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ToISOFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIncludeOffset(value: Boolean): Self = StObject.set(x, "includeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOffsetUndefined: Self = StObject.set(x, "includeOffset", js.undefined)
    
    @scala.inline
    def setSuppressMilliseconds(value: Boolean): Self = StObject.set(x, "suppressMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMillisecondsUndefined: Self = StObject.set(x, "suppressMilliseconds", js.undefined)
    
    @scala.inline
    def setSuppressSeconds(value: Boolean): Self = StObject.set(x, "suppressSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressSecondsUndefined: Self = StObject.set(x, "suppressSeconds", js.undefined)
  }
}
