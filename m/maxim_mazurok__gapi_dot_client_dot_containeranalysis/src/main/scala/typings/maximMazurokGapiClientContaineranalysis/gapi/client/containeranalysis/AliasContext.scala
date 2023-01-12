package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasContext extends StObject {
  
  /** The alias kind. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The alias name. */
  var name: js.UndefOr[String] = js.undefined
}
object AliasContext {
  
  inline def apply(): AliasContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasContext] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
