package typings
package jsDashYamlLib.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /** string to be used as a file path in error/warning messages. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** compatibility with JSON.parse behaviour. */
  var json: js.UndefOr[scala.Boolean] = js.undefined
  /** function to call on warning messages. */
  var onWarning: js.UndefOr[js.ThisFunction1[/* this */ scala.Null, /* e */ YAMLException, scala.Unit]] = js.undefined
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    filename: java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    onWarning: js.ThisFunction1[/* this */ scala.Null, /* e */ YAMLException, scala.Unit] = null,
    schema: SchemaDefinition = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (onWarning != null) __obj.updateDynamic("onWarning")(onWarning)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[LoadOptions]
  }
}

