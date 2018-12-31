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

