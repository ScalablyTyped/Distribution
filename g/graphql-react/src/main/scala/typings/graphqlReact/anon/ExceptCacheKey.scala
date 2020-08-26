package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLCacheKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptCacheKey extends js.Object {
  var exceptCacheKey: GraphQLCacheKey = js.native
}

object ExceptCacheKey {
  @scala.inline
  def apply(exceptCacheKey: GraphQLCacheKey): ExceptCacheKey = {
    val __obj = js.Dynamic.literal(exceptCacheKey = exceptCacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptCacheKey]
  }
  @scala.inline
  implicit class ExceptCacheKeyOps[Self <: ExceptCacheKey] (val x: Self) extends AnyVal {
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
    def setExceptCacheKey(value: GraphQLCacheKey): Self = this.set("exceptCacheKey", value.asInstanceOf[js.Any])
  }
  
}

