package typings.atJupyterlabCsvviewer

import typings.atJupyterlabCsvviewer.libParseMod.IParserNs.IOptions
import typings.atJupyterlabCsvviewer.libParseMod.IParserNs.IResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libParseMod {
  type IParser = js.Function1[/* options */ IOptions, IResults]
}
