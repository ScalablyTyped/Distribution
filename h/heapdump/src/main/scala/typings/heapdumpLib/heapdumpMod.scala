package typings
package heapdumpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heapdump", JSImport.Namespace)
@js.native
object heapdumpMod extends js.Object {
  def writeSnapshot(): scala.Unit = js.native
  def writeSnapshot(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* filename */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def writeSnapshot(dumpFileName: java.lang.String): scala.Unit = js.native
  def writeSnapshot(
    dumpFileName: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* filename */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

