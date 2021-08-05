package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFile extends StObject {
  
  /** The contents of the file. */
  var content: js.UndefOr[String] = js.undefined
  
  /** The name of the file. */
  var name: js.UndefOr[String] = js.undefined
}
object ImportFile {
  
  inline def apply(): ImportFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportFile]
  }
  
  extension [Self <: ImportFile](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
