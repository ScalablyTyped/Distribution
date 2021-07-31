package typings.hashJs

import typings.hashJs.hashJsNumbers.`1024`
import typings.hashJs.hashJsNumbers.`128`
import typings.hashJs.hashJsNumbers.`192`
import typings.hashJs.hashJsNumbers.`384`
import typings.hashJs.hashJsStrings.big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha384
  extends StObject
     with BlockHash[Sha384]
     with MessageDigest[Sha384] {
  
  @JSName("blockSize")
  var blockSize_Sha384: `1024` = js.native
  
  @JSName("endian")
  var endian_Sha384: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha384: `192` = js.native
  
  @JSName("outSize")
  var outSize_Sha384: `384` = js.native
  
  @JSName("padLength")
  var padLength_Sha384: `128` = js.native
}
