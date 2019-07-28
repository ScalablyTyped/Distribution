package typings.jsDashSearch.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "StemmingTokenizer")
@js.native
class StemmingTokenizer protected () extends ITokenizer {
  def this(stemmingFunction: StemmingFunction, decoratedTokenizer: ITokenizer) = this()
  /* CompleteClass */
  override def tokenize(text: String): js.Array[String] = js.native
}

