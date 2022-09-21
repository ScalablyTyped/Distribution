package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaterial extends StObject {
  
  /**
    * digest is a map from a hash algorithm (e.g. sha256) to the value in the material
    */
  var digest: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * uri is the uri of the material
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaterial {
  
  inline def apply(): SchemaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterial]
  }
  
  extension [Self <: SchemaMaterial](x: Self) {
    
    inline def setDigest(value: StringDictionary[String]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
