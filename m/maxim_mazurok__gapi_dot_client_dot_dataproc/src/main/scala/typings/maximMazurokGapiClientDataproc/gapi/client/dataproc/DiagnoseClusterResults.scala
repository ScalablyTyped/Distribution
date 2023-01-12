package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnoseClusterResults extends StObject {
  
  /** Output only. The Cloud Storage URI of the diagnostic output. The output report is a plain text file with a summary of collected diagnostics. */
  var outputUri: js.UndefOr[String] = js.undefined
}
object DiagnoseClusterResults {
  
  inline def apply(): DiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnoseClusterResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnoseClusterResults] (val x: Self) extends AnyVal {
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
