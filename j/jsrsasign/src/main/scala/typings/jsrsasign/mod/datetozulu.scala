package typings.jsrsasign.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "datetozulu")
@js.native
object datetozulu extends js.Object {
  /**
    * Date object to zulu time string
    * @param d Date object for specified time
    * @param flagUTCTime if this is true year will be YY otherwise YYYY
    * @param flagMilli if this is true result concludes milliseconds
    * @return GeneralizedTime or UTCTime string (ex. 20170412235959.384Z)
    * @description
    * This function converts from Date object to GeneralizedTime string (i.e. YYYYMMDDHHmmSSZ) or
    * UTCTime string (i.e. YYMMDDHHmmSSZ).
    * As for UTCTime, if year "YY" is equal or less than 49 then it is 20YY.
    * If year "YY" is equal or greater than 50 then it is 19YY.
    * If flagMilli is true its result concludes milliseconds such like
    * "20170520235959.42Z".
    * @example
    * d = new Date(Date.UTC(2017,4,20,23,59,59,670));
    * datetozulu(d) → "20170520235959Z"
    * datetozulu(d, true) → "170520235959Z"
    * datetozulu(d, false, true) → "20170520235959.67Z"
    */
  def apply(d: Date, flagUTCTime: Boolean, flagMilli: Boolean): String = js.native
}

