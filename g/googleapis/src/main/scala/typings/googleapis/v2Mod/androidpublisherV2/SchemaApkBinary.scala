package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the binary payload of an APK.
  */
trait SchemaApkBinary extends StObject {
  
  /**
    * A sha1 hash of the APK payload, encoded as a hex string and matching the
    * output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.undefined
  
  /**
    * A sha256 hash of the APK payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.undefined
}
object SchemaApkBinary {
  
  inline def apply(): SchemaApkBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkBinary]
  }
  
  extension [Self <: SchemaApkBinary](x: Self) {
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
