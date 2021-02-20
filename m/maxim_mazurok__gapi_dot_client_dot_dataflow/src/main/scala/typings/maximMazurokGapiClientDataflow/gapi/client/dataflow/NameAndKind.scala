package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameAndKind extends StObject {
  
  /** Counter aggregation kind. */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of the counter. */
  var name: js.UndefOr[String] = js.native
}
object NameAndKind {
  
  @scala.inline
  def apply(): NameAndKind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameAndKind]
  }
  
  @scala.inline
  implicit class NameAndKindMutableBuilder[Self <: NameAndKind] (val x: Self) extends AnyVal {
    
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
