package typings.jestTransform.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  var instrument: Boolean
}

object TransformOptions {
  @scala.inline
  def apply(instrument: Boolean): TransformOptions = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformOptions]
  }
}

