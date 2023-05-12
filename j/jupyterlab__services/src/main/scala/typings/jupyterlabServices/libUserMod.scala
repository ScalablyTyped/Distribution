package typings.jupyterlabServices

import typings.jupyterlabServices.libBasemanagerMod.BaseManager
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.NetworkError
import typings.jupyterlabServices.libUserMod.User.IIdentity
import typings.jupyterlabServices.libUserMod.User.IUser
import typings.jupyterlabServices.libUserMod.UserManager.IOptions
import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoPolling.typesPollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUserMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterlabServices.libBasemanagerMod.IManager because Already inherited
  - typings.jupyterlabServices.libUserMod.User.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined userChanged, identity, permissions, refreshUser */ @JSImport("@jupyterlab/services/lib/user", "UserManager")
  @js.native
  /**
    * Create a new user manager.
    */
  open class UserManager () extends BaseManager {
    def this(options: IOptions) = this()
    
    /* private */ var _connectionFailure: Any = js.native
    
    /* private */ var _identity: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _permissions: Any = js.native
    
    /* private */ var _pollSpecs: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /* private */ var _userChanged: Any = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    def connectionFailure_MUserManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * Get the most recently fetched identity.
      */
    def identity: IIdentity | Null = js.native
    /**
      * User's identity.
      *
      * #### Notes
      * The value will be null until the manager is ready.
      */
    @JSName("identity")
    val identity_FUserManager: IIdentity | Null = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MUserManager: Boolean = js.native
    
    /**
      * Get the most recently fetched permissions.
      */
    def permissions: ReadonlyJSONObject | Null = js.native
    /**
      * User's permissions.
      *
      * #### Notes
      * The value will be null until the manager is ready.
      */
    @JSName("permissions")
    val permissions_FUserManager: ReadonlyJSONObject | Null = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MUserManager: js.Promise[Unit] = js.native
    
    /**
      * Force a refresh of the specs from the server.
      *
      * @returns A promise that resolves when the specs are fetched.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    /**
      * Force a refresh of user's identity from the server.
      *
      * @returns A promise that resolves when the identity is fetched.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshUser(): js.Promise[Unit] = js.native
    
    /**
      * Execute a request to the server to poll the user and update state.
      */
    /* protected */ def requestUser(): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the user changes.
      */
    def userChanged: ISignal[this.type, IUser] = js.native
    /**
      * A signal emitted when the user changes.
      */
    @JSName("userChanged")
    var userChanged_FUserManager: ISignal[this.type, IUser] = js.native
  }
  object UserManager {
    
    /**
      * The instantiation options for a user manager.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabServices.libBasemanagerMod.BaseManager.IOptions {
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby | (js.Function0[Boolean | Standby])] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setStandby(value: Standby | (js.Function0[Boolean | Standby])): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        inline def setStandbyFunction0(value: () => Boolean | Standby): Self = StObject.set(x, "standby", js.Any.fromFunction0(value))
        
        inline def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
  
  object User {
    
    /**
      * The interface describing a user identity.
      */
    trait IIdentity
      extends StObject
         with PartialJSONObject {
      
      /**
        * User's avatar url.
        * The url to the user's image for the icon.
        */
      val avatar_url: js.UndefOr[String] = js.undefined
      
      /**
        * User's cursor color and icon color if avatar_url is undefined
        * (there is no image).
        */
      val color: String
      
      /**
        * Shorter version of the name for displaying it on the UI.
        */
      val display_name: String
      
      /**
        * User's name initials.
        */
      val initials: String
      
      /**
        * User's full name.
        */
      val name: String
      
      /**
        * User's unique identifier.
        */
      val username: String
    }
    object IIdentity {
      
      inline def apply(color: String, display_name: String, initials: String, name: String, username: String): IIdentity = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], initials = initials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[IIdentity]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IIdentity] (val x: Self) extends AnyVal {
        
        inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
        
        inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
        
        inline def setInitials(value: String): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Object which manages user's identity.
      *
      * #### Notes
      * The manager is responsible for maintaining the state of the user.
      */
    trait IManager
      extends StObject
         with typings.jupyterlabServices.libBasemanagerMod.IManager {
      
      /**
        * User's identity.
        *
        * #### Notes
        * The value will be null until the manager is ready.
        */
      val identity: IIdentity | Null
      
      /**
        * User's permissions.
        *
        * #### Notes
        * The value will be null until the manager is ready.
        */
      val permissions: ReadonlyJSONObject | Null
      
      /**
        * Force a refresh of user's identity from the server.
        *
        * @returns A promise that resolves when the identity is fetched.
        *
        * #### Notes
        * This is intended to be called only in response to a user action,
        * since the manager maintains its internal state.
        */
      def refreshUser(): js.Promise[Unit]
      
      /**
        * A signal emitted when the user changes.
        */
      var userChanged: ISignal[this.type, IUser]
    }
    object IManager {
      
      inline def apply(
        connectionFailure: ISignal[typings.jupyterlabServices.libBasemanagerMod.IManager, NetworkError],
        dispose: () => Unit,
        disposed: ISignal[IManager, Unit],
        isDisposed: Boolean,
        isReady: Boolean,
        ready: js.Promise[Unit],
        refreshUser: () => js.Promise[Unit],
        serverSettings: ISettings,
        userChanged: ISignal[IManager, IUser]
      ): IManager = {
        val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], refreshUser = js.Any.fromFunction0(refreshUser), serverSettings = serverSettings.asInstanceOf[js.Any], userChanged = userChanged.asInstanceOf[js.Any], identity = null, permissions = null)
        __obj.asInstanceOf[IManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
        
        inline def setIdentity(value: IIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
        
        inline def setIdentityNull: Self = StObject.set(x, "identity", null)
        
        inline def setPermissions(value: ReadonlyJSONObject): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
        
        inline def setRefreshUser(value: () => js.Promise[Unit]): Self = StObject.set(x, "refreshUser", js.Any.fromFunction0(value))
        
        inline def setUserChanged(value: ISignal[IManager, IUser]): Self = StObject.set(x, "userChanged", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface describing a user identity.
      */
    trait IUser extends StObject {
      
      val identity: IIdentity
      
      val permissions: PartialJSONObject
    }
    object IUser {
      
      inline def apply(identity: IIdentity, permissions: PartialJSONObject): IUser = {
        val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
        __obj.asInstanceOf[IUser]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IUser] (val x: Self) extends AnyVal {
        
        inline def setIdentity(value: IIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
        
        inline def setPermissions(value: PartialJSONObject): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      }
    }
  }
}
