package typings.matrixBotSdk

import typings.matrixBotSdk.libE2eeIcryptoroominformationMod.ICryptoRoomInformation
import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixOrgMatrixSdkCryptoNodejs.mod.OlmMachine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libE2eeRustEngineMod {
  
  @JSImport("matrix-bot-sdk/lib/e2ee/RustEngine", "RustEngine")
  @js.native
  open class RustEngine protected () extends StObject {
    def this(machine: OlmMachine, client: MatrixClient) = this()
    
    /* private */ var actuallyProcessToDeviceRequest: Any = js.native
    
    def addTrackedUsers(userIds: js.Array[String]): js.Promise[Unit] = js.native
    
    /* private */ var client: Any = js.native
    
    val lock: Any = js.native
    
    val machine: OlmMachine = js.native
    
    def prepareEncrypt(roomId: String, roomInfo: ICryptoRoomInformation): js.Promise[Unit] = js.native
    
    /* private */ var processKeysClaimRequest: Any = js.native
    
    /* private */ var processKeysQueryRequest: Any = js.native
    
    /* private */ var processKeysUploadRequest: Any = js.native
    
    /* private */ var processToDeviceRequest: Any = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
  
  @JSImport("matrix-bot-sdk/lib/e2ee/RustEngine", "SYNC_LOCK_NAME")
  @js.native
  val SYNC_LOCK_NAME: /* "sync" */ String = js.native
}
