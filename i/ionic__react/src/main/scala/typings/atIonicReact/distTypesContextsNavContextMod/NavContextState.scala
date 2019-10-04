package typings.atIonicReact.distTypesContextsNavContextMod

import typings.atIonicReact.atIonicReactStrings.none
import typings.std.HTMLElement
import typings.std.History
import typings.std.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavContextState extends js.Object {
  var currentPath: js.UndefOr[String] = js.native
  def getHistory(): History = js.native
  def getLocation(): Location = js.native
  def getPageManager(): js.Any = js.native
  def getStackManager(): js.Any = js.native
  def goBack(): Unit = js.native
  def goBack(defaultHref: String): Unit = js.native
  def hasIonicRouter(): Boolean = js.native
  def navigate(path: String): Unit = js.native
  def navigate(
    path: String,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): Unit = js.native
  @JSName("navigate")
  def navigate_none(path: String, direction: none): Unit = js.native
  def registerIonPage(page: HTMLElement): Unit = js.native
}

