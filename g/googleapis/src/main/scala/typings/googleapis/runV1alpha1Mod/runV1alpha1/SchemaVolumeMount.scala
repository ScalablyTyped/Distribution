package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
@js.native
trait SchemaVolumeMount extends js.Object {
  /**
    * Path within the container at which the volume should be mounted.  Must
    * not contain &#39;:&#39;.
    */
  var mountPath: js.UndefOr[String] = js.native
  /**
    * mountPropagation determines how mounts are propagated from the host to
    * container and the other way around. When not set,
    * MountPropagationHostToContainer is used. This field is beta in 1.10.
    * +optional
    */
  var mountPropagation: js.UndefOr[String] = js.native
  /**
    * This must match the Name of a Volume.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified).
    * Defaults to false. +optional
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Path within the volume from which the container&#39;s volume should be
    * mounted. Defaults to &quot;&quot; (volume&#39;s root). +optional
    */
  var subPath: js.UndefOr[String] = js.native
}

object SchemaVolumeMount {
  @scala.inline
  def apply(
    mountPath: String = null,
    mountPropagation: String = null,
    name: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    subPath: String = null
  ): SchemaVolumeMount = {
    val __obj = js.Dynamic.literal()
    if (mountPath != null) __obj.updateDynamic("mountPath")(mountPath.asInstanceOf[js.Any])
    if (mountPropagation != null) __obj.updateDynamic("mountPropagation")(mountPropagation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (subPath != null) __obj.updateDynamic("subPath")(subPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolumeMount]
  }
}

