package typings.mathjs.mod

import org.scalablytyped.runtime.Instantiable2
import typings.std.TransferFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionNodeCtor
  extends StObject
     with Instantiable2[
      /* fn */ js.Object, 
      /* args */ SymbolNode, 
      FunctionNode[TransferFunction, js.Array[MathNode]]
    ] {
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def onUndefinedFunction(name: String): Any = js.native
}
