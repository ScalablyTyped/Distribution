package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates bullets for all of the paragraphs that overlap with the given
  * range.  The nesting level of each paragraph will be determined by counting
  * leading tabs in front of each paragraph. To avoid excess space between the
  * bullet and the corresponding paragraph, these leading tabs are removed by
  * this request. This may change the indices of parts of the text.  If the
  * paragraph immediately before paragraphs being updated is in a list with a
  * matching preset, the paragraphs being updated are added to that preceding
  * list.
  */
@js.native
trait SchemaCreateParagraphBulletsRequest extends js.Object {
  /**
    * The kinds of bullet glyphs to be used.
    */
  var bulletPreset: js.UndefOr[String] = js.native
  /**
    * The range to apply the bullet preset to.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}

object SchemaCreateParagraphBulletsRequest {
  @scala.inline
  def apply(bulletPreset: String = null, range: SchemaRange = null): SchemaCreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (bulletPreset != null) __obj.updateDynamic("bulletPreset")(bulletPreset.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateParagraphBulletsRequest]
  }
}

