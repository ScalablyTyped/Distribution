package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authority extends StObject {
  
  /** Hint hints at the purpose of the attestation authority. */
  var hint: js.UndefOr[Hint] = js.undefined
}
object Authority {
  
  @scala.inline
  def apply(): Authority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authority]
  }
  
  @scala.inline
  implicit class AuthorityMutableBuilder[Self <: Authority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
