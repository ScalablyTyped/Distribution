package typings.jsonSchemaMergeAllof.mod

import typings.jsonSchemaMergeAllof.anon.DefaultResolver
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var ignoreAdditionalProperties: js.UndefOr[Boolean] = js.native
  
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
  var resolvers: js.UndefOr[Partial[Resolvers[Schema]] with DefaultResolver[Schema]] = js.native
}
object Options_ {
  
  @scala.inline
  def apply[Schema /* <: JSONSchema */](): Options_[Schema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_[Schema]]
  }
  
  @scala.inline
  implicit class Options_Ops[Self <: Options_[_], Schema /* <: JSONSchema */] (val x: Self with Options_[Schema]) extends AnyVal {
    
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
    def setIgnoreAdditionalProperties(value: Boolean): Self = this.set("ignoreAdditionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAdditionalProperties: Self = this.set("ignoreAdditionalProperties", js.undefined)
    
    @scala.inline
    def setResolvers(value: Partial[Resolvers[Schema]] with DefaultResolver[Schema]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
  }
}
