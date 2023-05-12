package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decrypter extends StObject {
  
  /* private */ var currentIV: Any = js.native
  
  /* private */ var currentResult: Any = js.native
  
  def decrypt(data: js.typedarray.ArrayBuffer, key: js.typedarray.ArrayBuffer, iv: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.ArrayBuffer, iv: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def destroy(): Unit = js.native
  
  /* private */ var fastAesKey: Any = js.native
  
  def flush(): js.typedarray.Uint8Array | Null = js.native
  
  /* private */ var getValidChunk: Any = js.native
  
  def isSync(): Boolean = js.native
  
  /* private */ var key: Any = js.native
  
  /* private */ var logEnabled: Any = js.native
  
  /* private */ var logOnce: Any = js.native
  
  /* private */ var onWebCryptoError: Any = js.native
  
  /* private */ var remainderData: Any = js.native
  
  /* private */ var removePKCS7Padding: Any = js.native
  
  def reset(): Unit = js.native
  
  def softwareDecrypt(data: js.typedarray.Uint8Array, key: js.typedarray.ArrayBuffer, iv: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer | Null = js.native
  
  /* private */ var softwareDecrypter: Any = js.native
  
  /* private */ var subtle: Any = js.native
  
  /* private */ var useSoftware: Any = js.native
  
  def webCryptoDecrypt(data: js.typedarray.Uint8Array, key: js.typedarray.ArrayBuffer, iv: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
