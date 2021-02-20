package typings.jupyterlabServices

import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.MessageType
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/serialize", "deserialize")
  @js.native
  def deserialize(data: String): IMessage[MessageType] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/serialize", "deserialize")
  @js.native
  def deserialize(data: ArrayBuffer): IMessage[MessageType] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/serialize", "serialize")
  @js.native
  def serialize(msg: IMessage[MessageType]): String | ArrayBuffer = js.native
}
