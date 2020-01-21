package typings.javascriptObfuscator

import typings.javascriptObfuscator.icustomnodegroupMod.ICustomNodeGroup
import typings.javascriptObfuscator.imapstorageMod.IMapStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/storages/TCustomNodeGroupStorage", JSImport.Namespace)
@js.native
object tcustomnodegroupstorageMod extends js.Object {
  type TCustomNodeGroupStorage = IMapStorage[String, ICustomNodeGroup]
}

