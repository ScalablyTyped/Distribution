package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.libTypesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.libTypesMod.FilterCriterion
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFiltersFilterCrite] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: FilterCriteria): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: FilterCriterion*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: FilterCriteria): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: FilterCriterion*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
}
