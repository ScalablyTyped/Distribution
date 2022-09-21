package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeDistribution extends StObject {
  
  /**
    * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at
    * https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
    */
  var classification: js.UndefOr[String] = js.undefined
  
  /** Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/. */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /** The cve tied to this Upgrade. */
  var cve: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The severity as specified by the upstream operating system. */
  var severity: js.UndefOr[String] = js.undefined
}
object UpgradeDistribution {
  
  inline def apply(): UpgradeDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeDistribution]
  }
  
  extension [Self <: UpgradeDistribution](x: Self) {
    
    inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setCve(value: js.Array[String]): Self = StObject.set(x, "cve", value.asInstanceOf[js.Any])
    
    inline def setCveUndefined: Self = StObject.set(x, "cve", js.undefined)
    
    inline def setCveVarargs(value: String*): Self = StObject.set(x, "cve", js.Array(value*))
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
