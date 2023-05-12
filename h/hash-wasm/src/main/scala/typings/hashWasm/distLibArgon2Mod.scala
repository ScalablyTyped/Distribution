package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.hashWasmStrings.binary
import typings.hashWasm.hashWasmStrings.encoded
import typings.hashWasm.hashWasmStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibArgon2Mod {
  
  @JSImport("hash-wasm/dist/lib/argon2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argon2Verify(options: Argon2VerifyOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2Verify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def argon2d[T /* <: IArgon2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2d")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def argon2i[T /* <: IArgon2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2i")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def argon2id[T /* <: IArgon2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2id")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends hash-wasm.hash-wasm/dist/lib/argon2.IArgon2OptionsBinary ? std.Uint8Array : string
    }}}
    */
  type Argon2ReturnType[T] = js.typedarray.Uint8Array
  
  trait Argon2VerifyOptions extends StObject {
    
    /**
      * A previously generated argon2 hash in the 'encoded' output format
      */
    var hash: String
    
    /**
      * Password to be verified
      */
    var password: IDataType
  }
  object Argon2VerifyOptions {
    
    inline def apply(hash: String, password: IDataType): Argon2VerifyOptions = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argon2VerifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argon2VerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: IDataType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArgon2Options extends StObject {
    
    /**
      * Output size in bytes
      */
    var hashLength: Double
    
    /**
      * Number of iterations to perform
      */
    var iterations: Double
    
    /**
      * Amount of memory to be used in kibibytes (1024 bytes)
      */
    var memorySize: Double
    
    /**
      * Desired output type. Defaults to 'hex'
      */
    var outputType: js.UndefOr[hex | binary | encoded] = js.undefined
    
    /**
      * Degree of parallelism
      */
    var parallelism: Double
    
    /**
      * Password (or message) to be hashed
      */
    var password: IDataType
    
    /**
      * Salt (usually containing random bytes)
      */
    var salt: IDataType
  }
  object IArgon2Options {
    
    inline def apply(
      hashLength: Double,
      iterations: Double,
      memorySize: Double,
      parallelism: Double,
      password: IDataType,
      salt: IDataType
    ): IArgon2Options = {
      val __obj = js.Dynamic.literal(hashLength = hashLength.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArgon2Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IArgon2Options] (val x: Self) extends AnyVal {
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
      
      inline def setOutputType(value: hex | binary | encoded): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: IDataType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: IDataType): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArgon2OptionsBinary extends StObject {
    
    var outputType: binary
  }
  object IArgon2OptionsBinary {
    
    inline def apply(): IArgon2OptionsBinary = {
      val __obj = js.Dynamic.literal(outputType = "binary")
      __obj.asInstanceOf[IArgon2OptionsBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IArgon2OptionsBinary] (val x: Self) extends AnyVal {
      
      inline def setOutputType(value: binary): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    }
  }
}
