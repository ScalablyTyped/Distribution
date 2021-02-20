package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployable extends StObject {
  
  /** Required. Resource URI for the artifact being deployed. */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
}
object Deployable {
  
  @scala.inline
  def apply(): Deployable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployable]
  }
  
  @scala.inline
  implicit class DeployableMutableBuilder[Self <: Deployable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    @scala.inline
    def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value :_*))
  }
}
