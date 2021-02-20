package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportFile extends StObject {
  
  /** The contents of the file. */
  var content: js.UndefOr[String] = js.native
  
  /** The name of the file. */
  var name: js.UndefOr[String] = js.native
}
object ImportFile {
  
  @scala.inline
  def apply(): ImportFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportFile]
  }
  
  @scala.inline
  implicit class ImportFileMutableBuilder[Self <: ImportFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
