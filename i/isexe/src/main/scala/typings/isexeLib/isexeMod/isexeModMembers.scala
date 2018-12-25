package typings
package isexeLib.isexeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isexe", JSImport.Namespace)
@js.native
object isexeModMembers extends js.Object {
  def apply(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def apply(
    path: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
      /* isExe */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(path: java.lang.String, options: isexeLib.isexeMod.isExeNs.Options): js.Promise[scala.Boolean] = js.native
  def apply(
    path: java.lang.String,
    options: isexeLib.isexeMod.isExeNs.Options,
    callback: js.Function2[
      /* error */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
      /* isExe */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sync(path: java.lang.String): scala.Boolean = js.native
  def sync(path: java.lang.String, options: isexeLib.isexeMod.isExeNs.Options): scala.Boolean = js.native
}

