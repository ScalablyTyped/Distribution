package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataUriOptions extends StObject {
  
  /**
    * optional parameter defaulting to true which will require `=` padding if true or make padding optional if false
    *
    * @default true
    */
  var paddingRequired: js.UndefOr[Boolean] = js.undefined
}
object DataUriOptions {
  
  inline def apply(): DataUriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataUriOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataUriOptions] (val x: Self) extends AnyVal {
    
    inline def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
    
    inline def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
  }
}
