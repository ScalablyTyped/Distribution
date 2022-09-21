package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy extends StObject {
  
  /**
    * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is allowed. One can allow all repositories under a project or one specific repository only. E.g. container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io/project-bar/repo-baz", ] \} will allow any repositories under "gcr.io/project-foo" plus the repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is allowed.
    */
  var containerImageSources: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerAddCapabilities can be used or what capabilities are allowed.
    */
  var dockerAddCapabilities: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerChrootPath can be used.
    */
  var dockerChrootPath: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off` value only via `allowed_values`.
    */
  var dockerNetwork: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerPrivileged can be used.
    */
  var dockerPrivileged: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerRunAsRoot can be used.
    */
  var dockerRunAsRoot: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation takes precedence, and if set, docker_runtime values may be rejected if they are incompatible with the selected isolation.
    */
  var dockerRuntime: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * Whether dockerSiblingContainers can be used.
    */
  var dockerSiblingContainers: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature] = js.undefined
  
  /**
    * linux_isolation allows overriding the docker runtime used for containers started on Linux.
    */
  var linuxIsolation: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy](x: Self) {
    
    inline def setContainerImageSources(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "containerImageSources", value.asInstanceOf[js.Any])
    
    inline def setContainerImageSourcesUndefined: Self = StObject.set(x, "containerImageSources", js.undefined)
    
    inline def setDockerAddCapabilities(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerAddCapabilities", value.asInstanceOf[js.Any])
    
    inline def setDockerAddCapabilitiesUndefined: Self = StObject.set(x, "dockerAddCapabilities", js.undefined)
    
    inline def setDockerChrootPath(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerChrootPath", value.asInstanceOf[js.Any])
    
    inline def setDockerChrootPathUndefined: Self = StObject.set(x, "dockerChrootPath", js.undefined)
    
    inline def setDockerNetwork(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerNetwork", value.asInstanceOf[js.Any])
    
    inline def setDockerNetworkUndefined: Self = StObject.set(x, "dockerNetwork", js.undefined)
    
    inline def setDockerPrivileged(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerPrivileged", value.asInstanceOf[js.Any])
    
    inline def setDockerPrivilegedUndefined: Self = StObject.set(x, "dockerPrivileged", js.undefined)
    
    inline def setDockerRunAsRoot(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerRunAsRoot", value.asInstanceOf[js.Any])
    
    inline def setDockerRunAsRootUndefined: Self = StObject.set(x, "dockerRunAsRoot", js.undefined)
    
    inline def setDockerRuntime(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerRuntime", value.asInstanceOf[js.Any])
    
    inline def setDockerRuntimeUndefined: Self = StObject.set(x, "dockerRuntime", js.undefined)
    
    inline def setDockerSiblingContainers(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeature): Self = StObject.set(x, "dockerSiblingContainers", value.asInstanceOf[js.Any])
    
    inline def setDockerSiblingContainersUndefined: Self = StObject.set(x, "dockerSiblingContainers", js.undefined)
    
    inline def setLinuxIsolation(value: String): Self = StObject.set(x, "linuxIsolation", value.asInstanceOf[js.Any])
    
    inline def setLinuxIsolationNull: Self = StObject.set(x, "linuxIsolation", null)
    
    inline def setLinuxIsolationUndefined: Self = StObject.set(x, "linuxIsolation", js.undefined)
  }
}
