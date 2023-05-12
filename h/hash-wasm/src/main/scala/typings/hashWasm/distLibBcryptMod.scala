package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.hashWasmStrings.binary
import typings.hashWasm.hashWasmStrings.encoded
import typings.hashWasm.hashWasmStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBcryptMod {
  
  @JSImport("hash-wasm/dist/lib/bcrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bcrypt[T /* <: BcryptOptions */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("bcrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def bcryptVerify(options: BcryptVerifyOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bcryptVerify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  trait BcryptOptions extends StObject {
    
    /**
      * Number of iterations to perform (4 - 31)
      */
    var costFactor: Double
    
    /**
      * Desired output type. Defaults to 'encoded'
      */
    var outputType: js.UndefOr[hex | binary | encoded] = js.undefined
    
    /**
      * Password to be hashed
      */
    var password: IDataType
    
    /**
      * Salt (16 bytes long - usually containing random bytes)
      */
    var salt: IDataType
  }
  object BcryptOptions {
    
    inline def apply(costFactor: Double, password: IDataType, salt: IDataType): BcryptOptions = {
      val __obj = js.Dynamic.literal(costFactor = costFactor.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[BcryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BcryptOptions] (val x: Self) extends AnyVal {
      
      inline def setCostFactor(value: Double): Self = StObject.set(x, "costFactor", value.asInstanceOf[js.Any])
      
      inline def setOutputType(value: hex | binary | encoded): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      inline def setPassword(value: IDataType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: IDataType): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends hash-wasm.hash-wasm/dist/lib/bcrypt.IBcryptOptionsBinary ? std.Uint8Array : string
    }}}
    */
  type BcryptReturnType[T] = js.typedarray.Uint8Array
  
  trait BcryptVerifyOptions extends StObject {
    
    /**
      * A previously generated bcrypt hash in the 'encoded' output format
      */
    var hash: String
    
    /**
      * Password to be verified
      */
    var password: IDataType
  }
  object BcryptVerifyOptions {
    
    inline def apply(hash: String, password: IDataType): BcryptVerifyOptions = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[BcryptVerifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BcryptVerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: IDataType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBcryptOptionsBinary extends StObject {
    
    var outputType: binary
  }
  object IBcryptOptionsBinary {
    
    inline def apply(): IBcryptOptionsBinary = {
      val __obj = js.Dynamic.literal(outputType = "binary")
      __obj.asInstanceOf[IBcryptOptionsBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBcryptOptionsBinary] (val x: Self) extends AnyVal {
      
      inline def setOutputType(value: binary): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    }
  }
}
