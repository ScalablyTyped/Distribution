package typings
package jsonwebtokenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonwebtokenMod {
  type GetPublicKeyOrSecret = js.Function2[/* header */ JwtHeader, /* callback */ SigningKeyCallback, scala.Unit]
  type Secret = java.lang.String | nodeLib.Buffer | jsonwebtokenLib.Anon_Key
  type SignCallback = js.Function2[/* err */ stdLib.Error, /* encoded */ java.lang.String, scala.Unit]
  type SigningKeyCallback = js.Function2[/* err */ js.Any, /* signingKey */ js.UndefOr[Secret], scala.Unit]
  type VerifyCallback = js.Function2[/* err */ VerifyErrors, /* decoded */ js.Object | java.lang.String, scala.Unit]
}
