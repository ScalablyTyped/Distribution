package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
  ] = js.native
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
  ] = js.native
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<number> */ js.Any
  ] = js.native
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
  ] = js.native
}

object PagingOptions {
  @scala.inline
  def apply(): PagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagingOptions]
  }
  @scala.inline
  implicit class PagingOptionsOps[Self <: PagingOptions] (val x: Self) extends AnyVal {
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
    def setCurrentPage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setPageSize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<number> */ js.Any
    ): Self = this.set("pageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizes: Self = this.set("pageSizes", js.undefined)
    @scala.inline
    def setTotalServerItems(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = this.set("totalServerItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalServerItems: Self = this.set("totalServerItems", js.undefined)
  }
  
}

