package typings.jsonSchemaMergeAllof.mod

import typings.jsonSchemaMergeAllof.anon.DefaultResolver
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options_[Schema /* <: JSONSchema */] extends js.Object {
  /**
    * **ignoreAdditionalProperties** default **false**
    *
    * Allows you to combine schema properties even though some schemas have
    * `additionalProperties: false` This is the most common issue people
    * face when trying to expand schemas using allOf and a limitation of
    * the json schema spec. Be aware though that the schema produced will
    * allow more than the original schema. But this is useful if just want
    * to combine schemas using allOf as if additionalProperties wasn't
    * false during the merge process. The resulting schema will still get
    * additionalProperties set to false.
    */
  var ignoreAdditionalProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * **resolvers** Object
    *
    * Override any default resolver like this:
    *
    * ```js
    * mergeAllOf(schema, {
    *   resolvers: {
    *     title: function(values, path, mergeSchemas, options) {
    *       // choose what title you want to be used based on the conflicting values
    *       // resolvers MUST return a value other than undefined
    *     }
    *   }
    * })
    * ```
    *
    * The function is passed:
    *
    * - **values** an array of the conflicting values that need to be
    *   resolved
    * - **path** an array of strings containing the path to the position in
    *   the schema that caused the resolver to be called (useful if you use
    *   the same resolver for multiple keywords, or want to implement
    *   specific logic for custom paths)
    * - **mergeSchemas** a function you can call that merges an array of
    *   schemas
    * - **options** the options mergeAllOf was called with
    */
  var resolvers: js.UndefOr[Partial[Resolvers[Schema]] with DefaultResolver[Schema]] = js.undefined
}

object Options_ {
  @scala.inline
  def apply[Schema](
    ignoreAdditionalProperties: js.UndefOr[Boolean] = js.undefined,
    resolvers: Partial[Resolvers[Schema]] with DefaultResolver[Schema] = null
  ): Options_[Schema] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreAdditionalProperties)) __obj.updateDynamic("ignoreAdditionalProperties")(ignoreAdditionalProperties.get.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_[Schema]]
  }
}

