package typings.jsdevtoolsFilePathFilter.anon

import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.Filters<@jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriteria>> */
@js.native
trait PartialFiltersFilterCrite extends js.Object {
  
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
  implicit class PartialFiltersFilterCriteOps[Self <: PartialFiltersFilterCrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludeVarargs(value: FilterCriterion*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: FilterCriteria): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: FilterCriterion*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: FilterCriteria): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
