package typings.jsdevtoolsReaddirEnhanced.anon

import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.FileSystem> */
trait PartialFileSystem extends js.Object {
  var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
  var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.undefined
  var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
}

object PartialFileSystem {
  @scala.inline
  def apply(
    lstat: (/* path */ String, /* callback */ Callback[Stats]) => Unit = null,
    readdir: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit = null,
    stat: (/* path */ String, /* callback */ Callback[Stats]) => Unit = null
  ): PartialFileSystem = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(js.Any.fromFunction2(lstat))
    if (readdir != null) __obj.updateDynamic("readdir")(js.Any.fromFunction2(readdir))
    if (stat != null) __obj.updateDynamic("stat")(js.Any.fromFunction2(stat))
    __obj.asInstanceOf[PartialFileSystem]
  }
}

