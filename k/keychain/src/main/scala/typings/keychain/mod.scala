package typings.keychain

import org.scalablytyped.runtime.Instantiable0
import typings.keychain.anon.PickKeyChainBaseOptionsac
import typings.keychain.keychainStrings.generic
import typings.keychain.keychainStrings.internet
import typings.keychain.mod.keychainTypes.KeyChainBaseOptions
import typings.keychain.mod.keychainTypes.KeychainErrorCodes
import typings.keychain.mod.keychainTypes.KeychainErrorType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  KeychainError :new (): keychain.keychain.keychainTypes.KeychainError} & {  getPassword :(options : std.Pick<keychain.keychain.keychainTypes.KeyChainBaseOptions, 'account' | 'service'>, callback : (err : keychain.keychain.keychainTypes.KeychainError, password : string): void): void,   setPassword :(options : keychain.keychain.keychainTypes.KeyChainBaseOptions, callback : (err : keychain.keychain.keychainTypes.KeychainError): void): void,   deletePassword :(options : std.Pick<keychain.keychain.keychainTypes.KeyChainBaseOptions, 'account' | 'service'>, callback : (err : keychain.keychain.keychainTypes.KeychainError): void): void} */
object mod {
  
  @JSImport("keychain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("keychain", "KeychainError")
  @js.native
  open class KeychainError ()
    extends StObject
       with typings.keychain.mod.keychainTypes.KeychainError {
    
    /* CompleteClass */
    var code: KeychainErrorCodes = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var `type`: KeychainErrorType = js.native
  }
  @JSImport("keychain", "KeychainError")
  @js.native
  def KeychainError: Instantiable0[typings.keychain.mod.keychainTypes.KeychainError] = js.native
  inline def KeychainError_=(x: Instantiable0[typings.keychain.mod.keychainTypes.KeychainError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeychainError")(x.asInstanceOf[js.Any])
  
  @JSImport("keychain", "deletePassword")
  @js.native
  def deletePassword: js.Function2[
    /* options */ PickKeyChainBaseOptionsac, 
    /* callback */ js.Function1[/* err */ typings.keychain.mod.keychainTypes.KeychainError, Unit], 
    Unit
  ] = js.native
  inline def deletePassword(
    options: PickKeyChainBaseOptionsac,
    callback: js.Function1[/* err */ typings.keychain.mod.keychainTypes.KeychainError, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deletePassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deletePassword_=(
    x: js.Function2[
      /* options */ PickKeyChainBaseOptionsac, 
      /* callback */ js.Function1[/* err */ typings.keychain.mod.keychainTypes.KeychainError, Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deletePassword")(x.asInstanceOf[js.Any])
  
  @JSImport("keychain", "getPassword")
  @js.native
  def getPassword: js.Function2[
    /* options */ PickKeyChainBaseOptionsac, 
    /* callback */ js.Function2[
      /* err */ typings.keychain.mod.keychainTypes.KeychainError, 
      /* password */ String, 
      Unit
    ], 
    Unit
  ] = js.native
  inline def getPassword(
    options: PickKeyChainBaseOptionsac,
    callback: js.Function2[
      /* err */ typings.keychain.mod.keychainTypes.KeychainError, 
      /* password */ String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getPassword_=(
    x: js.Function2[
      /* options */ PickKeyChainBaseOptionsac, 
      /* callback */ js.Function2[
        /* err */ typings.keychain.mod.keychainTypes.KeychainError, 
        /* password */ String, 
        Unit
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPassword")(x.asInstanceOf[js.Any])
  
  @JSImport("keychain", "setPassword")
  @js.native
  def setPassword: js.Function2[
    /* options */ KeyChainBaseOptions, 
    /* callback */ js.Function1[/* err */ typings.keychain.mod.keychainTypes.KeychainError, Unit], 
    Unit
  ] = js.native
  inline def setPassword(
    options: KeyChainBaseOptions,
    callback: js.Function1[/* err */ typings.keychain.mod.keychainTypes.KeychainError, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setPassword_=(
    x: js.Function2[
      /* options */ KeyChainBaseOptions, 
      /* callback */ js.Function1[/* err */ typings.keychain.mod.keychainTypes.KeychainError, Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setPassword")(x.asInstanceOf[js.Any])
  
  object keychainTypes {
    
    trait KeyChainBaseOptions extends StObject {
      
      var account: String
      
      var password: String
      
      var service: String
      
      var `type`: js.UndefOr[generic | internet] = js.undefined
    }
    object KeyChainBaseOptions {
      
      inline def apply(account: String, password: String, service: String): KeyChainBaseOptions = {
        val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
        __obj.asInstanceOf[KeyChainBaseOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: KeyChainBaseOptions] (val x: Self) extends AnyVal {
        
        inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        inline def setType(value: generic | internet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait KeychainError
      extends StObject
         with Error {
      
      var code: KeychainErrorCodes
      
      var `type`: KeychainErrorType
    }
    object KeychainError {
      
      inline def apply(code: KeychainErrorCodes, message: String, name: String, `type`: KeychainErrorType): typings.keychain.mod.keychainTypes.KeychainError = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.keychain.mod.keychainTypes.KeychainError]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.keychain.mod.keychainTypes.KeychainError] (val x: Self) extends AnyVal {
        
        inline def setCode(value: KeychainErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setType(value: KeychainErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.keychain.keychainStrings.UnsupportedPlatform
      - typings.keychain.keychainStrings.NoAccountProvided
      - typings.keychain.keychainStrings.NoServiceProvided
      - typings.keychain.keychainStrings.NoPasswordProvided
      - typings.keychain.keychainStrings.ServiceFailure
      - typings.keychain.keychainStrings.PasswordNotFound
    */
    trait KeychainErrorCodes extends StObject
    object KeychainErrorCodes {
      
      inline def NoAccountProvided: typings.keychain.keychainStrings.NoAccountProvided = "NoAccountProvided".asInstanceOf[typings.keychain.keychainStrings.NoAccountProvided]
      
      inline def NoPasswordProvided: typings.keychain.keychainStrings.NoPasswordProvided = "NoPasswordProvided".asInstanceOf[typings.keychain.keychainStrings.NoPasswordProvided]
      
      inline def NoServiceProvided: typings.keychain.keychainStrings.NoServiceProvided = "NoServiceProvided".asInstanceOf[typings.keychain.keychainStrings.NoServiceProvided]
      
      inline def PasswordNotFound: typings.keychain.keychainStrings.PasswordNotFound = "PasswordNotFound".asInstanceOf[typings.keychain.keychainStrings.PasswordNotFound]
      
      inline def ServiceFailure: typings.keychain.keychainStrings.ServiceFailure = "ServiceFailure".asInstanceOf[typings.keychain.keychainStrings.ServiceFailure]
      
      inline def UnsupportedPlatform: typings.keychain.keychainStrings.UnsupportedPlatform = "UnsupportedPlatform".asInstanceOf[typings.keychain.keychainStrings.UnsupportedPlatform]
    }
    
    type KeychainErrorType = /* template literal string: ${KeychainErrorCodes}Error */ String
  }
}
