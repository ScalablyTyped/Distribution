package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The expected state of a client&#39;s local database.
  */
trait SchemaChecksum extends StObject {
  
  /**
    * The SHA256 hash of the client state; that is, of the sorted list of all
    * hashes present in the database.
    */
  var sha256: js.UndefOr[String] = js.undefined
}
object SchemaChecksum {
  
  @scala.inline
  def apply(): SchemaChecksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChecksum]
  }
  
  @scala.inline
  implicit class SchemaChecksumMutableBuilder[Self <: SchemaChecksum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
