package typings.jasmineDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consolidate extends js.Object {
  var consolidate: Boolean
  var report: Boolean
  var savePath: String
  var useDotNotation: Boolean
}

object Anon_Consolidate {
  @scala.inline
  def apply(consolidate: Boolean, report: Boolean, savePath: String, useDotNotation: Boolean): Anon_Consolidate = {
    val __obj = js.Dynamic.literal(consolidate = consolidate, report = report, savePath = savePath, useDotNotation = useDotNotation)
  
    __obj.asInstanceOf[Anon_Consolidate]
  }
}

