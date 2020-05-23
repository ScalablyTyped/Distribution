package typings.graphqlBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object {
  var Boolean: String
  var DateTime: String
  var Float: String
  var ID: String
  var Int: String
  var String: java.lang.String
}

object Boolean {
  @scala.inline
  def apply(Boolean: String, DateTime: String, Float: String, ID: String, Int: String, String: String): Boolean = {
    val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
}

