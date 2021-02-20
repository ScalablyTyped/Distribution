package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.Filters<@jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriteria>> */
  @js.native
  trait PartialFiltersFilterCrite extends StObject {
    
    var exclude: js.UndefOr[FilterCriteria] = js.native
    
    var include: js.UndefOr[FilterCriteria] = js.native
  }
  object PartialFiltersFilterCrite {
    
    @scala.inline
    def apply(): PartialFiltersFilterCrite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFiltersFilterCrite]
    }
    
    @scala.inline
    implicit class PartialFiltersFilterCriteMutableBuilder[Self <: PartialFiltersFilterCrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: FilterCriteria): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: FilterCriterion*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: FilterCriteria): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: FilterCriterion*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
