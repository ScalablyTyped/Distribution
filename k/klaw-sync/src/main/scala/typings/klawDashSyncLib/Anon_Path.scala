package typings
package klawDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  def readdirSync(path: java.lang.String): js.Array[java.lang.String]
  def statSync(path: java.lang.String): nodeLib.fsMod.Stats
}

object Anon_Path {
  @scala.inline
  def apply(
    readdirSync: java.lang.String => js.Array[java.lang.String],
    statSync: java.lang.String => nodeLib.fsMod.Stats
  ): Anon_Path = {
    val __obj = js.Dynamic.literal(readdirSync = js.Any.fromFunction1(readdirSync), statSync = js.Any.fromFunction1(statSync))
  
    __obj.asInstanceOf[Anon_Path]
  }
}

