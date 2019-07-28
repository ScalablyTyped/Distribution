package typings.iconDashGen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ico extends js.Object {
  var ico: js.Array[Double]
  var name: String
  var sizes: js.Array[Double]
}

object Anon_Ico {
  @scala.inline
  def apply(ico: js.Array[Double], name: String, sizes: js.Array[Double]): Anon_Ico = {
    val __obj = js.Dynamic.literal(ico = ico, name = name, sizes = sizes)
  
    __obj.asInstanceOf[Anon_Ico]
  }
}

