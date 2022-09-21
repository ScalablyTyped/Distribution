package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateExtensionConstraints extends StObject {
  
  /**
    * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
    */
  var additionalExtensions: js.UndefOr[js.Array[SchemaObjectId]] = js.undefined
  
  /**
    * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
    */
  var knownExtensions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCertificateExtensionConstraints {
  
  inline def apply(): SchemaCertificateExtensionConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateExtensionConstraints]
  }
  
  extension [Self <: SchemaCertificateExtensionConstraints](x: Self) {
    
    inline def setAdditionalExtensions(value: js.Array[SchemaObjectId]): Self = StObject.set(x, "additionalExtensions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExtensionsUndefined: Self = StObject.set(x, "additionalExtensions", js.undefined)
    
    inline def setAdditionalExtensionsVarargs(value: SchemaObjectId*): Self = StObject.set(x, "additionalExtensions", js.Array(value*))
    
    inline def setKnownExtensions(value: js.Array[String]): Self = StObject.set(x, "knownExtensions", value.asInstanceOf[js.Any])
    
    inline def setKnownExtensionsNull: Self = StObject.set(x, "knownExtensions", null)
    
    inline def setKnownExtensionsUndefined: Self = StObject.set(x, "knownExtensions", js.undefined)
    
    inline def setKnownExtensionsVarargs(value: String*): Self = StObject.set(x, "knownExtensions", js.Array(value*))
  }
}
