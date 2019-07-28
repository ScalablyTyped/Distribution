package typings.matterDashJs

import typings.matterDashJs.matterDashJsMod._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameVersion extends _Dependency {
  var name: String
  var version: String
}

object Anon_NameVersion {
  @scala.inline
  def apply(name: String, version: String): Anon_NameVersion = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[Anon_NameVersion]
  }
}

