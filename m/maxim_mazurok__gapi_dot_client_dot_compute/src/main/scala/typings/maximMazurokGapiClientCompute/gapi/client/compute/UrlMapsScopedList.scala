package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapsScopedList extends StObject {
  
  /** A list of UrlMaps contained in this scope. */
  var urlMaps: js.UndefOr[js.Array[UrlMap]] = js.undefined
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object UrlMapsScopedList {
  
  @scala.inline
  def apply(): UrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsScopedList]
  }
  
  @scala.inline
  implicit class UrlMapsScopedListMutableBuilder[Self <: UrlMapsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlMaps(value: js.Array[UrlMap]): Self = StObject.set(x, "urlMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMapsUndefined: Self = StObject.set(x, "urlMaps", js.undefined)
    
    @scala.inline
    def setUrlMapsVarargs(value: UrlMap*): Self = StObject.set(x, "urlMaps", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
