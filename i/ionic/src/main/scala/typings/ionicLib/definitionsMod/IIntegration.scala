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
  def add(): stdLib.Promise[scala.Unit] = js.native
  def add(opts: IIntegrationAddOptions): stdLib.Promise[scala.Unit] = js.native
  def disable(): stdLib.Promise[scala.Unit] = js.native
  def enable(): stdLib.Promise[scala.Unit] = js.native
  def getInfo(): stdLib.Promise[js.Array[InfoItem]] = js.native
  def personalize(details: ProjectPersonalizationDetails): stdLib.Promise[scala.Unit] = js.native
}

