package typings.jsonSchemaMergeAllof.anon

import typings.jsonSchemaMergeAllof.mod.JSONSchema
import typings.jsonSchemaMergeAllof.mod.MergeSchemas
import typings.jsonSchemaMergeAllof.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultResolver[Schema /* <: JSONSchema */] extends js.Object {
  /**
    * ### Default resolver
    * You can set a default resolver that catches any unknown keyword.
    * Let's say you want to use the same strategy as the ones for the
    * meta keywords, to use the first value found. You can accomplish
    * that like this:
    *
    * ```js
    * mergeJsonSchema({
    *   ...
    * }, {
    *   resolvers: {
    *       defaultResolver: mergeJsonSchema.options.resolvers.title
    *   }
    * })
    * ```
    */
  var defaultResolver: js.UndefOr[
    js.Function4[
      /* values */ js.Array[_], 
      /* path */ js.Array[String], 
      /* mergeSchemas */ MergeSchemas, 
      /* options */ Options_[Schema], 
      _
    ]
  ] = js.native
}

object DefaultResolver {
  @scala.inline
  def apply[/* <: typings.jsonSchemaMergeAllof.mod.JSONSchema */ Schema](): DefaultResolver[Schema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultResolver[Schema]]
  }
  @scala.inline
  implicit class DefaultResolverOps[Self <: DefaultResolver[_], /* <: typings.jsonSchemaMergeAllof.mod.JSONSchema */ Schema] (val x: Self with DefaultResolver[Schema]) extends AnyVal {
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
    def setDefaultResolver(
      value: (/* values */ js.Array[_], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => _
    ): Self = this.set("defaultResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDefaultResolver: Self = this.set("defaultResolver", js.undefined)
  }
  
}

