package typings.ionicCore.componentsMod.Components

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouter extends js.Object {
  /**
    * By default `ion-router` will match the routes at the root path ("/"). That can be changed when
    */
  var root: String = js.native
  /**
    * The router can work in two "modes": - With hash: `/index.html#/path/to/page` - Without hash: `/path/to/page`  Using one or another might depend in the requirements of your app and/or where it's deployed.  Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might requires additional server-side configuration in order to properly work.  On the otherside hash-navigation is much easier to deploy, it even works over the file protocol.  By default, this property is `true`, change to `false` to allow hash-less URLs.
    */
  var useHash: Boolean = js.native
  /**
    * Go back to previous page in the window.history.
    */
  def back(): js.Promise[Unit] = js.native
  def canTransition(): js.Promise[String | Boolean] = js.native
  def navChanged(direction: RouterDirection): js.Promise[Boolean] = js.native
  def printDebug(): js.Promise[Unit] = js.native
  /**
    * Navigate to the specified URL.
    * @param url The url to navigate to.
    * @param direction The direction of the animation. Defaults to `"forward"`.
    */
  def push(url: String): js.Promise[Boolean] = js.native
  def push(url: String, direction: js.UndefOr[scala.Nothing], animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def push(url: String, direction: RouterDirection): js.Promise[Boolean] = js.native
  def push(url: String, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
}

