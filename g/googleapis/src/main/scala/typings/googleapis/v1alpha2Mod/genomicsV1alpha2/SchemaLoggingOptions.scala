package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The logging options for the pipeline run.
  */
@js.native
trait SchemaLoggingOptions extends StObject {
  
  /**
    * The location in Google Cloud Storage to which the pipeline logs will be
    * copied. Can be specified as a fully qualified directory path, in which
    * case logs will be output with a unique identifier as the filename in that
    * directory, or as a fully specified path, which must end in `.log`, in
    * which case that path will be used, and the user must ensure that logs are
    * not overwritten. Stdout and stderr logs from the run are also generated
    * and output as `-stdout.log` and `-stderr.log`.
    */
  var gcsPath: js.UndefOr[String] = js.native
}
object SchemaLoggingOptions {
  
  @scala.inline
  def apply(): SchemaLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingOptions]
  }
  
  @scala.inline
  implicit class SchemaLoggingOptionsMutableBuilder[Self <: SchemaLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
