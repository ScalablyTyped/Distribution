package typings.ldapjs.mod

import typings.ldapjs.anon.PagePause
import typings.ldapjs.ldapjsStrings.base
import typings.ldapjs.ldapjsStrings.one
import typings.ldapjs.ldapjsStrings.sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptions extends StObject {
  
  /** Defaults to the empty set, which means all attributes */
  var attributes: js.UndefOr[String | js.Array[String]] = js.native
  
  var derefAliases: js.UndefOr[Double] = js.native
  
  /**  Defaults to (objectclass=*) */
  var filter: js.UndefOr[String | Filter] = js.native
  
  var paged: js.UndefOr[Boolean | PagePause] = js.native
  
  /** Defaults to base */
  var scope: js.UndefOr[base | one | sub] = js.native
  
  /** Defaults to 0 (unlimited) */
  var sizeLimit: js.UndefOr[Double] = js.native
  
  /** Timeout in seconds. Defaults to 10. Lots of servers will ignore this! */
  var timeLimit: js.UndefOr[Double] = js.native
  
  var typesOnly: js.UndefOr[Boolean] = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: String | js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDerefAliases(value: Double): Self = StObject.set(x, "derefAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerefAliasesUndefined: Self = StObject.set(x, "derefAliases", js.undefined)
    
    @scala.inline
    def setFilter(value: String | Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPaged(value: Boolean | PagePause): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagedUndefined: Self = StObject.set(x, "paged", js.undefined)
    
    @scala.inline
    def setScope(value: base | one | sub): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
    
    @scala.inline
    def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    
    @scala.inline
    def setTypesOnly(value: Boolean): Self = StObject.set(x, "typesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesOnlyUndefined: Self = StObject.set(x, "typesOnly", js.undefined)
  }
}
