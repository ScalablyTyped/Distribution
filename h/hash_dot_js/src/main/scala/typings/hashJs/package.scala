package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hashJs {
  
  type HmacConstructor = js.Function3[
    /* hash */ typings.hashJs.BlockHash[js.Any], 
    /* key */ js.Any, 
    /* enc */ js.UndefOr[typings.hashJs.hashJsStrings.hex], 
    typings.hashJs.Hmac
  ]
  
  type Ripemd160Constructor = js.Function0[typings.hashJs.Ripemd160]
  
  type Sha1Constructor = js.Function0[typings.hashJs.Sha1]
  
  type Sha224Constructor = js.Function0[typings.hashJs.Sha224]
  
  type Sha256Constructor = js.Function0[typings.hashJs.Sha256]
  
  type Sha384Constructor = js.Function0[typings.hashJs.Sha384]
  
  type Sha512Constructor = js.Function0[typings.hashJs.Sha512]
}
