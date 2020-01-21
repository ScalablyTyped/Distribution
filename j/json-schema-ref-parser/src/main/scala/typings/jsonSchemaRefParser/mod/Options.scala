package typings.jsonSchemaRefParser.mod

import typings.jsonSchemaRefParser.AnonCircular
import typings.jsonSchemaRefParser.AnonExternal
import typings.jsonSchemaRefParser.AnonJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The `dereference` options control how JSON Schema `$Ref` Parser will dereference `$ref` pointers within the JSON schema.
    */
  var dereference: js.UndefOr[AnonCircular] = js.undefined
  /**
    * The `parse` options determine how different types of files will be parsed.
    *
    * JSON Schema `$Ref` Parser comes with built-in JSON, YAML, plain-text, and binary parsers, any of which you can configure or disable. You can also add your own custom parsers if you want.
    */
  var parse: js.UndefOr[AnonJson] = js.undefined
  /**
    * The `resolve` options control how JSON Schema $Ref Parser will resolve file paths and URLs, and how those files will be read/downloaded.
    *
    * JSON Schema `$Ref` Parser comes with built-in support for HTTP and HTTPS, as well as support for local files (when running in Node.js). You can configure or disable either of these built-in resolvers. You can also add your own custom resolvers if you want.
    */
  var resolve: js.UndefOr[AnonExternal] = js.undefined
}

object Options {
  @scala.inline
  def apply(dereference: AnonCircular = null, parse: AnonJson = null, resolve: AnonExternal = null): Options = {
    val __obj = js.Dynamic.literal()
    if (dereference != null) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

