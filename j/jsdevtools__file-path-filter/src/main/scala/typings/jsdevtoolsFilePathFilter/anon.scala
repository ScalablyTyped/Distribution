package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.Filters<@jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriteria>> */
  trait PartialFiltersFilterCrite extends StObject {
    
    var exclude: js.UndefOr[FilterCriteria] = js.undefined
    
    var include: js.UndefOr[FilterCriteria] = js.undefined
  }
  object PartialFiltersFilterCrite {
    
    inline def apply(): PartialFiltersFilterCrite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFiltersFilterCrite]
    }
    
    extension [Self <: PartialFiltersFilterCrite](x: Self) {
      
      inline def setExclude(value: FilterCriteria): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: FilterCriterion*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: FilterCriteria): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: FilterCriterion*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
