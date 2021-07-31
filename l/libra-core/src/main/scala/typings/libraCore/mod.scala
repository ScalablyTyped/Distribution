package typings.libraCore

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("futoin-hkdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(ikm: BuffString, outputLen: Double, options: js.Object): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ikm.asInstanceOf[js.Any], outputLen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def expand(hashAlgo: String, hashLen: Double, prk: BuffString, outputLen: Double, info: BuffString): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hashAlgo.asInstanceOf[js.Any], hashLen.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], outputLen.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def extract(hashAlgo: String, hashLen: Double, ikm: BuffString): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hashAlgo.asInstanceOf[js.Any], hashLen.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def extract(hashAlgo: String, hashLen: Double, ikm: BuffString, salt: BuffString): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hashAlgo.asInstanceOf[js.Any], hashLen.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def hashLength(hash: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_length")(hash.asInstanceOf[js.Any]).asInstanceOf[Double]
}
