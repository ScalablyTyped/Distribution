package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arc extends js.Object {
  var Arc: java.lang.String
  var BezierSeed: java.lang.String
  var Circle: java.lang.String
  var Line: java.lang.String
}

object Anon_Arc {
  @scala.inline
  def apply(
    Arc: java.lang.String,
    BezierSeed: java.lang.String,
    Circle: java.lang.String,
    Line: java.lang.String
  ): Anon_Arc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Arc")(Arc)
    __obj.updateDynamic("BezierSeed")(BezierSeed)
    __obj.updateDynamic("Circle")(Circle)
    __obj.updateDynamic("Line")(Line)
    __obj.asInstanceOf[Anon_Arc]
  }
}

