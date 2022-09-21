package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecret extends StObject {
  
  /**
    * The resource name of the secret version in the format, format as: `projects/x/secrets/x/versions/x`.
    */
  var secretVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecret {
  
  inline def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  
  extension [Self <: SchemaSecret](x: Self) {
    
    inline def setSecretVersion(value: String): Self = StObject.set(x, "secretVersion", value.asInstanceOf[js.Any])
    
    inline def setSecretVersionNull: Self = StObject.set(x, "secretVersion", null)
    
    inline def setSecretVersionUndefined: Self = StObject.set(x, "secretVersion", js.undefined)
  }
}
