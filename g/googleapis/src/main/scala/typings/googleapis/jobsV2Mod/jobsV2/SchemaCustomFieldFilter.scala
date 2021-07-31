package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Custom field filter of the search.
  */
trait SchemaCustomFieldFilter extends StObject {
  
  /**
    * Required.  The query strings for the filter.
    */
  var queries: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  The type of filter. Defaults to FilterType.OR.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCustomFieldFilter {
  
  @scala.inline
  def apply(): SchemaCustomFieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomFieldFilter]
  }
  
  @scala.inline
  implicit class SchemaCustomFieldFilterMutableBuilder[Self <: SchemaCustomFieldFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
