package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.hashWasmStrings.binary
import typings.hashWasm.hashWasmStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Calculate extends StObject {
    
    def calculate(data: IDataType): String = js.native
    def calculate(data: IDataType, initParam: Any): String = js.native
    def calculate(data: IDataType, initParam: Any, digestParam: Any): String = js.native
    def calculate(data: IDataType, initParam: Unit, digestParam: Any): String = js.native
    
    def digest(outputType: hex | binary): js.typedarray.Uint8Array | String = js.native
    def digest(outputType: hex | binary, padding: Double): js.typedarray.Uint8Array | String = js.native
    
    def getExports(): Any = js.native
    
    def getMemory(): js.typedarray.Uint8Array = js.native
    
    var hashLength: Double = js.native
    
    def init(): Unit = js.native
    def init(bits: Double): Unit = js.native
    
    def load(state: js.typedarray.Uint8Array): Unit = js.native
    
    def save(): js.typedarray.Uint8Array = js.native
    
    def setMemorySize(totalSize: Double): Unit = js.native
    
    def update(data: IDataType): Unit = js.native
    
    def writeMemory(data: js.typedarray.Uint8Array): Unit = js.native
    def writeMemory(data: js.typedarray.Uint8Array, offset: Double): Unit = js.native
  }
}
