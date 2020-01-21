package typings.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.marked.mod.MarkedOptions
import typings.marked.mod.Parser_
import typings.marked.mod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassParser
  extends Instantiable0[Parser_]
     with Instantiable1[/* options */ MarkedOptions, Parser_] {
  def parse(src: TokensList): String = js.native
  def parse(src: TokensList, options: MarkedOptions): String = js.native
}

