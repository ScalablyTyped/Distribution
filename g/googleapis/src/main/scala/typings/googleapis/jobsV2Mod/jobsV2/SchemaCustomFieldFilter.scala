package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Custom field filter of the search.
  */
@js.native
trait SchemaCustomFieldFilter extends js.Object {
  /**
    * Required.  The query strings for the filter.
    */
  var queries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The type of filter. Defaults to FilterType.OR.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCustomFieldFilter {
  @scala.inline
  def apply(): SchemaCustomFieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomFieldFilter]
  }
  @scala.inline
  implicit class SchemaCustomFieldFilterOps[Self <: SchemaCustomFieldFilter] (val x: Self) extends AnyVal {
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
    def setQueriesVarargs(value: String*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[String]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

