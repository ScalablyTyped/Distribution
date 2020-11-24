package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPackagesResponse extends js.Object {
  
  /** The token to retrieve the next page of packages, or empty if there are no more packages to return. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The packages returned. */
  var packages: js.UndefOr[js.Array[Package]] = js.native
}
object ListPackagesResponse {
  
  @scala.inline
  def apply(): ListPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesResponse]
  }
  
  @scala.inline
  implicit class ListPackagesResponseOps[Self <: ListPackagesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = this.set("packages", js.Array(value :_*))
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = this.set("packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
  }
}
