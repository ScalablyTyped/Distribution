package typings.jsDashYaml.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /** string to be used as a file path in error/warning messages. */
  var filename: js.UndefOr[String] = js.undefined
  /** compatibility with JSON.parse behaviour. */
  var json: js.UndefOr[Boolean] = js.undefined
  /** function to call on warning messages. */
  var onWarning: js.UndefOr[js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit]] = js.undefined
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    filename: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    onWarning: js.ThisFunction1[/* this */ Null, /* e */ YAMLException, Unit] = null,
    schema: SchemaDefinition = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (onWarning != null) __obj.updateDynamic("onWarning")(onWarning.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
}

