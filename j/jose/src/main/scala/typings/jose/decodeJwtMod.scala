package typings.jose

import typings.jose.typesMod.JWTPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeJwtMod {
  
  @JSImport("jose/dist/types/util/decode_jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeJwt(jwt: String): JWTPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[JWTPayload]
}
