package typings.jsrsasign.global.jsrsasign

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.zulutodate")
@js.native
object zulutodate extends js.Object {
  /**
    * GeneralizedTime or UTCTime string to Date object
    * @param s GeneralizedTime or UTCTime string (ex. 20170412235959.384Z)
    * @return Date object for specified time
    * @description
    * This function converts from GeneralizedTime string (i.e. YYYYMMDDHHmmSSZ) or
    * UTCTime string (i.e. YYMMDDHHmmSSZ) to Date object.
    * Argument string may have fraction of seconds and
    * its length is one or more digits such as "20170410235959.1234567Z".
    * As for UTCTime, if year "YY" is equal or less than 49 then it is 20YY.
    * If year "YY" is equal or greater than 50 then it is 19YY.
    * @example
    * zulutodate(  "071231235959Z").toUTCString()   → "Mon, 31 Dec 2007 23:59:59 GMT"
    * zulutodate(  "071231235959.1Z").toUTCString() → "Mon, 31 Dec 2007 23:59:59 GMT"
    * zulutodate("20071231235959Z").toUTCString()   → "Mon, 31 Dec 2007 23:59:59 GMT"
    * zulutodate(  "071231235959.34").getMilliseconds() → 340
    */
  def apply(s: String): Date = js.native
}

