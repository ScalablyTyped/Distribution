package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@hapi/joi.@hapi/joi.DataUriOptions, 'paddingRequired'> */
@js.native
trait Base64Options extends StObject {
  
  var paddingRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * if true, uses the URI-safe base64 format which replaces `+` with `-` and `\` with `_`.
    *
    * @default false
    */
  var urlSafe: js.UndefOr[Boolean] = js.native
}
object Base64Options {
  
  @scala.inline
  def apply(): Base64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base64Options]
  }
  
  @scala.inline
  implicit class Base64OptionsMutableBuilder[Self <: Base64Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
    
    @scala.inline
    def setUrlSafe(value: Boolean): Self = StObject.set(x, "urlSafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlSafeUndefined: Self = StObject.set(x, "urlSafe", js.undefined)
  }
}
