package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedUrl extends StObject {
  
  /** Label to describe usage of the URL. */
  var label: js.UndefOr[String] = js.native
  
  /** Specific URL associated with the resource. */
  var url: js.UndefOr[String] = js.native
}
object RelatedUrl {
  
  @scala.inline
  def apply(): RelatedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedUrl]
  }
  
  @scala.inline
  implicit class RelatedUrlMutableBuilder[Self <: RelatedUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
