package typings.lesgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesFirebaseAdminServiceMod {
  
  @JSImport("lesgo/services/FirebaseAdminService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FirebaseAdmin {
    def this(opts: FirebaseAdminOpts) = this()
  }
  
  @js.native
  trait FirebaseAdmin extends StObject {
    
    /* protected */ var app: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify app.App */ Any) | Null = js.native
    
    def connect(opts: FirebaseAdminOpts): Unit = js.native
    
    def createUser(data: UserData): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify auth.UserRecord */ Any
      ] = js.native
    
    def delete(): js.Promise[Unit] = js.native
    
    def deleteUser(uid: String): js.Promise[Unit] = js.native
    
    def getAllUsers(): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify auth.UserRecord */ Any
        ]
      ] = js.native
    def getAllUsers(maxResults: Double): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify auth.UserRecord */ Any
        ]
      ] = js.native
    def getAllUsers(maxResults: Double, nextPageToken: String): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify auth.UserRecord */ Any
        ]
      ] = js.native
    def getAllUsers(maxResults: Unit, nextPageToken: String): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify auth.UserRecord */ Any
        ]
      ] = js.native
  }
  
  trait FirebaseAdminOpts extends StObject {
    
    var projectName: String
    
    var serviceAccount: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceAccount */ Any)
  }
  object FirebaseAdminOpts {
    
    inline def apply(
      projectName: String,
      serviceAccount: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceAccount */ Any)
    ): FirebaseAdminOpts = {
      val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAdminOpts]
    }
    
    extension [Self <: FirebaseAdminOpts](x: Self) {
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setServiceAccount(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceAccount */ Any)
      ): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserData extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var uid: js.UndefOr[String] = js.undefined
    
    var username: String
  }
  object UserData {
    
    inline def apply(password: String, username: String): UserData = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserData]
    }
    
    extension [Self <: UserData](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
