package typings.graphqlCompose.resolverMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverSortArgConfig[TSource, TContext, TArgs] extends js.Object {
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var name: String = js.native
  var sortTypeNameFallback: js.UndefOr[String] = js.native
  var value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_] = js.native
}

object ResolverSortArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    name: String,
    value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_]
  ): ResolverSortArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverSortArgConfig[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class ResolverSortArgConfigOps[Self <: ResolverSortArgConfig[_, _, _], TSource, TContext, TArgs] (val x: Self with (ResolverSortArgConfig[TSource, TContext, TArgs])) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValueFunction1(value: /* resolveParams */ ResolveParams[TSource, TContext, TArgs] => js.Any): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(
      value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_]
    ): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDeprecationReasonNull: Self = this.set("deprecationReason", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setSortTypeNameFallback(value: String): Self = this.set("sortTypeNameFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortTypeNameFallback: Self = this.set("sortTypeNameFallback", js.undefined)
  }
  
}

