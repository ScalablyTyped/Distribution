package typings.jupyterlabServices

import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.MessageType
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(data: String): IMessage[MessageType] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[IMessage[MessageType]]
  inline def deserialize(data: ArrayBuffer): IMessage[MessageType] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[IMessage[MessageType]]
  
  inline def serialize(msg: IMessage[MessageType]): String | ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(msg.asInstanceOf[js.Any]).asInstanceOf[String | ArrayBuffer]
}
