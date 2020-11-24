package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeOptions extends js.Object {
  
  /**
    * Which local directory to serve out of. Defaults to filesystem root "/"
    */
  var docroot: js.UndefOr[String] = js.native
  
  /**
    * Which file to serve. Defaults to the request URL. Normally this would
    * be used in mutual exclusion with docroot. Strictly speaking, path is
    * always rooted to docroot, which defaults to "/"
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Mainly relevant when using the docroot option. Describes the relationship
    * between the local docroot and the remote one. Strictly speaking, this
    * controls what happens when the local docroot is missing a requested file.
    * Accepted values:
    * * replace - (default) Replaces the remote docroot with the local one. In
    * other words, if a requested file doesn't exist locally, it populates the
    * response with a 404, even if it would have been found remotely.
    * * overlay - Overlays the local docroot on top of the remote one. In other
    * words, if a requested file doesn't exist locally, the request will
    * transparently fall through to the remote server.
    * * mirror - Automatically mirror the remote docroot locally. In other words,
    * if a requested file doesn't exist locally, it's copied to the local docroot
    * from the remote one, and will be found locally on subsequent requests.
    */
  var strategy: js.UndefOr[ServeStrategy] = js.native
}
object ServeOptions {
  
  @scala.inline
  def apply(): ServeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeOptions]
  }
  
  @scala.inline
  implicit class ServeOptionsOps[Self <: ServeOptions] (val x: Self) extends AnyVal {
    
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
    def setDocroot(value: String): Self = this.set("docroot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocroot: Self = this.set("docroot", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStrategy(value: ServeStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
