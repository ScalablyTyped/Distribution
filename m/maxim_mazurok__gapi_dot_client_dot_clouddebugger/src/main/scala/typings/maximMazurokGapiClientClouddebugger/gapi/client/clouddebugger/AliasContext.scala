package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasContext extends StObject {
  
  /** The alias kind. */
  var kind: js.UndefOr[String] = js.native
  
  /** The alias name. */
  var name: js.UndefOr[String] = js.native
}
object AliasContext {
  
  @scala.inline
  def apply(): AliasContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasContext]
  }
  
  @scala.inline
  implicit class AliasContextMutableBuilder[Self <: AliasContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
