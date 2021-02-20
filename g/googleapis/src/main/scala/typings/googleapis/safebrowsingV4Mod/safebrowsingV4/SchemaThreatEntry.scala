package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual threat; for example, a malicious URL or its hash
  * representation. Only one of these fields should be set.
  */
@js.native
trait SchemaThreatEntry extends StObject {
  
  /**
    * The digest of an executable in SHA256 format. The API supports both
    * binary and hex digests. For JSON requests, digests are base64-encoded.
    */
  var digest: js.UndefOr[String] = js.native
  
  /**
    * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
    * hash. This field is in binary format. For JSON requests, hashes are
    * base64-encoded.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * A URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaThreatEntry {
  
  @scala.inline
  def apply(): SchemaThreatEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatEntry]
  }
  
  @scala.inline
  implicit class SchemaThreatEntryMutableBuilder[Self <: SchemaThreatEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
