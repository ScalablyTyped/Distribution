package typings.insight.insightMod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackage extends js.Object {
  var name: String
  var version: String
}

object IPackage {
  @scala.inline
  def apply(name: String, version: String): IPackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPackage]
  }
}

