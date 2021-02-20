package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartEnvironmentMetadata extends StObject {
  
  /** Current state of the environment being started. */
  var state: js.UndefOr[String] = js.native
}
object StartEnvironmentMetadata {
  
  @scala.inline
  def apply(): StartEnvironmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEnvironmentMetadata]
  }
  
  @scala.inline
  implicit class StartEnvironmentMetadataMutableBuilder[Self <: StartEnvironmentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
