package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiagnoseClusterResults extends StObject {
  
  /**
    * Output only. The Cloud Storage URI of the diagnostic output. The output report is a plain text file with a summary of collected diagnostics.
    */
  var outputUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiagnoseClusterResults {
  
  inline def apply(): SchemaDiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnoseClusterResults]
  }
  
  extension [Self <: SchemaDiagnoseClusterResults](x: Self) {
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriNull: Self = StObject.set(x, "outputUri", null)
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
