package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltImage extends js.Object {
  
  /** Docker Registry 2.0 digest. */
  var digest: js.UndefOr[String] = js.native
  
  /** Name used to push the container image to Google Container Registry, as presented to `docker push`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Stores timing information for pushing the specified image. */
  var pushTiming: js.UndefOr[TimeSpan] = js.native
}
object BuiltImage {
  
  @scala.inline
  def apply(): BuiltImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltImage]
  }
  
  @scala.inline
  implicit class BuiltImageOps[Self <: BuiltImage] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPushTiming(value: TimeSpan): Self = this.set("pushTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushTiming: Self = this.set("pushTiming", js.undefined)
  }
}
