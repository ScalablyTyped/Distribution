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
  
  inline def apply(): UrlTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlTargeting]
  }
  
  extension [Self <: UrlTargeting](x: Self) {
    
    inline def setExcludedUrls(value: js.Array[String]): Self = StObject.set(x, "excludedUrls", value.asInstanceOf[js.Any])
    
    inline def setExcludedUrlsUndefined: Self = StObject.set(x, "excludedUrls", js.undefined)
    
    inline def setExcludedUrlsVarargs(value: String*): Self = StObject.set(x, "excludedUrls", js.Array(value :_*))
    
    inline def setTargetedUrls(value: js.Array[String]): Self = StObject.set(x, "targetedUrls", value.asInstanceOf[js.Any])
    
    inline def setTargetedUrlsUndefined: Self = StObject.set(x, "targetedUrls", js.undefined)
    
    inline def setTargetedUrlsVarargs(value: String*): Self = StObject.set(x, "targetedUrls", js.Array(value :_*))
  }
}
