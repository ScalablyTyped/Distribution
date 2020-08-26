package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of suggest API.
  */
@js.native
trait SchemaSuggestRequest extends js.Object {
  /**
    * The sources to use for suggestions. If not specified, all data sources
    * from the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  /**
    * Partial query for the completion suggestion.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.native
}

object SchemaSuggestRequest {
  @scala.inline
  def apply(): SchemaSuggestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestRequest]
  }
  @scala.inline
  implicit class SchemaSuggestRequestOps[Self <: SchemaSuggestRequest] (val x: Self) extends AnyVal {
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
    def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = this.set("dataSourceRestrictions", js.Array(value :_*))
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = this.set("dataSourceRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceRestrictions: Self = this.set("dataSourceRestrictions", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRequestOptions(value: SchemaRequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
  }
  
}

