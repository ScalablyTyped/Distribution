package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the smallest syntactic building block of the text.
  */
@js.native
trait SchemaToken extends js.Object {
  /**
    * Dependency tree parse for this token.
    */
  var dependencyEdge: js.UndefOr[SchemaDependencyEdge] = js.native
  /**
    * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the
    * token.
    */
  var lemma: js.UndefOr[String] = js.native
  /**
    * Parts of speech tag for this token.
    */
  var partOfSpeech: js.UndefOr[SchemaPartOfSpeech] = js.native
  /**
    * The token text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
}

object SchemaToken {
  @scala.inline
  def apply(
    dependencyEdge: SchemaDependencyEdge = null,
    lemma: String = null,
    partOfSpeech: SchemaPartOfSpeech = null,
    text: SchemaTextSpan = null
  ): SchemaToken = {
    val __obj = js.Dynamic.literal()
    if (dependencyEdge != null) __obj.updateDynamic("dependencyEdge")(dependencyEdge.asInstanceOf[js.Any])
    if (lemma != null) __obj.updateDynamic("lemma")(lemma.asInstanceOf[js.Any])
    if (partOfSpeech != null) __obj.updateDynamic("partOfSpeech")(partOfSpeech.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaToken]
  }
}

