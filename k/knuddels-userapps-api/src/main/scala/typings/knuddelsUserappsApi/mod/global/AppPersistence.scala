package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.knuddels.de/docs/classes/AppPersistence.html
  */
@JSGlobal("AppPersistence")
@js.native
class AppPersistence () extends Persistence {
  /**
    * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getDatabaseFileSize
    */
  def getDatabaseFileSize(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/AppPersistence.html#method_getDatabaseFileSizeLimit
    */
  def getDatabaseFileSizeLimit(): Double = js.native
}

