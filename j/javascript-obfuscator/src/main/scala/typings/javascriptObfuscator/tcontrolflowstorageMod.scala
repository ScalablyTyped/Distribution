package typings.javascriptObfuscator

import typings.javascriptObfuscator.icustomnodeMod.ICustomNode
import typings.javascriptObfuscator.imapstorageMod.IMapStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/storages/TControlFlowStorage", JSImport.Namespace)
@js.native
object tcontrolflowstorageMod extends js.Object {
  type TControlFlowStorage = IMapStorage[String, ICustomNode]
}

