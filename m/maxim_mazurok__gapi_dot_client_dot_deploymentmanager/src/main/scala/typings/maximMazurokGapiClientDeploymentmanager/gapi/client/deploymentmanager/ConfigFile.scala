package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFile extends StObject {
  
  /** The contents of the file. */
  var content: js.UndefOr[String] = js.native
}
object ConfigFile {
  
  @scala.inline
  def apply(): ConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFile]
  }
  
  @scala.inline
  implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
