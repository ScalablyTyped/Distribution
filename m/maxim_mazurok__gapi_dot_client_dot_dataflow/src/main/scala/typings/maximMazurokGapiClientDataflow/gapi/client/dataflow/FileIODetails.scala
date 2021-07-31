package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileIODetails extends StObject {
  
  /** File Pattern used to access files by the connector. */
  var filePattern: js.UndefOr[String] = js.undefined
}
object FileIODetails {
  
  @scala.inline
  def apply(): FileIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileIODetails]
  }
  
  @scala.inline
  implicit class FileIODetailsMutableBuilder[Self <: FileIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePattern(value: String): Self = StObject.set(x, "filePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePatternUndefined: Self = StObject.set(x, "filePattern", js.undefined)
  }
}
