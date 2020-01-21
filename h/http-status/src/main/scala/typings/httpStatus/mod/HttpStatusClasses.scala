package typings.httpStatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpStatusClasses extends js.Object {
  val `1xx`: String
  val `1xx_MESSAGE`: String
  val `1xx_NAME`: String
  val `2xx`: String
  val `2xx_MESSAGE`: String
  val `2xx_NAME`: String
  val `3xx`: String
  val `3xx_MESSAGE`: String
  val `3xx_NAME`: String
  val `4xx`: String
  val `4xx_MESSAGE`: String
  val `4xx_NAME`: String
  val `5xx`: String
  val `5xx_MESSAGE`: String
  val `5xx_NAME`: String
  val CLIENT_ERROR: String
  val INFORMATIONAL: String
  val REDIRECTION: String
  val SERVER_ERROR: String
  val SUCCESSFUL: String
}

object HttpStatusClasses {
  @scala.inline
  def apply(
    `1xx`: String,
    `1xx_MESSAGE`: String,
    `1xx_NAME`: String,
    `2xx`: String,
    `2xx_MESSAGE`: String,
    `2xx_NAME`: String,
    `3xx`: String,
    `3xx_MESSAGE`: String,
    `3xx_NAME`: String,
    `4xx`: String,
    `4xx_MESSAGE`: String,
    `4xx_NAME`: String,
    `5xx`: String,
    `5xx_MESSAGE`: String,
    `5xx_NAME`: String,
    CLIENT_ERROR: String,
    INFORMATIONAL: String,
    REDIRECTION: String,
    SERVER_ERROR: String,
    SUCCESSFUL: String
  ): HttpStatusClasses = {
    val __obj = js.Dynamic.literal(CLIENT_ERROR = CLIENT_ERROR.asInstanceOf[js.Any], INFORMATIONAL = INFORMATIONAL.asInstanceOf[js.Any], REDIRECTION = REDIRECTION.asInstanceOf[js.Any], SERVER_ERROR = SERVER_ERROR.asInstanceOf[js.Any], SUCCESSFUL = SUCCESSFUL.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx")(`1xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx_MESSAGE")(`1xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx_NAME")(`1xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx")(`2xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx_MESSAGE")(`2xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx_NAME")(`2xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx")(`3xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx_MESSAGE")(`3xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx_NAME")(`3xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx")(`4xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx_MESSAGE")(`4xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx_NAME")(`4xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx")(`5xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx_MESSAGE")(`5xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx_NAME")(`5xx_NAME`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusClasses]
  }
}

