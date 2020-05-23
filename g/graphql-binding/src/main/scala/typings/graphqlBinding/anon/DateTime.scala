package typings.graphqlBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  var Boolean: String
  var DateTime: String
  var Float: String
  var ID: String
  var Int: String
  var Json: String
  var String: java.lang.String
}

object DateTime {
  @scala.inline
  def apply(
    Boolean: String,
    DateTime: String,
    Float: String,
    ID: String,
    Int: String,
    Json: String,
    String: String
  ): DateTime = {
    val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], Json = Json.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
}

