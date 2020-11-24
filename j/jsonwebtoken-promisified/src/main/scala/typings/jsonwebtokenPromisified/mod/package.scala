package typings.jsonwebtokenPromisified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Secret = java.lang.String | typings.node.Buffer | typings.jsonwebtokenPromisified.anon.Key
  
  type SignCallback = js.Function2[/* err */ typings.std.Error, /* encoded */ java.lang.String, scala.Unit]
  
  type VerifyCallback = js.Function2[
    /* err */ typings.jsonwebtokenPromisified.mod.JsonWebTokenError | typings.jsonwebtokenPromisified.mod.NotBeforeError | typings.jsonwebtokenPromisified.mod.TokenExpiredError, 
    /* decoded */ js.Object | java.lang.String, 
    scala.Unit
  ]
}
