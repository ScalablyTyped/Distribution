package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.zulutomsec")
@js.native
object zulutomsec extends js.Object {
  /**
    * GeneralizedTime or UTCTime string to milliseconds from Unix origin
    * @param s GeneralizedTime or UTCTime string (ex. 20170412235959.384Z)
    * @return milliseconds from Unix origin time (i.e. Jan 1, 1970 0:00:00 UTC)
    * @description
    * This function converts from GeneralizedTime string (i.e. YYYYMMDDHHmmSSZ) or
    * UTCTime string (i.e. YYMMDDHHmmSSZ) to milliseconds from Unix origin time
    * (i.e. Jan 1 1970 0:00:00 UTC).
    * Argument string may have fraction of seconds and
    * its length is one or more digits such as "20170410235959.1234567Z".
    * As for UTCTime, if year "YY" is equal or less than 49 then it is 20YY.
    * If year "YY" is equal or greater than 50 then it is 19YY.
    * @example
    * zulutomsec("071231235959Z")       → 1199145599000 #Mon, 31 Dec 2007 23:59:59 GMT
    * zulutomsec("071231235959.1Z")     → 1199145599100 #Mon, 31 Dec 2007 23:59:59 GMT
    * zulutomsec("071231235959.12345Z") → 1199145599123 #Mon, 31 Dec 2007 23:59:59 GMT
    * zulutomsec("20071231235959Z")     → 1199145599000 #Mon, 31 Dec 2007 23:59:59 GMT
    * zulutomsec("931231235959Z")       → -410227201000 #Mon, 31 Dec 1956 23:59:59 GMT
    */
  def apply(s: String): Double = js.native
}

