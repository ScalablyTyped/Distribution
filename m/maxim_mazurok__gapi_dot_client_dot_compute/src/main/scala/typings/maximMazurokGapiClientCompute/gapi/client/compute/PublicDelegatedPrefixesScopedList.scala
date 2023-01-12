package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDelegatedPrefixesScopedList extends StObject {
  
  /** [Output Only] A list of PublicDelegatedPrefixes contained in this scope. */
  var publicDelegatedPrefixes: js.UndefOr[js.Array[PublicDelegatedPrefix]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of public delegated prefixes when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object PublicDelegatedPrefixesScopedList {
  
  inline def apply(): PublicDelegatedPrefixesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicDelegatedPrefixesScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicDelegatedPrefixesScopedList] (val x: Self) extends AnyVal {
    
    inline def setPublicDelegatedPrefixes(value: js.Array[PublicDelegatedPrefix]): Self = StObject.set(x, "publicDelegatedPrefixes", value.asInstanceOf[js.Any])
    
    inline def setPublicDelegatedPrefixesUndefined: Self = StObject.set(x, "publicDelegatedPrefixes", js.undefined)
    
    inline def setPublicDelegatedPrefixesVarargs(value: PublicDelegatedPrefix*): Self = StObject.set(x, "publicDelegatedPrefixes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
