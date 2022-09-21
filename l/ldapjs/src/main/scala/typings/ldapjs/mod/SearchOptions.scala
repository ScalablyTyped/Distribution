package typings.ldapjs.mod

import typings.ldapjs.anon.PagePause
import typings.ldapjs.ldapjsStrings.base
import typings.ldapjs.ldapjsStrings.one
import typings.ldapjs.ldapjsStrings.sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions extends StObject {
  
  /** Defaults to the empty set, which means all attributes */
  var attributes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var derefAliases: js.UndefOr[Double] = js.undefined
  
  /**  Defaults to (objectclass=*) */
  var filter: js.UndefOr[String | Filter] = js.undefined
  
  var paged: js.UndefOr[Boolean | PagePause] = js.undefined
  
  /** Defaults to base */
  var scope: js.UndefOr[base | one | sub] = js.undefined
  
  /** Defaults to 0 (unlimited) */
  var sizeLimit: js.UndefOr[Double] = js.undefined
  
  /** Timeout in seconds. Defaults to 10. Lots of servers will ignore this! */
  var timeLimit: js.UndefOr[Double] = js.undefined
  
  var typesOnly: js.UndefOr[Boolean] = js.undefined
}
object SearchOptions {
  
  inline def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  extension [Self <: SearchOptions](x: Self) {
    
    inline def setAttributes(value: String | js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDerefAliases(value: Double): Self = StObject.set(x, "derefAliases", value.asInstanceOf[js.Any])
    
    inline def setDerefAliasesUndefined: Self = StObject.set(x, "derefAliases", js.undefined)
    
    inline def setFilter(value: String | Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPaged(value: Boolean | PagePause): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
    
    inline def setPagedUndefined: Self = StObject.set(x, "paged", js.undefined)
    
    inline def setScope(value: base | one | sub): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
    
    inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
    
    inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    
    inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    
    inline def setTypesOnly(value: Boolean): Self = StObject.set(x, "typesOnly", value.asInstanceOf[js.Any])
    
    inline def setTypesOnlyUndefined: Self = StObject.set(x, "typesOnly", js.undefined)
  }
}
