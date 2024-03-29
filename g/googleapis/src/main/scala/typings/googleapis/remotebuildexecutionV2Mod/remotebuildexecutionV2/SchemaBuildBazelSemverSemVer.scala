package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelSemverSemVer extends StObject {
  
  /**
    * The major version, e.g 10 for 10.2.3.
    */
  var major: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minor version, e.g. 2 for 10.2.3.
    */
  var minor: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The patch version, e.g 3 for 10.2.3.
    */
  var patch: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The pre-release version. Either this field or major/minor/patch fields must be filled. They are mutually exclusive. Pre-release versions are assumed to be earlier than any released versions.
    */
  var prerelease: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildBazelSemverSemVer {
  
  inline def apply(): SchemaBuildBazelSemverSemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelSemverSemVer]
  }
  
  extension [Self <: SchemaBuildBazelSemverSemVer](x: Self) {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorNull: Self = StObject.set(x, "major", null)
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorNull: Self = StObject.set(x, "minor", null)
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchNull: Self = StObject.set(x, "patch", null)
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseNull: Self = StObject.set(x, "prerelease", null)
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
  }
}
