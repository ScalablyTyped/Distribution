package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum extends StObject {
  
  /**
    * The SHA256 hash of the client state; that is, of the sorted list of all hashes present in the database.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum {
  
  inline def apply(): SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum](x: Self) {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
