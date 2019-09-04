package typings.atJestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildConfigMod {
  import typings.atJestTypes.Anon_All
  import typings.atJestTypes.Anon_Color
  import typings.std.Partial
  import typings.std.Record
  import typings.yargs.yargsMod.Arguments

  type Argv = Arguments[Partial[Anon_All]]
  type ConfigGlobals = Record[String, js.Any]
  type DisplayName = String | Anon_Color
  type Glob = String
  type Path = String
  type ReporterConfig = js.Tuple2[String, Record[String, js.Any]]
  type TransformerConfig = js.Tuple2[String, Record[String, js.Any]]
}
