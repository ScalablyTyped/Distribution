package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecret extends StObject {
  
  /**
    * The relative resource name of a Secret Manager secret version, in the following form:projects/{project_number\}/secrets/{secret_id\}/versions/{version_id\}.
    */
  var cloudSecret: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecret {
  
  inline def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  
  extension [Self <: SchemaSecret](x: Self) {
    
    inline def setCloudSecret(value: String): Self = StObject.set(x, "cloudSecret", value.asInstanceOf[js.Any])
    
    inline def setCloudSecretNull: Self = StObject.set(x, "cloudSecret", null)
    
    inline def setCloudSecretUndefined: Self = StObject.set(x, "cloudSecret", js.undefined)
  }
}
