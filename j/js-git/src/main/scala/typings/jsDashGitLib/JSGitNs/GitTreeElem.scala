package typings
package jsDashGitLib.JSGitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeElem extends js.Object {
  var hash: java.lang.String
  var mode: scala.Double
  var name: java.lang.String
}

object GitTreeElem {
  @scala.inline
  def apply(hash: java.lang.String, mode: scala.Double, name: java.lang.String): GitTreeElem = {
    val __obj = js.Dynamic.literal(hash = hash, mode = mode, name = name)
  
    __obj.asInstanceOf[GitTreeElem]
  }
}

