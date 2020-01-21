package typings.httpStatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpStatusIis extends js.Object {
  val `440`: String
  val `440_CLASS`: String
  val `440_MESSAGE`: String
  val `440_NAME`: String
  val `449`: String
  val `449_CLASS`: String
  val `449_MESSAGE`: String
  val `449_NAME`: String
  val `451`: String
  val `451_CLASS`: String
  val `451_MESSAGE`: String
  val `451_NAME`: String
  val LOGIN_TIME_OUT: Double
  val REDIRECT: Double
  val RETRY_WITH: Double
}

object HttpStatusIis {
  @scala.inline
  def apply(
    `440`: String,
    `440_CLASS`: String,
    `440_MESSAGE`: String,
    `440_NAME`: String,
    `449`: String,
    `449_CLASS`: String,
    `449_MESSAGE`: String,
    `449_NAME`: String,
    `451`: String,
    `451_CLASS`: String,
    `451_MESSAGE`: String,
    `451_NAME`: String,
    LOGIN_TIME_OUT: Double,
    REDIRECT: Double,
    RETRY_WITH: Double
  ): HttpStatusIis = {
    val __obj = js.Dynamic.literal(LOGIN_TIME_OUT = LOGIN_TIME_OUT.asInstanceOf[js.Any], REDIRECT = REDIRECT.asInstanceOf[js.Any], RETRY_WITH = RETRY_WITH.asInstanceOf[js.Any])
    __obj.updateDynamic("440")(`440`.asInstanceOf[js.Any])
    __obj.updateDynamic("440_CLASS")(`440_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("440_MESSAGE")(`440_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("440_NAME")(`440_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("449")(`449`.asInstanceOf[js.Any])
    __obj.updateDynamic("449_CLASS")(`449_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("449_MESSAGE")(`449_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("449_NAME")(`449_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("451")(`451`.asInstanceOf[js.Any])
    __obj.updateDynamic("451_CLASS")(`451_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("451_MESSAGE")(`451_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("451_NAME")(`451_NAME`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusIis]
  }
}

