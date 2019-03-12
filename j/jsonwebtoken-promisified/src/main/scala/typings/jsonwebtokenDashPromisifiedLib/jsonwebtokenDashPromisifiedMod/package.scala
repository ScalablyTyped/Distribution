package typings
package jsonwebtokenDashPromisifiedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonwebtokenDashPromisifiedMod {
  type Secret = java.lang.String | nodeLib.Buffer | jsonwebtokenDashPromisifiedLib.Anon_Key
  type SignCallback = js.Function2[/* err */ stdLib.Error, /* encoded */ java.lang.String, scala.Unit]
  type VerifyCallback = js.Function2[
    /* err */ JsonWebTokenError | NotBeforeError | TokenExpiredError, 
    /* decoded */ js.Object | java.lang.String, 
    scala.Unit
  ]
}
