package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFile extends StObject {
  
  /** The contents of the file. */
  var content: js.UndefOr[String] = js.undefined
}
object ConfigFile {
  
  inline def apply(): ConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFile]
  }
  
  extension [Self <: ConfigFile](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
