package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: scala.Double
  var fileDeleted: scala.Boolean
  var matched: scala.Double
  var unchecked: scala.Double
  var unmatched: scala.Double
  var updated: scala.Double
}

object Anon_Added {
  @scala.inline
  def apply(
    added: scala.Double,
    fileDeleted: scala.Boolean,
    matched: scala.Double,
    unchecked: scala.Double,
    unmatched: scala.Double,
    updated: scala.Double
  ): Anon_Added = {
    val __obj = js.Dynamic.literal(added = added, fileDeleted = fileDeleted, matched = matched, unchecked = unchecked, unmatched = unmatched, updated = updated)
  
    __obj.asInstanceOf[Anon_Added]
  }
}

