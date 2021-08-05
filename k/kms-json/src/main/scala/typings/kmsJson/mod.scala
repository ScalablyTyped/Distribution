package typings.kmsJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kms-json", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with KmsJson {
    def this(options: KmsJsonOptions) = this()
    
    /* CompleteClass */
    override def decrypt(cipherText: String): js.Object = js.native
    
    /* CompleteClass */
    override def encrypt(inputJson: js.Object): String = js.native
  }
  
  trait KmsJson extends StObject {
    
    def decrypt(cipherText: String): js.Object
    
    def encrypt(inputJson: js.Object): String
  }
  object KmsJson {
    
    inline def apply(decrypt: String => js.Object, encrypt: js.Object => String): KmsJson = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
      __obj.asInstanceOf[KmsJson]
    }
    
    extension [Self <: KmsJson](x: Self) {
      
      inline def setDecrypt(value: String => js.Object): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      inline def setEncrypt(value: js.Object => String): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
    }
  }
  
  trait KmsJsonOptions extends StObject {
    
    var awsKmsSettings: js.UndefOr[js.Object] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var keyId: String
  }
  object KmsJsonOptions {
    
    inline def apply(keyId: String): KmsJsonOptions = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[KmsJsonOptions]
    }
    
    extension [Self <: KmsJsonOptions](x: Self) {
      
      inline def setAwsKmsSettings(value: js.Object): Self = StObject.set(x, "awsKmsSettings", value.asInstanceOf[js.Any])
      
      inline def setAwsKmsSettingsUndefined: Self = StObject.set(x, "awsKmsSettings", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    }
  }
}
