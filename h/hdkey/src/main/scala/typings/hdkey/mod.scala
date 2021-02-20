package typings.hdkey

import typings.hdkey.anon.Xpriv
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hdkey", JSImport.Namespace)
  @js.native
  class ^ () extends HDNode
  
  /* static member */
  @JSImport("hdkey", "fromJSON")
  @js.native
  def fromJSON(obj: Xpriv): HDNode = js.native
  
  /* static member */
  @JSImport("hdkey", "fromMasterSeed")
  @js.native
  def fromMasterSeed(seed: Buffer): HDNode = js.native
  
  @js.native
  trait HDNode extends StObject {
    
    var chainCode: Buffer = js.native
    
    def derive(path: String): HDNode = js.native
    
    var privateKey: Buffer = js.native
    
    var publicKey: Buffer = js.native
    
    def toJSON(): Xpriv = js.native
  }
  object HDNode {
    
    @scala.inline
    def apply(
      chainCode: Buffer,
      derive: String => HDNode,
      privateKey: Buffer,
      publicKey: Buffer,
      toJSON: () => Xpriv
    ): HDNode = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], derive = js.Any.fromFunction1(derive), privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[HDNode]
    }
    
    @scala.inline
    implicit class HDNodeMutableBuilder[Self <: HDNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainCode(value: Buffer): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerive(value: String => HDNode): Self = StObject.set(x, "derive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => Xpriv): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
