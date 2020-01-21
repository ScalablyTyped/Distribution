package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxOptions are the labels to be applied to the container
  */
@js.native
trait SchemaSELinuxOptions extends js.Object {
  /**
    * Level is SELinux level label that applies to the container. +optional
    */
  var level: js.UndefOr[String] = js.native
  /**
    * Role is a SELinux role label that applies to the container. +optional
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Type is a SELinux type label that applies to the container. +optional
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * User is a SELinux user label that applies to the container. +optional
    */
  var user: js.UndefOr[String] = js.native
}

object SchemaSELinuxOptions {
  @scala.inline
  def apply(level: String = null, role: String = null, `type`: String = null, user: String = null): SchemaSELinuxOptions = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSELinuxOptions]
  }
}

