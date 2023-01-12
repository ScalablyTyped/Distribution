package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scopes extends StObject {
  
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: {  description :string | undefined}} */ js.Any
  ] = js.undefined
}
object Scopes {
  
  inline def apply(): Scopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scopes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
    
    inline def setScopes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: {  description :string | undefined}} */ js.Any
    ): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
  }
}
