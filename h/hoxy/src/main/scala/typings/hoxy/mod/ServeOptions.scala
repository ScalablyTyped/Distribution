package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeOptions extends js.Object {
  /**
    * Which local directory to serve out of. Defaults to filesystem root "/"
    */
  var docroot: js.UndefOr[String] = js.undefined
  /**
    * Which file to serve. Defaults to the request URL. Normally this would
    * be used in mutual exclusion with docroot. Strictly speaking, path is
    * always rooted to docroot, which defaults to "/"
    */
  var path: js.UndefOr[String] = js.undefined
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
  var strategy: js.UndefOr[ServeStrategy] = js.undefined
}

object ServeOptions {
  @scala.inline
  def apply(docroot: String = null, path: String = null, strategy: ServeStrategy = null): ServeOptions = {
    val __obj = js.Dynamic.literal()
    if (docroot != null) __obj.updateDynamic("docroot")(docroot.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeOptions]
  }
}

