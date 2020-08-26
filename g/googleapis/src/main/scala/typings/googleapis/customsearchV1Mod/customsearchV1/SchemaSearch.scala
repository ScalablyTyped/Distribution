package typings.googleapis.customsearchV1Mod.customsearchV1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.CorrectedQuery
import typings.googleapis.anon.FormattedSearchTime
import typings.googleapis.anon.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSearch extends js.Object {
  var context: js.UndefOr[SchemaContext] = js.native
  var items: js.UndefOr[js.Array[SchemaResult]] = js.native
  var kind: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  var queries: js.UndefOr[StringDictionary[js.Array[SchemaQuery]]] = js.native
  var searchInformation: js.UndefOr[FormattedSearchTime] = js.native
  var spelling: js.UndefOr[CorrectedQuery] = js.native
  var url: js.UndefOr[Template] = js.native
}

object SchemaSearch {
  @scala.inline
  def apply(): SchemaSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearch]
  }
  @scala.inline
  implicit class SchemaSearchOps[Self <: SchemaSearch] (val x: Self) extends AnyVal {
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
    def setContext(value: SchemaContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaResult*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaResult]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: SchemaPromotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[SchemaPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    @scala.inline
    def setQueries(value: StringDictionary[js.Array[SchemaQuery]]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setSearchInformation(value: FormattedSearchTime): Self = this.set("searchInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchInformation: Self = this.set("searchInformation", js.undefined)
    @scala.inline
    def setSpelling(value: CorrectedQuery): Self = this.set("spelling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpelling: Self = this.set("spelling", js.undefined)
    @scala.inline
    def setUrl(value: Template): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

