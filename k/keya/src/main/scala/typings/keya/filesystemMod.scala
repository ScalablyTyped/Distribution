package typings.keya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/filesystem", JSImport.Namespace)
@js.native
object filesystemMod extends js.Object {
  @js.native
  trait FileSystemStore
    extends typings.keya.storeMod.default {
    var file: String = js.native
  }
  
  @js.native
  class default () extends FileSystemStore
  
  /* static members */
  @js.native
  object default extends js.Object {
    def stores(): js.Promise[js.Array[FileSystemStore]] = js.native
  }
  
}

