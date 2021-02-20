package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiStrings.base64
import typings.hapiHapi.hapiHapiStrings.base64json
import typings.hapiHapi.hapiHapiStrings.form
import typings.hapiHapi.hapiHapiStrings.iron
import typings.hapiHapi.hapiHapiStrings.none_
import typings.hapiHapi.mod.SameSitePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends StObject {
  
  var encoding: js.UndefOr[none_ | base64 | base64json | form | iron] = js.native
  
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  
  var isSameSite: js.UndefOr[SameSitePolicy] = js.native
  
  var isSecure: js.UndefOr[Boolean] = js.native
  
  var strictHeader: js.UndefOr[Boolean] = js.native
}
object Encoding {
  
  @scala.inline
  def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: none_ | base64 | base64json | form | iron): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    @scala.inline
    def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
    
    @scala.inline
    def setIsSameSite(value: SameSitePolicy): Self = StObject.set(x, "isSameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSameSiteUndefined: Self = StObject.set(x, "isSameSite", js.undefined)
    
    @scala.inline
    def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
    
    @scala.inline
    def setStrictHeader(value: Boolean): Self = StObject.set(x, "strictHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictHeaderUndefined: Self = StObject.set(x, "strictHeader", js.undefined)
  }
}
