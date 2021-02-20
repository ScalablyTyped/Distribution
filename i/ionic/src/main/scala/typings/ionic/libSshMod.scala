package typings.ionic

import typings.ionic.anon.IdNumber
import typings.ionic.anon.PartialPaginateArgsResponMax
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.ResourceClientCreate
import typings.ionic.definitionsMod.ResourceClientDelete
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.SSHKey
import typings.ionic.httpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSshMod {
  
  @JSImport("ionic/lib/ssh", "ERROR_SSH_INVALID_PRIVKEY")
  @js.native
  val ERROR_SSH_INVALID_PRIVKEY: /* "SSH_INVALID_PRIVKEY" */ String = js.native
  
  @JSImport("ionic/lib/ssh", "ERROR_SSH_INVALID_PUBKEY")
  @js.native
  val ERROR_SSH_INVALID_PUBKEY: /* "SSH_INVALID_PUBKEY" */ String = js.native
  
  @JSImport("ionic/lib/ssh", "ERROR_SSH_MISSING_PRIVKEY")
  @js.native
  val ERROR_SSH_MISSING_PRIVKEY: /* "SSH_MISSING_PRIVKEY" */ String = js.native
  
  @JSImport("ionic/lib/ssh", "SSHKeyClient")
  @js.native
  class SSHKeyClient protected ()
    extends ResourceClient
       with ResourceClientLoad[SSHKey]
       with ResourceClientDelete
       with ResourceClientCreate[SSHKey, SSHKeyCreateDetails]
       with ResourceClientPaginate[SSHKey] {
    def this(hasClientTokenUser: SSHKeyClientDeps) = this()
    
    var client: IClient = js.native
    
    def load(id: String): js.Promise[SSHKey] = js.native
    
    def paginate(args: PartialPaginateArgsResponMax): IPaginator[Response[js.Array[SSHKey]], PaginatorState] = js.native
    
    var token: String = js.native
    
    var user: IdNumber = js.native
  }
  
  @JSImport("ionic/lib/ssh", "getGeneratedPrivateKeyPath")
  @js.native
  def getGeneratedPrivateKeyPath(): js.Promise[String] = js.native
  @JSImport("ionic/lib/ssh", "getGeneratedPrivateKeyPath")
  @js.native
  def getGeneratedPrivateKeyPath(userId: Double): js.Promise[String] = js.native
  
  @JSImport("ionic/lib/ssh", "parsePublicKey")
  @js.native
  def parsePublicKey(pubkey: String): js.Tuple4[String, String, String, String] = js.native
  
  @JSImport("ionic/lib/ssh", "parsePublicKeyFile")
  @js.native
  def parsePublicKeyFile(pubkeyPath: String): js.Promise[js.Tuple4[String, String, String, String]] = js.native
  
  @JSImport("ionic/lib/ssh", "validatePrivateKey")
  @js.native
  def validatePrivateKey(keyPath: String): js.Promise[Unit] = js.native
  
  @js.native
  trait SSHKeyClientDeps extends StObject {
    
    val client: IClient = js.native
    
    val token: String = js.native
    
    val user: IdNumber = js.native
  }
  object SSHKeyClientDeps {
    
    @scala.inline
    def apply(client: IClient, token: String, user: IdNumber): SSHKeyClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSHKeyClientDeps]
    }
    
    @scala.inline
    implicit class SSHKeyClientDepsMutableBuilder[Self <: SSHKeyClientDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: IdNumber): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SSHKeyCreateDetails extends StObject {
    
    var pubkey: String = js.native
  }
  object SSHKeyCreateDetails {
    
    @scala.inline
    def apply(pubkey: String): SSHKeyCreateDetails = {
      val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSHKeyCreateDetails]
    }
    
    @scala.inline
    implicit class SSHKeyCreateDetailsMutableBuilder[Self <: SSHKeyCreateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubkey(value: String): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    }
  }
}
