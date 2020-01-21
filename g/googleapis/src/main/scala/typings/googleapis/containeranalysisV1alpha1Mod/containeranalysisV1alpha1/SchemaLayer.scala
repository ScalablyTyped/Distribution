package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Layer holds metadata specific to a layer of a Docker image.
  */
@js.native
trait SchemaLayer extends js.Object {
  /**
    * The recovered arguments to the Dockerfile directive.
    */
  var arguments: js.UndefOr[String] = js.native
  /**
    * The recovered Dockerfile directive used to construct this layer.
    */
  var directive: js.UndefOr[String] = js.native
}

object SchemaLayer {
  @scala.inline
  def apply(arguments: String = null, directive: String = null): SchemaLayer = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (directive != null) __obj.updateDynamic("directive")(directive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLayer]
  }
}

