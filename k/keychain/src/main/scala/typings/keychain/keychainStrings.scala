package typings.keychain

import typings.keychain.mod.keychainTypes.KeychainErrorCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keychainStrings {
  
  @js.native
  sealed trait NoAccountProvided
    extends StObject
       with KeychainErrorCodes
  inline def NoAccountProvided: NoAccountProvided = "NoAccountProvided".asInstanceOf[NoAccountProvided]
  
  @js.native
  sealed trait NoPasswordProvided
    extends StObject
       with KeychainErrorCodes
  inline def NoPasswordProvided: NoPasswordProvided = "NoPasswordProvided".asInstanceOf[NoPasswordProvided]
  
  @js.native
  sealed trait NoServiceProvided
    extends StObject
       with KeychainErrorCodes
  inline def NoServiceProvided: NoServiceProvided = "NoServiceProvided".asInstanceOf[NoServiceProvided]
  
  @js.native
  sealed trait PasswordNotFound
    extends StObject
       with KeychainErrorCodes
  inline def PasswordNotFound: PasswordNotFound = "PasswordNotFound".asInstanceOf[PasswordNotFound]
  
  @js.native
  sealed trait ServiceFailure
    extends StObject
       with KeychainErrorCodes
  inline def ServiceFailure: ServiceFailure = "ServiceFailure".asInstanceOf[ServiceFailure]
  
  @js.native
  sealed trait UnsupportedPlatform
    extends StObject
       with KeychainErrorCodes
  inline def UnsupportedPlatform: UnsupportedPlatform = "UnsupportedPlatform".asInstanceOf[UnsupportedPlatform]
  
  @js.native
  sealed trait generic extends StObject
  inline def generic: generic = "generic".asInstanceOf[generic]
  
  @js.native
  sealed trait internet extends StObject
  inline def internet: internet = "internet".asInstanceOf[internet]
}
