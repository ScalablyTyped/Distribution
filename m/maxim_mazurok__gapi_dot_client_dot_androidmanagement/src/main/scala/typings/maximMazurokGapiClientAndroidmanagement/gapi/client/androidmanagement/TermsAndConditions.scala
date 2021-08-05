package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsAndConditions extends StObject {
  
  /** A well-formatted HTML string. It will be parsed on the client with android.text.Html#fromHtml. */
  var content: js.UndefOr[UserFacingMessage] = js.undefined
  
  /** A short header which appears above the HTML content. */
  var header: js.UndefOr[UserFacingMessage] = js.undefined
}
object TermsAndConditions {
  
  inline def apply(): TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditions]
  }
  
  extension [Self <: TermsAndConditions](x: Self) {
    
    inline def setContent(value: UserFacingMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeader(value: UserFacingMessage): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
