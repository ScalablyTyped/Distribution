package typings.googleapis.v5Mod.pagespeedonlineV5

import typings.googleapis.AnonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLighthouseCategoryV5 extends js.Object {
  /**
    * An array of references to all the audit members of this category.
    */
  var auditRefs: js.UndefOr[js.Array[AnonGroup]] = js.native
  /**
    * A more detailed description of the category and its importance.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The string identifier of the category.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A description for the manual audits in the category.
    */
  var manualDescription: js.UndefOr[String] = js.native
  var score: js.UndefOr[js.Any] = js.native
  /**
    * The human-friendly name of the category.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaLighthouseCategoryV5 {
  @scala.inline
  def apply(
    auditRefs: js.Array[AnonGroup] = null,
    description: String = null,
    id: String = null,
    manualDescription: String = null,
    score: js.Any = null,
    title: String = null
  ): SchemaLighthouseCategoryV5 = {
    val __obj = js.Dynamic.literal()
    if (auditRefs != null) __obj.updateDynamic("auditRefs")(auditRefs.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (manualDescription != null) __obj.updateDynamic("manualDescription")(manualDescription.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLighthouseCategoryV5]
  }
}

