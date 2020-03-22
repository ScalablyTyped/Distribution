package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  encrypt ? :boolean,   instanceName ? :string,   useUTC ? :boolean,   tdsVersion ? :string,   appName ? :string,   abortTransactionOnError ? :boolean,   trustedConnection ? :boolean,   enableArithAbort ? :boolean}> */
trait Readonlyencryptbooleanins extends js.Object {
  val abortTransactionOnError: js.UndefOr[Boolean] = js.undefined
  val appName: js.UndefOr[String] = js.undefined
  val enableArithAbort: js.UndefOr[Boolean] = js.undefined
  val encrypt: js.UndefOr[Boolean] = js.undefined
  val instanceName: js.UndefOr[String] = js.undefined
  val tdsVersion: js.UndefOr[String] = js.undefined
  val trustedConnection: js.UndefOr[Boolean] = js.undefined
  val useUTC: js.UndefOr[Boolean] = js.undefined
}

object Readonlyencryptbooleanins {
  @scala.inline
  def apply(
    abortTransactionOnError: js.UndefOr[Boolean] = js.undefined,
    appName: String = null,
    enableArithAbort: js.UndefOr[Boolean] = js.undefined,
    encrypt: js.UndefOr[Boolean] = js.undefined,
    instanceName: String = null,
    tdsVersion: String = null,
    trustedConnection: js.UndefOr[Boolean] = js.undefined,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): Readonlyencryptbooleanins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArithAbort)) __obj.updateDynamic("enableArithAbort")(enableArithAbort.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (tdsVersion != null) __obj.updateDynamic("tdsVersion")(tdsVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(trustedConnection)) __obj.updateDynamic("trustedConnection")(trustedConnection.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyencryptbooleanins]
  }
}

