package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagVote extends js.Object {
  var author: java.lang.String
  var downs: scala.Double
  var name: java.lang.String
  var ups: scala.Double
}

object TagVote {
  @scala.inline
  def apply(author: java.lang.String, downs: scala.Double, name: java.lang.String, ups: scala.Double): TagVote = {
    val __obj = js.Dynamic.literal(author = author, downs = downs, name = name, ups = ups)
  
    __obj.asInstanceOf[TagVote]
  }
}

