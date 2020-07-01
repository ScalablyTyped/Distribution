package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents dependency parse tree information for a token. (For more
  * information on dependency labels, see
  * http://www.aclweb.org/anthology/P13-2017
  */
@js.native
trait SchemaDependencyEdge extends js.Object {
  /**
    * Represents the head of this token in the dependency tree. This is the
    * index of the token which has an arc going to this token. The index is the
    * position of the token in the array of tokens returned by the API method.
    * If this token is a root token, then the `head_token_index` is its own
    * index.
    */
  var headTokenIndex: js.UndefOr[Double] = js.native
  /**
    * The parse label for the token.
    */
  var label: js.UndefOr[String] = js.native
}

object SchemaDependencyEdge {
  @scala.inline
  def apply(headTokenIndex: js.UndefOr[Double] = js.undefined, label: String = null): SchemaDependencyEdge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headTokenIndex)) __obj.updateDynamic("headTokenIndex")(headTokenIndex.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDependencyEdge]
  }
}

