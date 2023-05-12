package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.hashWasmStrings.binary
import typings.hashWasm.hashWasmStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibScryptMod {
  
  @JSImport("hash-wasm/dist/lib/scrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrypt[T /* <: ScryptOptions */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  trait IScryptOptionsBinary extends StObject {
    
    var outputType: binary
  }
  object IScryptOptionsBinary {
    
    inline def apply(): IScryptOptionsBinary = {
      val __obj = js.Dynamic.literal(outputType = "binary")
      __obj.asInstanceOf[IScryptOptionsBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScryptOptionsBinary] (val x: Self) extends AnyVal {
      
      inline def setOutputType(value: binary): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScryptOptions extends StObject {
    
    /**
      * Block size (8 is commonly used)
      */
    var blockSize: Double
    
    /**
      * CPU / memory cost - must be a power of 2 (e.g. 1024)
      */
    var costFactor: Double
    
    /**
      * Output size in bytes
      */
    var hashLength: Double
    
    /**
      * Output data type. Defaults to hexadecimal string
      */
    var outputType: js.UndefOr[hex | binary] = js.undefined
    
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
  object ScryptOptions {
    
    inline def apply(
      blockSize: Double,
      costFactor: Double,
      hashLength: Double,
      parallelism: Double,
      password: IDataType,
      salt: IDataType
    ): ScryptOptions = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], costFactor = costFactor.asInstanceOf[js.Any], hashLength = hashLength.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScryptOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setCostFactor(value: Double): Self = StObject.set(x, "costFactor", value.asInstanceOf[js.Any])
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setOutputType(value: hex | binary): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: IDataType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: IDataType): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends hash-wasm.hash-wasm/dist/lib/scrypt.IScryptOptionsBinary ? std.Uint8Array : string
    }}}
    */
  type ScryptReturnType[T] = js.typedarray.Uint8Array
}
