package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The location of diagnostic output.
  */
@js.native
trait SchemaDiagnoseClusterResults extends StObject {
  
  /**
    * Output only. The Cloud Storage URI of the diagnostic output. The output
    * report is a plain text file with a summary of collected diagnostics.
    */
  var outputUri: js.UndefOr[String] = js.native
}
object SchemaDiagnoseClusterResults {
  
  @scala.inline
  def apply(): SchemaDiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnoseClusterResults]
  }
  
  @scala.inline
  implicit class SchemaDiagnoseClusterResultsMutableBuilder[Self <: SchemaDiagnoseClusterResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
