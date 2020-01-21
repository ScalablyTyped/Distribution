package typings.jsonSchemaMergeAllof

import typings.jsonSchemaMergeAllof.mod.JSONSchema
import typings.jsonSchemaMergeAllof.mod.MergeSchemas
import typings.jsonSchemaMergeAllof.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultResolver[Schema /* <: JSONSchema */] extends js.Object {
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

object AnonDefaultResolver {
  @scala.inline
  def apply[Schema /* <: JSONSchema */](
    defaultResolver: (/* values */ js.Array[_], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => _ = null
  ): AnonDefaultResolver[Schema] = {
    val __obj = js.Dynamic.literal()
    if (defaultResolver != null) __obj.updateDynamic("defaultResolver")(js.Any.fromFunction4(defaultResolver))
    __obj.asInstanceOf[AnonDefaultResolver[Schema]]
  }
}

