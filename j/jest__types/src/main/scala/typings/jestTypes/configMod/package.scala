package typings.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  type ConfigGlobals = typings.std.Record[java.lang.String, js.Any]
  type DisplayName = java.lang.String | typings.jestTypes.AnonColor
  type Glob = java.lang.String
  type Path = java.lang.String
  type ReporterConfig = js.Tuple2[java.lang.String, typings.std.Record[java.lang.String, js.Any]]
  type TransformerConfig = js.Tuple2[java.lang.String, typings.std.Record[java.lang.String, js.Any]]
}
