package typings.libp2pKeychain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @js.native
  sealed trait codes extends StObject
  @JSImport("@libp2p/keychain/dist/src/errors", "codes")
  @js.native
  object codes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[codes & String] = js.native
    
    @js.native
    sealed trait ERR_CANNOT_READ_KEY
      extends StObject
         with codes
    /* "ERR_CANNOT_READ_KEY" */ val ERR_CANNOT_READ_KEY: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_CANNOT_READ_KEY & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_KEY_NAME
      extends StObject
         with codes
    /* "ERR_INVALID_KEY_NAME" */ val ERR_INVALID_KEY_NAME: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_KEY_NAME & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_KEY_SIZE
      extends StObject
         with codes
    /* "ERR_INVALID_KEY_SIZE" */ val ERR_INVALID_KEY_SIZE: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_KEY_SIZE & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_KEY_TYPE
      extends StObject
         with codes
    /* "ERR_INVALID_KEY_TYPE" */ val ERR_INVALID_KEY_TYPE: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_KEY_TYPE & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_NEW_PASS_TYPE
      extends StObject
         with codes
    /* "ERR_INVALID_NEW_PASS_TYPE" */ val ERR_INVALID_NEW_PASS_TYPE: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_NEW_PASS_TYPE & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_OLD_PASS_TYPE
      extends StObject
         with codes
    /* "ERR_INVALID_OLD_PASS_TYPE" */ val ERR_INVALID_OLD_PASS_TYPE: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_OLD_PASS_TYPE & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_PARAMETERS
      extends StObject
         with codes
    /* "ERR_INVALID_PARAMETERS" */ val ERR_INVALID_PARAMETERS: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_PARAMETERS & String = js.native
    
    @js.native
    sealed trait ERR_INVALID_PASS_LENGTH
      extends StObject
         with codes
    /* "ERR_INVALID_PASS_LENGTH" */ val ERR_INVALID_PASS_LENGTH: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_INVALID_PASS_LENGTH & String = js.native
    
    @js.native
    sealed trait ERR_KEY_ALREADY_EXISTS
      extends StObject
         with codes
    /* "ERR_KEY_ALREADY_EXISTS" */ val ERR_KEY_ALREADY_EXISTS: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_KEY_ALREADY_EXISTS & String = js.native
    
    @js.native
    sealed trait ERR_KEY_NOT_FOUND
      extends StObject
         with codes
    /* "ERR_KEY_NOT_FOUND" */ val ERR_KEY_NOT_FOUND: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_KEY_NOT_FOUND & String = js.native
    
    @js.native
    sealed trait ERR_MISSING_PRIVATE_KEY
      extends StObject
         with codes
    /* "ERR_MISSING_PRIVATE_KEY" */ val ERR_MISSING_PRIVATE_KEY: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_MISSING_PRIVATE_KEY & String = js.native
    
    @js.native
    sealed trait ERR_NEW_KEY_NAME_INVALID
      extends StObject
         with codes
    /* "ERR_NEW_KEY_NAME_INVALID" */ val ERR_NEW_KEY_NAME_INVALID: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_NEW_KEY_NAME_INVALID & String = js.native
    
    @js.native
    sealed trait ERR_OLD_KEY_NAME_INVALID
      extends StObject
         with codes
    /* "ERR_OLD_KEY_NAME_INVALID" */ val ERR_OLD_KEY_NAME_INVALID: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_OLD_KEY_NAME_INVALID & String = js.native
    
    @js.native
    sealed trait ERR_PASSWORD_REQUIRED
      extends StObject
         with codes
    /* "ERR_PASSWORD_REQUIRED" */ val ERR_PASSWORD_REQUIRED: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_PASSWORD_REQUIRED & String = js.native
    
    @js.native
    sealed trait ERR_PEM_REQUIRED
      extends StObject
         with codes
    /* "ERR_PEM_REQUIRED" */ val ERR_PEM_REQUIRED: typings.libp2pKeychain.distSrcErrorsMod.codes.ERR_PEM_REQUIRED & String = js.native
  }
}
