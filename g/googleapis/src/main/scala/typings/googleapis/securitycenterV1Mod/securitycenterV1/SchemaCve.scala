package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCve extends StObject {
  
  /**
    * Describe Common Vulnerability Scoring System specified at https://www.first.org/cvss/v3.1/specification-document
    */
  var cvssv3: js.UndefOr[SchemaCvssv3] = js.undefined
  
  /**
    * The unique identifier for the vulnerability. e.g. CVE-2021-34527
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about the CVE. e.g. https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-34527
    */
  var references: js.UndefOr[js.Array[SchemaReference]] = js.undefined
  
  /**
    * Whether upstream fix is available for the CVE.
    */
  var upstreamFixAvailable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCve {
  
  inline def apply(): SchemaCve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCve]
  }
  
  extension [Self <: SchemaCve](x: Self) {
    
    inline def setCvssv3(value: SchemaCvssv3): Self = StObject.set(x, "cvssv3", value.asInstanceOf[js.Any])
    
    inline def setCvssv3Undefined: Self = StObject.set(x, "cvssv3", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setReferences(value: js.Array[SchemaReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: SchemaReference*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setUpstreamFixAvailable(value: Boolean): Self = StObject.set(x, "upstreamFixAvailable", value.asInstanceOf[js.Any])
    
    inline def setUpstreamFixAvailableNull: Self = StObject.set(x, "upstreamFixAvailable", null)
    
    inline def setUpstreamFixAvailableUndefined: Self = StObject.set(x, "upstreamFixAvailable", js.undefined)
  }
}
