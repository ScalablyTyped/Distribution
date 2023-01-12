package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheDetails extends StObject {
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  
  /** Etag */
  var eTag: String
  
  /**
    * Expiration time of the cache entry.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var expires: js.UndefOr[String] = js.undefined
  
  /** The number of times the cache entry has been opened. */
  var hitCount: Double
  
  /**
    * The last time the cache entry was opened.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var lastAccess: String
}
object CacheDetails {
  
  inline def apply(eTag: String, hitCount: Double, lastAccess: String): CacheDetails = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], lastAccess = lastAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheDetails] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHitCount(value: Double): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    inline def setLastAccess(value: String): Self = StObject.set(x, "lastAccess", value.asInstanceOf[js.Any])
  }
}
