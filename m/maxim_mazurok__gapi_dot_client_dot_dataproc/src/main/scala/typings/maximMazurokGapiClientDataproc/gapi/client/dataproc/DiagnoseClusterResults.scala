package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnoseClusterResults extends StObject {
  
  /** Output only. The Cloud Storage URI of the diagnostic output. The output report is a plain text file with a summary of collected diagnostics. */
  var outputUri: js.UndefOr[String] = js.native
}
object DiagnoseClusterResults {
  
  @scala.inline
  def apply(): DiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnoseClusterResults]
  }
  
  @scala.inline
  implicit class DiagnoseClusterResultsMutableBuilder[Self <: DiagnoseClusterResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
