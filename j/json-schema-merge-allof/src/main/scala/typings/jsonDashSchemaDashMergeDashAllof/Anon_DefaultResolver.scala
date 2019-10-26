package typings.jsonDashSchemaDashMergeDashAllof

import typings.jsonDashSchemaDashMergeDashAllof.jsonDashSchemaDashMergeDashAllofMod.JSONSchema
import typings.jsonDashSchemaDashMergeDashAllof.jsonDashSchemaDashMergeDashAllofMod.MergeSchemas
import typings.jsonDashSchemaDashMergeDashAllof.jsonDashSchemaDashMergeDashAllofMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultResolver[Schema /* <: JSONSchema */] extends js.Object {
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
      /* options */ Options[Schema], 
      _
    ]
  ] = js.undefined
}

object Anon_DefaultResolver {
  @scala.inline
  def apply[Schema /* <: JSONSchema */](
    defaultResolver: (/* values */ js.Array[_], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options[Schema]) => _ = null
  ): Anon_DefaultResolver[Schema] = {
    val __obj = js.Dynamic.literal()
    if (defaultResolver != null) __obj.updateDynamic("defaultResolver")(js.Any.fromFunction4(defaultResolver))
    __obj.asInstanceOf[Anon_DefaultResolver[Schema]]
  }
}

