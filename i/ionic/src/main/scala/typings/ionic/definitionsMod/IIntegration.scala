package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIntegration[T /* <: ProjectIntegration */] extends js.Object {
  val archiveUrl: js.UndefOr[String] = js.native
  val config: BaseConfig[T] = js.native
  val name: IntegrationName = js.native
  val summary: String = js.native
  def add(details: IntegrationAddDetails): js.Promise[Unit] = js.native
  def disable(): js.Promise[Unit] = js.native
  def enable(): js.Promise[Unit] = js.native
  def enable(config: T): js.Promise[Unit] = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  def isAdded(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def personalize(details: ProjectPersonalizationDetails): js.Promise[Unit] = js.native
}

