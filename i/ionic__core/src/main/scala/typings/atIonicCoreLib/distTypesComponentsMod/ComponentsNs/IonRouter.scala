package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouter extends js.Object {
  /**
    * By default `ion-router` will match the routes at the root path ("/"). That can be changed when
    */
  var root: java.lang.String = js.native
  /**
    * The router can work in two "modes": - With hash: `/index.html#/path/to/page` - Without hash: `/path/to/page`  Using one or another might depend in the requirements of your app and/or where it's deployed.  Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might requires additional server-side configuration in order to properly work.  On the otherside hash-navigation is much easier to deploy, it even works over the file protocol.  By default, this property is `true`, change to `false` to allow hash-less URLs.
    */
  var useHash: scala.Boolean = js.native
  /**
    * Go back to previous page in the window.history.
    */
  def back(): js.Promise[scala.Unit] = js.native
  def navChanged(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def printDebug(): js.Promise[scala.Unit] = js.native
  /**
    * Navigate to the specified URL.
    * @param url The url to navigate to.
    * @param direction The direction of the animation. Defaults to `"forward"`.
    */
  def push(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def push(
    url: java.lang.String,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[scala.Boolean] = js.native
}

