package typings.hashJs

import typings.hashJs.hashJsInts.`160`
import typings.hashJs.hashJsInts.`512`
import typings.hashJs.hashJsInts.`64`
import typings.hashJs.hashJsInts.`80`
import typings.hashJs.hashJsStrings.big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha1
  extends StObject
     with BlockHash[Sha1]
     with MessageDigest[Sha1] {
  
  @JSName("blockSize")
  var blockSize_Sha1: `512` = js.native
  
  @JSName("endian")
  var endian_Sha1: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha1: `80` = js.native
  
  @JSName("outSize")
  var outSize_Sha1: `160` = js.native
  
  @JSName("padLength")
  var padLength_Sha1: `64` = js.native
}
