package typings.jestDashDiff

import typings.jestDashDiff.buildPrintDiffsMod._StringDiffResult
import typings.jestDashDiff.jestDashDiffBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnnotatedDiff extends _StringDiffResult {
  var annotatedDiff: String
  var isMultiline: `true`
}

object Anon_AnnotatedDiff {
  @scala.inline
  def apply(annotatedDiff: String, isMultiline: `true`): Anon_AnnotatedDiff = {
    val __obj = js.Dynamic.literal(annotatedDiff = annotatedDiff.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AnnotatedDiff]
  }
}

