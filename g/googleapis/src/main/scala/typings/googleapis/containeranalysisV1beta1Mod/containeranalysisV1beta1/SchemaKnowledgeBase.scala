package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaKnowledgeBase extends js.Object {
  /**
    * The KB name (generally of the form KB[0-9]+ i.e. KB123456).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A link to the KB in the Windows update catalog -
    * https://www.catalog.update.microsoft.com/
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaKnowledgeBase {
  @scala.inline
  def apply(name: String = null, url: String = null): SchemaKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaKnowledgeBase]
  }
}

