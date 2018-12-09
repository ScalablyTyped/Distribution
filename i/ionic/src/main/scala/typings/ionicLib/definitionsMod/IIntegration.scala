package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIntegration extends js.Object {
  val archiveUrl: js.UndefOr[java.lang.String] = js.native
  val name: IntegrationName = js.native
  val summary: java.lang.String = js.native
  def add(details: IntegrationAddDetails): js.Promise[scala.Unit] = js.native
  def add(details: IntegrationAddDetails, handlers: IntegrationAddHandlers): js.Promise[scala.Unit] = js.native
  def disable(): js.Promise[scala.Unit] = js.native
  def enable(): js.Promise[scala.Unit] = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  def personalize(details: ProjectPersonalizationDetails): js.Promise[scala.Unit] = js.native
}

