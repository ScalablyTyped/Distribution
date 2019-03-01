package typings
package jsonDashSchemaDashRefDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dereference extends js.Object {
  /**
    * The `dereference` options control how JSON Schema `$Ref` Parser will dereference `$ref` pointers within the JSON schema.
    */
  var dereference: js.UndefOr[Anon_Circular] = js.undefined
  /**
    * The `parse` options determine how different types of files will be parsed.
    *
    * JSON Schema `$Ref` Parser comes with built-in JSON, YAML, plain-text, and binary parsers, any of which you can configure or disable. You can also add your own custom parsers if you want.
    */
  var parse: js.UndefOr[Anon_Json] = js.undefined
  /**
    * The `resolve` options control how JSON Schema $Ref Parser will resolve file paths and URLs, and how those files will be read/downloaded.
    *
    * JSON Schema `$Ref` Parser comes with built-in support for HTTP and HTTPS, as well as support for local files (when running in Node.js). You can configure or disable either of these built-in resolvers. You can also add your own custom resolvers if you want.
    */
  var resolve: js.UndefOr[Anon_External] = js.undefined
}

object Anon_Dereference {
  @scala.inline
  def apply(dereference: Anon_Circular = null, parse: Anon_Json = null, resolve: Anon_External = null): Anon_Dereference = {
    val __obj = js.Dynamic.literal()
    if (dereference != null) __obj.updateDynamic("dereference")(dereference)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Anon_Dereference]
  }
}

