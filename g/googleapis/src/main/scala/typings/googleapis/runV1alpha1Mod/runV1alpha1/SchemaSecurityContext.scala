package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecurityContext holds security configuration that will be applied to a
  * container. Some fields are present in both SecurityContext and
  * PodSecurityContext.  When both are set, the values in SecurityContext take
  * precedence.
  */
@js.native
trait SchemaSecurityContext extends js.Object {
  /**
    * AllowPrivilegeEscalation controls whether a process can gain more
    * privileges than its parent process. This bool directly controls if the
    * no_new_privs flag will be set on the container process.
    * AllowPrivilegeEscalation is true always when the container is: 1) run as
    * Privileged 2) has CAP_SYS_ADMIN +optional
    */
  var allowPrivilegeEscalation: js.UndefOr[Boolean] = js.native
  /**
    * The capabilities to add/drop when running containers. Defaults to the
    * default set of capabilities granted by the container runtime. +optional
    */
  var capabilities: js.UndefOr[SchemaCapabilities] = js.native
  /**
    * Run container in privileged mode. Processes in privileged containers are
    * essentially equivalent to root on the host. Defaults to false. +optional
    */
  var privileged: js.UndefOr[Boolean] = js.native
  /**
    * Whether this container has a read-only root filesystem. Default is false.
    * +optional
    */
  var readOnlyRootFilesystem: js.UndefOr[Boolean] = js.native
  /**
    * The GID to run the entrypoint of the container process. Uses runtime
    * default if unset. May also be set in PodSecurityContext.  If set in both
    * SecurityContext and PodSecurityContext, the value specified in
    * SecurityContext takes precedence. +optional
    */
  var runAsGroup: js.UndefOr[String] = js.native
  /**
    * Indicates that the container must run as a non-root user. If true, the
    * Kubelet will validate the image at runtime to ensure that it does not run
    * as UID 0 (root) and fail to start the container if it does. If unset or
    * false, no such validation will be performed. May also be set in
    * PodSecurityContext.  If set in both SecurityContext and
    * PodSecurityContext, the value specified in SecurityContext takes
    * precedence. +optional
    */
  var runAsNonRoot: js.UndefOr[Boolean] = js.native
  /**
    * The UID to run the entrypoint of the container process. Defaults to user
    * specified in image metadata if unspecified. May also be set in
    * PodSecurityContext.  If set in both SecurityContext and
    * PodSecurityContext, the value specified in SecurityContext takes
    * precedence. +optional
    */
  var runAsUser: js.UndefOr[String] = js.native
  /**
    * The SELinux context to be applied to the container. If unspecified, the
    * container runtime will allocate a random SELinux context for each
    * container.  May also be set in PodSecurityContext.  If set in both
    * SecurityContext and PodSecurityContext, the value specified in
    * SecurityContext takes precedence. +optional
    */
  var seLinuxOptions: js.UndefOr[SchemaSELinuxOptions] = js.native
}

object SchemaSecurityContext {
  @scala.inline
  def apply(
    allowPrivilegeEscalation: js.UndefOr[Boolean] = js.undefined,
    capabilities: SchemaCapabilities = null,
    privileged: js.UndefOr[Boolean] = js.undefined,
    readOnlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
    runAsGroup: String = null,
    runAsNonRoot: js.UndefOr[Boolean] = js.undefined,
    runAsUser: String = null,
    seLinuxOptions: SchemaSELinuxOptions = null
  ): SchemaSecurityContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrivilegeEscalation)) __obj.updateDynamic("allowPrivilegeEscalation")(allowPrivilegeEscalation.get.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyRootFilesystem)) __obj.updateDynamic("readOnlyRootFilesystem")(readOnlyRootFilesystem.get.asInstanceOf[js.Any])
    if (runAsGroup != null) __obj.updateDynamic("runAsGroup")(runAsGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(runAsNonRoot)) __obj.updateDynamic("runAsNonRoot")(runAsNonRoot.get.asInstanceOf[js.Any])
    if (runAsUser != null) __obj.updateDynamic("runAsUser")(runAsUser.asInstanceOf[js.Any])
    if (seLinuxOptions != null) __obj.updateDynamic("seLinuxOptions")(seLinuxOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityContext]
  }
}

