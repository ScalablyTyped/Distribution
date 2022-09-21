package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSettings extends StObject {
  
  /** The redirection state of the legacy repositories in this project. */
  var legacyRedirectionState: js.UndefOr[String] = js.undefined
  
  /** The name of the project's settings. Always of the form: projects/{project-id}/projectSettings In update request: never set In response: always set */
  var name: js.UndefOr[String] = js.undefined
}
object ProjectSettings {
  
  inline def apply(): ProjectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectSettings]
  }
  
  extension [Self <: ProjectSettings](x: Self) {
    
    inline def setLegacyRedirectionState(value: String): Self = StObject.set(x, "legacyRedirectionState", value.asInstanceOf[js.Any])
    
    inline def setLegacyRedirectionStateUndefined: Self = StObject.set(x, "legacyRedirectionState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
