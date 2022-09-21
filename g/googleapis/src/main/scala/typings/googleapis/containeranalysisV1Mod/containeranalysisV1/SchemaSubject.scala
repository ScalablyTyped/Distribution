package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubject extends StObject {
  
  /**
    * `"": ""` Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
    */
  var digest: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubject {
  
  inline def apply(): SchemaSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubject]
  }
  
  extension [Self <: SchemaSubject](x: Self) {
    
    inline def setDigest(value: StringDictionary[String]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
