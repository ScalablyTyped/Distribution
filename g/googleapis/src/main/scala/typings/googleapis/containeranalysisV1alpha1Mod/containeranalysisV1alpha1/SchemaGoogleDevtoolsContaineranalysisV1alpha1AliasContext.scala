package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alias to a repo revision.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext extends js.Object {
  /**
    * The alias kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext {
  @scala.inline
  def apply(kind: String = null, name: String = null): SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext]
  }
}

