package typings.mathjs.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionNodeCtor
  extends StObject
     with Instantiable2[
      /* fn */ js.Object, 
      /* args */ js.Array[MathNode], 
      FunctionNode[js.Object, js.Array[MathNode]]
    ] {
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def onUndefinedFunction(name: String): Any = js.native
}
