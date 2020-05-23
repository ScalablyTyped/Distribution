package typings.klawSync.anon

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirSync extends js.Object {
  def readdirSync(path: String): js.Array[String]
  def statSync(path: String): Stats
}

object ReaddirSync {
  @scala.inline
  def apply(readdirSync: String => js.Array[String], statSync: String => Stats): ReaddirSync = {
    val __obj = js.Dynamic.literal(readdirSync = js.Any.fromFunction1(readdirSync), statSync = js.Any.fromFunction1(statSync))
    __obj.asInstanceOf[ReaddirSync]
  }
}

