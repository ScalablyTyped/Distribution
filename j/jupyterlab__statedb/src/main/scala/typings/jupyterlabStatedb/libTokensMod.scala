package typings.jupyterlabStatedb

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.luminoCoreutils.mod.Token
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @js.native
  trait IStateDB[T /* <: ReadonlyPartialJSONValue */]
    extends StObject
       with IDataConnector[T, T, String, String] {
    
    /**
      * Return a serialized copy of the state database's entire contents.
      *
      * @returns A promise that bears the database contents as JSON.
      */
    def toJSON(): js.Promise[StringDictionary[T]] = js.native
  }
  @JSImport("@jupyterlab/statedb/lib/tokens", "IStateDB")
  @js.native
  val IStateDB: Token[typings.jupyterlabStatedb.libTokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
}
