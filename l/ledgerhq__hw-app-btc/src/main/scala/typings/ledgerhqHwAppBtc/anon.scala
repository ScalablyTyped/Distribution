package typings.ledgerhqHwAppBtc

import typings.ledgerhqHwAppBtc.mod.AddressFormat
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BitcoinAddress extends StObject {
    
    var bitcoinAddress: String
    
    var chainCode: String
    
    var publicKey: String
  }
  object BitcoinAddress {
    
    @scala.inline
    def apply(bitcoinAddress: String, chainCode: String, publicKey: String): BitcoinAddress = {
      val __obj = js.Dynamic.literal(bitcoinAddress = bitcoinAddress.asInstanceOf[js.Any], chainCode = chainCode.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitcoinAddress]
    }
    
    @scala.inline
    implicit class BitcoinAddressMutableBuilder[Self <: BitcoinAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitcoinAddress(value: String): Self = StObject.set(x, "bitcoinAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[AddressFormat] = js.undefined
    
    var verify: js.UndefOr[Boolean] = js.undefined
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: AddressFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var progress: Double
    
    var total: Double
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, progress: Double, total: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait R extends StObject {
    
    var r: String
    
    var s: String
    
    var v: Double
  }
  object R {
    
    @scala.inline
    def apply(r: String, s: String, v: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrustedInput extends StObject {
    
    var trustedInput: Boolean
    
    var value: Buffer
  }
  object TrustedInput {
    
    @scala.inline
    def apply(trustedInput: Boolean, value: Buffer): TrustedInput = {
      val __obj = js.Dynamic.literal(trustedInput = trustedInput.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustedInput]
    }
    
    @scala.inline
    implicit class TrustedInputMutableBuilder[Self <: TrustedInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrustedInput(value: Boolean): Self = StObject.set(x, "trustedInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
