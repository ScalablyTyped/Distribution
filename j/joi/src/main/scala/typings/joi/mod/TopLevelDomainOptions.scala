package typings.joi.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopLevelDomainOptions extends StObject {
  
  /**
    * - `true` to use the IANA list of registered TLDs. This is the default value.
    * - `false` to allow any TLD not listed in the `deny` list, if present.
    * - A `Set` or array of the allowed TLDs. Cannot be used together with `deny`.
    */
  var allow: js.UndefOr[Set[String] | js.Array[String] | Boolean] = js.undefined
  
  /**
    * - A `Set` or array of the forbidden TLDs. Cannot be used together with a custom `allow` list.
    */
  var deny: js.UndefOr[Set[String] | js.Array[String]] = js.undefined
}
object TopLevelDomainOptions {
  
  @scala.inline
  def apply(): TopLevelDomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopLevelDomainOptions]
  }
  
  @scala.inline
  implicit class TopLevelDomainOptionsMutableBuilder[Self <: TopLevelDomainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Set[String] | js.Array[String] | Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value :_*))
    
    @scala.inline
    def setDeny(value: Set[String] | js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
    
    @scala.inline
    def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value :_*))
  }
}
