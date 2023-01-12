package typings.keythereum

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.Cipher
import typings.node.cryptoMod.CipherCCM
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCM
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.CipherKey
import typings.node.cryptoMod.CipherOCB
import typings.node.cryptoMod.CipherOCBOptions
import typings.node.cryptoMod.CipherOCBTypes
import typings.node.cryptoMod.Decipher
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.cryptoMod.DecipherOCB
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait C extends StObject {
    
    var c: Double
    
    var dklen: Double
    
    var hash: String
    
    var prf: String
  }
  object C {
    
    inline def apply(c: Double, dklen: Double, hash: String, prf: String): C = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any])
      __obj.asInstanceOf[C]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: C] (val x: Self) extends AnyVal {
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPrf(value: String): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dklen extends StObject {
    
    var dklen: Double
    
    var memory: Double
    
    var n: Double
    
    var p: Double
    
    var r: Double
  }
  object Dklen {
    
    inline def apply(dklen: Double, memory: Double, n: Double, p: Double, r: Double): Dklen = {
      val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dklen]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dklen] (val x: Self) extends AnyVal {
      
      inline def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(algorithm: String, key: CipherKey): Cipher = js.native
    def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Cipher = js.native
    def apply(algorithm: String, key: CipherKey, iv: BinaryLike): Cipher = js.native
    def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Cipher = js.native
    def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
    def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
    def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
    def apply(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): CipherOCB = js.native
  }
  
  @js.native
  trait FnCallAlgorithmKeyIvOptions extends StObject {
    
    def apply(algorithm: String, key: CipherKey): Decipher = js.native
    def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Decipher = js.native
    def apply(algorithm: String, key: CipherKey, iv: BinaryLike): Decipher = js.native
    def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Decipher = js.native
    def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
    def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = js.native
    def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
    def apply(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): DecipherOCB = js.native
  }
  
  @js.native
  trait FnCallSizeCallback extends StObject {
    
    def apply(size: Double): Buffer = js.native
    def apply(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
  }
  
  trait Iv extends StObject {
    
    var iv: String
  }
  object Iv {
    
    inline def apply(iv: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Iv] (val x: Self) extends AnyVal {
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mac extends StObject {
    
    var mac: String
  }
  object Mac {
    
    inline def apply(mac: String): Mac = {
      val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mac]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mac] (val x: Self) extends AnyVal {
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
}
