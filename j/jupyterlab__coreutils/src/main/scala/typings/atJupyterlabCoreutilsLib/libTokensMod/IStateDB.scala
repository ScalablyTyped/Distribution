package typings
package atJupyterlabCoreutilsLib.libTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateDB[T /* <: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue */]
  extends atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[T, T, java.lang.String] {
  /**
    * Return a serialized copy of the state database's entire contents.
    *
    * @returns A promise that bears the database contents as JSON.
    */
  def toJSON(): js.Promise[org.scalablytyped.runtime.StringDictionary[T]] = js.native
}

