package typings.graphqlToolsMerge.anon

import typings.graphqlToolsMerge.graphqlToolsMergeBooleans.`true`
import typings.graphqlToolsMerge.mergeTypedefsMod.CompareFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@graphql-tools/merge.@graphql-tools/merge/typedefs-mergers/merge-typedefs.Config> & {  commentDescriptions :true} */
@js.native
trait PartialConfigcommentDescr extends js.Object {
  var commentDescriptions: js.UndefOr[Boolean] with `true` = js.native
  var convertExtensions: js.UndefOr[Boolean] = js.native
  var exclusions: js.UndefOr[js.Array[String]] = js.native
  var forceSchemaDefinition: js.UndefOr[Boolean] = js.native
  var reverseDirectives: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[Boolean | CompareFn[String]] = js.native
  var throwOnConflict: js.UndefOr[Boolean] = js.native
  var useSchemaDefinition: js.UndefOr[Boolean] = js.native
}

object PartialConfigcommentDescr {
  @scala.inline
  def apply(commentDescriptions: js.UndefOr[Boolean] with `true`): PartialConfigcommentDescr = {
    val __obj = js.Dynamic.literal(commentDescriptions = commentDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfigcommentDescr]
  }
  @scala.inline
  implicit class PartialConfigcommentDescrOps[Self <: PartialConfigcommentDescr] (val x: Self) extends AnyVal {
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
    def setCommentDescriptions(value: js.UndefOr[Boolean] with `true`): Self = this.set("commentDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setConvertExtensions(value: Boolean): Self = this.set("convertExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertExtensions: Self = this.set("convertExtensions", js.undefined)
    @scala.inline
    def setExclusionsVarargs(value: String*): Self = this.set("exclusions", js.Array(value :_*))
    @scala.inline
    def setExclusions(value: js.Array[String]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    @scala.inline
    def setForceSchemaDefinition(value: Boolean): Self = this.set("forceSchemaDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSchemaDefinition: Self = this.set("forceSchemaDefinition", js.undefined)
    @scala.inline
    def setReverseDirectives(value: Boolean): Self = this.set("reverseDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseDirectives: Self = this.set("reverseDirectives", js.undefined)
    @scala.inline
    def setSortFunction2(value: (String, String) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def setSort(value: Boolean | CompareFn[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setThrowOnConflict(value: Boolean): Self = this.set("throwOnConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnConflict: Self = this.set("throwOnConflict", js.undefined)
    @scala.inline
    def setUseSchemaDefinition(value: Boolean): Self = this.set("useSchemaDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSchemaDefinition: Self = this.set("useSchemaDefinition", js.undefined)
  }
  
}

