package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlTargeting extends StObject {
  
  /** A list of URLs to be excluded. */
  var excludedUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of URLs to be included. */
  var targetedUrls: js.UndefOr[js.Array[String]] = js.undefined
}
object UrlTargeting {
  
  @scala.inline
  def apply(): UrlTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlTargeting]
  }
  
  @scala.inline
  implicit class UrlTargetingMutableBuilder[Self <: UrlTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedUrls(value: js.Array[String]): Self = StObject.set(x, "excludedUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedUrlsUndefined: Self = StObject.set(x, "excludedUrls", js.undefined)
    
    @scala.inline
    def setExcludedUrlsVarargs(value: String*): Self = StObject.set(x, "excludedUrls", js.Array(value :_*))
    
    @scala.inline
    def setTargetedUrls(value: js.Array[String]): Self = StObject.set(x, "targetedUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedUrlsUndefined: Self = StObject.set(x, "targetedUrls", js.undefined)
    
    @scala.inline
    def setTargetedUrlsVarargs(value: String*): Self = StObject.set(x, "targetedUrls", js.Array(value :_*))
  }
}
