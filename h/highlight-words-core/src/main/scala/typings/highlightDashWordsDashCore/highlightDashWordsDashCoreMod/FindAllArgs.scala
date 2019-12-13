package typings.highlightDashWordsDashCore.highlightDashWordsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAllArgs extends FindChunksArgs {
  var findChunks: js.UndefOr[js.Function1[/* args */ FindChunksArgs, js.Array[Chunk]]] = js.undefined
}

object FindAllArgs {
  @scala.inline
  def apply(
    searchWords: js.Array[String],
    textToHighlight: String,
    autoEscape: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    findChunks: /* args */ FindChunksArgs => js.Array[Chunk] = null,
    sanitize: /* text */ String => String = null
  ): FindAllArgs = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEscape)) __obj.updateDynamic("autoEscape")(autoEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (findChunks != null) __obj.updateDynamic("findChunks")(js.Any.fromFunction1(findChunks))
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[FindAllArgs]
  }
}

