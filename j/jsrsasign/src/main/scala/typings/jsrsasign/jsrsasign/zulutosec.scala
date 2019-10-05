package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.zulutosec")
@js.native
object zulutosec extends js.Object {
  /**
    * GeneralizedTime or UTCTime string to seconds from Unix origin
    * @param s GeneralizedTime or UTCTime string (ex. 20170412235959.384Z)
    * @return seconds from Unix origin time (i.e. Jan 1, 1970 0:00:00 UTC)
    * @description
    * This function converts from GeneralizedTime string (i.e. YYYYMMDDHHmmSSZ) or
    * UTCTime string (i.e. YYMMDDHHmmSSZ) to seconds from Unix origin time
    * (i.e. Jan 1 1970 0:00:00 UTC). Argument string may have fraction of seconds
    * however result value will be omitted.
    * As for UTCTime, if year "YY" is equal or less than 49 then it is 20YY.
    * If year "YY" is equal or greater than 50 then it is 19YY.
    * @example
    * zulutosec("071231235959Z")   → 1199145599 #Mon, 31 Dec 2007 23:59:59 GMT
    * zulutosec("071231235959.1Z") → 1199145599 #Mon, 31 Dec 2007 23:59:59 GMT
    * zulutosec("20071231235959Z") → 1199145599 #Mon, 31 Dec 2007 23:59:59 GMT
    */
  def apply(s: String): Double = js.native
}

