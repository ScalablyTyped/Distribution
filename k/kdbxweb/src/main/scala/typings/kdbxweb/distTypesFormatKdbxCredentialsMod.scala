package typings.kdbxweb

import typings.kdbxweb.distTypesCryptoProtectedValueMod.ProtectedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormatKdbxCredentialsMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-credentials", "KdbxCredentials")
  @js.native
  open class KdbxCredentials () extends StObject {
    def this(password: ProtectedValue) = this()
    def this(password: Null, keyFile: js.typedarray.ArrayBuffer) = this()
    def this(password: Null, keyFile: js.typedarray.Uint8Array) = this()
    def this(password: ProtectedValue, keyFile: js.typedarray.ArrayBuffer) = this()
    def this(password: ProtectedValue, keyFile: js.typedarray.Uint8Array) = this()
    def this(password: Null, keyFile: js.typedarray.ArrayBuffer, challengeResponse: KdbxChallengeResponseFn) = this()
    def this(password: Null, keyFile: js.typedarray.Uint8Array, challengeResponse: KdbxChallengeResponseFn) = this()
    def this(password: Null, keyFile: Null, challengeResponse: KdbxChallengeResponseFn) = this()
    def this(password: Null, keyFile: Unit, challengeResponse: KdbxChallengeResponseFn) = this()
    def this(
      password: ProtectedValue,
      keyFile: js.typedarray.ArrayBuffer,
      challengeResponse: KdbxChallengeResponseFn
    ) = this()
    def this(
      password: ProtectedValue,
      keyFile: js.typedarray.Uint8Array,
      challengeResponse: KdbxChallengeResponseFn
    ) = this()
    def this(password: ProtectedValue, keyFile: Null, challengeResponse: KdbxChallengeResponseFn) = this()
    def this(password: ProtectedValue, keyFile: Unit, challengeResponse: KdbxChallengeResponseFn) = this()
    
    /* private */ var _challengeResponse: Any = js.native
    
    def getChallengeResponse(): js.Promise[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | Null] = js.native
    def getChallengeResponse(challenge: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | Null] = js.native
    
    def getHash(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def getHash(challenge: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    var keyFileHash: js.UndefOr[ProtectedValue] = js.native
    
    var passwordHash: js.UndefOr[ProtectedValue] = js.native
    
    val ready: js.Promise[KdbxCredentials] = js.native
    
    /* private */ var setChallengeResponse: Any = js.native
    
    def setKeyFile(): js.Promise[Unit] = js.native
    def setKeyFile(keyFile: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
    def setKeyFile(keyFile: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    def setPassword(): js.Promise[Unit] = js.native
    def setPassword(password: ProtectedValue): js.Promise[Unit] = js.native
  }
  /* static members */
  object KdbxCredentials {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-credentials", "KdbxCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createKeyFileWithHash(keyBytes: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyFileWithHash")(keyBytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def createKeyFileWithHash(keyBytes: js.typedarray.ArrayBuffer, version: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyFileWithHash")(keyBytes.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    inline def createRandomKeyFile(): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandomKeyFile")().asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def createRandomKeyFile(version: Double): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandomKeyFile")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  }
  
  type KdbxChallengeResponseFn = js.Function1[
    /* challenge */ js.typedarray.ArrayBuffer, 
    js.Promise[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array]
  ]
}
