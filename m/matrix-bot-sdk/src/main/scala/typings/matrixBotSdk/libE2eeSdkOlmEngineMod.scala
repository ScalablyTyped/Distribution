package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Devicekeys
import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libE2eeSdkOlmEngineMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OlmEngine * / any */ @JSImport("matrix-bot-sdk/lib/e2ee/SdkOlmEngine", "SdkOlmEngine")
  @js.native
  open class SdkOlmEngine protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    def claimOneTimeKeys(
      claim: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyClaim */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyClaimResponse */ Any
      ] = js.native
    
    /* private */ var client: Any = js.native
    
    def getEffectiveJoinedUsersInRoom(roomId: String): js.Promise[js.Array[String]] = js.native
    
    def queryOneTimeKeys(userIds: js.Array[String]): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyQueryResults */ Any
      ] = js.native
    
    def sendToDevices(
      eventType: String,
      messages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ToDeviceMessages */ Any
    ): js.Promise[Unit] = js.native
    
    def uploadOneTimeKeys(body: Devicekeys): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OTKCounts */ Any
      ] = js.native
  }
}
