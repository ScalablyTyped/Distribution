package typings.hapi.anon

import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiStrings.Lax
import typings.hapi.hapiStrings.Strict
import typings.hapi.hapiStrings.base64
import typings.hapi.hapiStrings.base64json
import typings.hapi.hapiStrings.form
import typings.hapi.hapiStrings.iron
import typings.hapi.hapiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.undefined
  
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  
  var isSameSite: js.UndefOr[`false` | Strict | Lax] = js.undefined
  
  var isSecure: js.UndefOr[Boolean] = js.undefined
  
  var strictHeader: js.UndefOr[Boolean] = js.undefined
}
object Encoding {
  
  inline def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: none | base64 | base64json | form | iron): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    inline def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
    
    inline def setIsSameSite(value: `false` | Strict | Lax): Self = StObject.set(x, "isSameSite", value.asInstanceOf[js.Any])
    
    inline def setIsSameSiteUndefined: Self = StObject.set(x, "isSameSite", js.undefined)
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
    
    inline def setStrictHeader(value: Boolean): Self = StObject.set(x, "strictHeader", value.asInstanceOf[js.Any])
    
    inline def setStrictHeaderUndefined: Self = StObject.set(x, "strictHeader", js.undefined)
  }
}
