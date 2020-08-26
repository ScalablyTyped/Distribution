package typings.jsdevtoolsReaddirEnhanced.anon

import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.FileSystem> */
@js.native
trait PartialFileSystem extends js.Object {
  var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.native
  var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.native
  var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.native
}

object PartialFileSystem {
  @scala.inline
  def apply(): PartialFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFileSystem]
  }
  @scala.inline
  implicit class PartialFileSystemOps[Self <: PartialFileSystem] (val x: Self) extends AnyVal {
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
    def setLstat(value: (/* path */ String, /* callback */ Callback[Stats]) => Unit): Self = this.set("lstat", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLstat: Self = this.set("lstat", js.undefined)
    @scala.inline
    def setReaddir(value: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit): Self = this.set("readdir", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReaddir: Self = this.set("readdir", js.undefined)
    @scala.inline
    def setStat(value: (/* path */ String, /* callback */ Callback[Stats]) => Unit): Self = this.set("stat", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
  }
  
}

