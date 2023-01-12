package typings.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedVmErrorsPbMod`.ArithmeticError.ArithmeticErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError")
@js.native
open class ArithmeticError () extends Message {
  
  def getErrorCode(): ArithmeticErrorType = js.native
  
  def setErrorCode(value: ArithmeticErrorType): Unit = js.native
}
/* static members */
object ArithmeticError {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ArithmeticErrorType extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.ArithmeticErrorType")
  @js.native
  object ArithmeticErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArithmeticErrorType & Double] = js.native
    
    @js.native
    sealed trait DIVISIONBYZERO
      extends StObject
         with ArithmeticErrorType
    /* 3 */ val DIVISIONBYZERO: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.ArithmeticError.ArithmeticErrorType.DIVISIONBYZERO & Double = js.native
    
    @js.native
    sealed trait OVERFLOW
      extends StObject
         with ArithmeticErrorType
    /* 2 */ val OVERFLOW: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.ArithmeticError.ArithmeticErrorType.OVERFLOW & Double = js.native
    
    @js.native
    sealed trait UNDERFLOW
      extends StObject
         with ArithmeticErrorType
    /* 1 */ val UNDERFLOW: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.ArithmeticError.ArithmeticErrorType.UNDERFLOW & Double = js.native
    
    @js.native
    sealed trait UNKNOWNARITHMETICERROR
      extends StObject
         with ArithmeticErrorType
    /* 0 */ val UNKNOWNARITHMETICERROR: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.ArithmeticError.ArithmeticErrorType.UNKNOWNARITHMETICERROR & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ArithmeticError = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ArithmeticError]
  
  inline def deserializeBinaryFromReader(message: ArithmeticError, reader: BinaryReader): ArithmeticError = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ArithmeticError]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: ArithmeticError, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: ArithmeticError): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var errorCode: ArithmeticErrorType
  }
  object AsObject {
    
    inline def apply(errorCode: ArithmeticErrorType): AsObject = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: ArithmeticErrorType): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
}
