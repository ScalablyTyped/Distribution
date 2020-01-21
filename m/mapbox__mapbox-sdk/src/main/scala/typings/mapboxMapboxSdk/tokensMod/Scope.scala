package typings.mapboxMapboxSdk.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var description: String
  var id: String
  var public: Boolean
}

object Scope {
  @scala.inline
  def apply(description: String, id: String, public: Boolean): Scope = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scope]
  }
}

