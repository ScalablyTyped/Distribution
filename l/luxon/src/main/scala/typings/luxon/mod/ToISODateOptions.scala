package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToISODateOptions extends StObject {
  
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.native
}
object ToISODateOptions {
  
  @scala.inline
  def apply(): ToISODateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISODateOptions]
  }
  
  @scala.inline
  implicit class ToISODateOptionsMutableBuilder[Self <: ToISODateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ToISOFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
