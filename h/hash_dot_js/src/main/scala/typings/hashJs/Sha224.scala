package typings.hashJs

import typings.hashJs.hashJsNumbers.`192`
import typings.hashJs.hashJsNumbers.`224`
import typings.hashJs.hashJsNumbers.`512`
import typings.hashJs.hashJsNumbers.`64`
import typings.hashJs.hashJsStrings.big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha224
  extends StObject
     with BlockHash[Sha224]
     with MessageDigest[Sha224] {
  
  @JSName("blockSize")
  var blockSize_Sha224: `512` = js.native
  
  @JSName("endian")
  var endian_Sha224: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha224: `192` = js.native
  
  @JSName("outSize")
  var outSize_Sha224: `224` = js.native
  
  @JSName("padLength")
  var padLength_Sha224: `64` = js.native
}
