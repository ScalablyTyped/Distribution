package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends StObject {
  
  /**
    * Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine
    * flexible environment using files or zip.
    */
  var cloudBuildOptions: js.UndefOr[CloudBuildOptions] = js.native
  
  /** The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment. */
  var container: js.UndefOr[ContainerInfo] = js.native
  
  /** Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call. */
  var files: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.appengine.gapi.client.appengine.FileInfo}
    */ typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.Deployment with TopLevel[js.Any]
  ] = js.native
  
  /** The zip file for this deployment, if this is a zip deployment. */
  var zip: js.UndefOr[ZipInfo] = js.native
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudBuildOptions(value: CloudBuildOptions): Self = StObject.set(x, "cloudBuildOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildOptionsUndefined: Self = StObject.set(x, "cloudBuildOptions", js.undefined)
    
    @scala.inline
    def setContainer(value: ContainerInfo): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setFiles(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.appengine.gapi.client.appengine.FileInfo}
      */ typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.Deployment with TopLevel[js.Any]
    ): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setZip(value: ZipInfo): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
