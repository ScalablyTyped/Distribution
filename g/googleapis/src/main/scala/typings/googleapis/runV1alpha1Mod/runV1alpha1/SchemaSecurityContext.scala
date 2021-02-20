package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecurityContext holds security configuration that will be applied to a
  * container. Some fields are present in both SecurityContext and
  * PodSecurityContext.  When both are set, the values in SecurityContext take
  * precedence.
  */
@js.native
trait SchemaSecurityContext extends StObject {
  
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
  def apply(): SchemaSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityContext]
  }
  
  @scala.inline
  implicit class SchemaSecurityContextMutableBuilder[Self <: SchemaSecurityContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPrivilegeEscalation(value: Boolean): Self = StObject.set(x, "allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPrivilegeEscalationUndefined: Self = StObject.set(x, "allowPrivilegeEscalation", js.undefined)
    
    @scala.inline
    def setCapabilities(value: SchemaCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    @scala.inline
    def setReadOnlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyRootFilesystemUndefined: Self = StObject.set(x, "readOnlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setRunAsGroup(value: String): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsGroupUndefined: Self = StObject.set(x, "runAsGroup", js.undefined)
    
    @scala.inline
    def setRunAsNonRoot(value: Boolean): Self = StObject.set(x, "runAsNonRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsNonRootUndefined: Self = StObject.set(x, "runAsNonRoot", js.undefined)
    
    @scala.inline
    def setRunAsUser(value: String): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUserUndefined: Self = StObject.set(x, "runAsUser", js.undefined)
    
    @scala.inline
    def setSeLinuxOptions(value: SchemaSELinuxOptions): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinuxOptionsUndefined: Self = StObject.set(x, "seLinuxOptions", js.undefined)
  }
}
