package typings.jsdevtoolsReaddirEnhanced.typesPublicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  /**
    * Returns filesystem information about a symlink.
    */
  def lstat(path: String, callback: Callback[typings.node.fsMod.Stats]): Unit
  /**
    * Returns the names of files in a directory.
    */
  def readdir(path: String, callback: Callback[js.Array[String]]): Unit
  /**
    * Returns filesystem information about a directory entry.
    */
  def stat(path: String, callback: Callback[typings.node.fsMod.Stats]): Unit
}

object FileSystem {
  @scala.inline
  def apply(
    lstat: (String, Callback[typings.node.fsMod.Stats]) => Unit,
    readdir: (String, Callback[js.Array[String]]) => Unit,
    stat: (String, Callback[typings.node.fsMod.Stats]) => Unit
  ): FileSystem = {
    val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2(lstat), readdir = js.Any.fromFunction2(readdir), stat = js.Any.fromFunction2(stat))
  
    __obj.asInstanceOf[FileSystem]
  }
}

