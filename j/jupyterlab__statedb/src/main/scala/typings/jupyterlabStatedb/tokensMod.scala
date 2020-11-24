package typings.jupyterlabStatedb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statedb/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  
  @js.native
  trait IStateDB[T /* <: ReadonlyPartialJSONValue */] extends IDataConnector[T, T, String, String] {
    
    /**
      * Return a serialized copy of the state database's entire contents.
      *
      * @returns A promise that bears the database contents as JSON.
      */
    def toJSON(): js.Promise[StringDictionary[T]] = js.native
  }
  @js.native
  object IStateDB extends TopLevel[Token[IStateDB[ReadonlyPartialJSONValue]]]
}
