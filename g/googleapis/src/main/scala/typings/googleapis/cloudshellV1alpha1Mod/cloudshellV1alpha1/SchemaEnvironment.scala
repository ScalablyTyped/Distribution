package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Shell environment, which is defined as the combination of a Docker
  * image specifying what is installed on the environment and a home directory
  * containing the user&#39;s data that will remain across sessions. Each user
  * has a single environment with the ID &quot;default&quot;.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  
  /**
    * Required. Full path to the Docker image used to run this environment,
    * e.g. &quot;gcr.io/dev-con/cloud-devshell:latest&quot;.
    */
  var dockerImage: js.UndefOr[String] = js.native
  
  /**
    * Output only. The environment&#39;s identifier, which is always
    * &quot;default&quot;.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is
    * the email address of the user to whom this environment belongs, and
    * `{environment_id}` is the identifier of this environment. For example,
    * `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. Public keys associated with the environment. Clients can
    * connect to this environment via SSH only if they possess a private key
    * corresponding to at least one of these public keys. Keys can be added to
    * or removed from the environment using the CreatePublicKey and
    * DeletePublicKey methods.
    */
  var publicKeys: js.UndefOr[js.Array[SchemaPublicKey]] = js.native
  
  /**
    * Output only. Host to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshHost: js.UndefOr[String] = js.native
  
  /**
    * Output only. Port to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshPort: js.UndefOr[Double] = js.native
  
  /**
    * Output only. Username that clients should use when initiating SSH
    * sessions with the environment.
    */
  var sshUsername: js.UndefOr[String] = js.native
  
  /**
    * Output only. Current execution state of this environment.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaEnvironment {
  
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDockerImage(value: String): Self = this.set("dockerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerImage: Self = this.set("dockerImage", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: SchemaPublicKey*): Self = this.set("publicKeys", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeys(value: js.Array[SchemaPublicKey]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeys: Self = this.set("publicKeys", js.undefined)
    
    @scala.inline
    def setSshHost(value: String): Self = this.set("sshHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshHost: Self = this.set("sshHost", js.undefined)
    
    @scala.inline
    def setSshPort(value: Double): Self = this.set("sshPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPort: Self = this.set("sshPort", js.undefined)
    
    @scala.inline
    def setSshUsername(value: String): Self = this.set("sshUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshUsername: Self = this.set("sshUsername", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
