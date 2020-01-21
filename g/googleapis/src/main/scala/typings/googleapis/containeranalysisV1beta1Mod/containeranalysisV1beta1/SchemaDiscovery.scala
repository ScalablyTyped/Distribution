package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A note that indicates a type of analysis a provider would perform. This
  * note exists in a provider&#39;s project. A `Discovery` occurrence is
  * created in a consumer&#39;s project at the start of analysis.
  */
@js.native
trait SchemaDiscovery extends js.Object {
  /**
    * Required. Immutable. The kind of analysis that is handled by this
    * discovery.
    */
  var analysisKind: js.UndefOr[String] = js.native
}

object SchemaDiscovery {
  @scala.inline
  def apply(analysisKind: String = null): SchemaDiscovery = {
    val __obj = js.Dynamic.literal()
    if (analysisKind != null) __obj.updateDynamic("analysisKind")(analysisKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiscovery]
  }
}

