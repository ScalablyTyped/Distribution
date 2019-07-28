package typings.insight.insightMod.insightNs

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
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[IPackage]
  }
}

