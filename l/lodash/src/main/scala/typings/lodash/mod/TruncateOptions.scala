package typings.lodash.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncateOptions extends StObject {
  
  /**
    * @see _.length
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * @see _.omission
    */
  var omission: js.UndefOr[java.lang.String] = js.native
  
  /**
    * @see _.separator
    */
  var separator: js.UndefOr[java.lang.String | RegExp] = js.native
}
object TruncateOptions {
  
  @scala.inline
  def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  
  @scala.inline
  implicit class TruncateOptionsMutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setOmission(value: java.lang.String): Self = StObject.set(x, "omission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmissionUndefined: Self = StObject.set(x, "omission", js.undefined)
    
    @scala.inline
    def setSeparator(value: java.lang.String | RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
