package typings.jsdevtoolsReaddirEnhanced.typesPublicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends js.Object {
  
  /**
    * Returns filesystem information about a symlink.
    */
  def lstat(path: String, callback: Callback[typings.node.fsMod.Stats]): Unit = js.native
  
  /**
    * Returns the names of files in a directory.
    */
  def readdir(path: String, callback: Callback[js.Array[String]]): Unit = js.native
  
  /**
    * Returns filesystem information about a directory entry.
    */
  def stat(path: String, callback: Callback[typings.node.fsMod.Stats]): Unit = js.native
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
  
  @scala.inline
  implicit class FileSystemOps[Self <: FileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLstat(value: (String, Callback[typings.node.fsMod.Stats]) => Unit): Self = this.set("lstat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReaddir(value: (String, Callback[js.Array[String]]) => Unit): Self = this.set("readdir", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStat(value: (String, Callback[typings.node.fsMod.Stats]) => Unit): Self = this.set("stat", js.Any.fromFunction2(value))
  }
}
