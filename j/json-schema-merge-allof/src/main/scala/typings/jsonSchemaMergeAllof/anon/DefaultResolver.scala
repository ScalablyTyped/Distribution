package typings.jsonSchemaMergeAllof.anon

import typings.jsonSchemaMergeAllof.mod.JSONSchema
import typings.jsonSchemaMergeAllof.mod.MergeSchemas
import typings.jsonSchemaMergeAllof.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
}

object DefaultResolver {
  @scala.inline
  def apply[/* <: typings.jsonSchemaMergeAllof.mod.JSONSchema */ Schema](
    defaultResolver: (/* values */ js.Array[_], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => _ = null
  ): DefaultResolver[Schema] = {
    val __obj = js.Dynamic.literal()
    if (defaultResolver != null) __obj.updateDynamic("defaultResolver")(js.Any.fromFunction4(defaultResolver))
    __obj.asInstanceOf[DefaultResolver[Schema]]
  }
}

