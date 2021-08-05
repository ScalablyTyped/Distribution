package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of targeted and excluded URLs (e.g., google.com). For
  * Private Auction and AdX Preferred Deals, URLs are either included or
  * excluded. For Programmatic Guaranteed and Preferred Deals, this doesn&#39;t
  * apply.
  */
trait SchemaUrlTargeting extends StObject {
  
  /**
    * A list of URLs to be excluded.
    */
  var excludedUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of URLs to be included.
    */
  var targetedUrls: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaUrlTargeting {
  
  inline def apply(): SchemaUrlTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlTargeting]
  }
  
  extension [Self <: SchemaUrlTargeting](x: Self) {
    
    inline def setExcludedUrls(value: js.Array[String]): Self = StObject.set(x, "excludedUrls", value.asInstanceOf[js.Any])
    
    inline def setExcludedUrlsUndefined: Self = StObject.set(x, "excludedUrls", js.undefined)
    
    inline def setExcludedUrlsVarargs(value: String*): Self = StObject.set(x, "excludedUrls", js.Array(value :_*))
    
    inline def setTargetedUrls(value: js.Array[String]): Self = StObject.set(x, "targetedUrls", value.asInstanceOf[js.Any])
    
    inline def setTargetedUrlsUndefined: Self = StObject.set(x, "targetedUrls", js.undefined)
    
    inline def setTargetedUrlsVarargs(value: String*): Self = StObject.set(x, "targetedUrls", js.Array(value :_*))
  }
}
