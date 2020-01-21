package typings.jsonwebtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetPublicKeyOrSecret = js.Function2[
    /* header */ typings.jsonwebtoken.mod.JwtHeader, 
    /* callback */ typings.jsonwebtoken.mod.SigningKeyCallback, 
    scala.Unit
  ]
  type Secret = java.lang.String | typings.node.Buffer | typings.jsonwebtoken.AnonKey
  type SignCallback = js.Function2[/* err */ typings.std.Error, /* encoded */ java.lang.String, scala.Unit]
  type SigningKeyCallback = js.Function2[
    /* err */ js.Any, 
    /* signingKey */ js.UndefOr[typings.jsonwebtoken.mod.Secret], 
    scala.Unit
  ]
  type VerifyCallback = js.Function2[
    /* err */ typings.jsonwebtoken.mod.VerifyErrors, 
    /* decoded */ js.Object | java.lang.String, 
    scala.Unit
  ]
}
