package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var excluded_permissions: js.Array[String]
  var features: js.Array[_]
  var interactions: FollowingBoolean
  var permissions: js.Array[_]
}

object Features {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    features: js.Array[_],
    interactions: FollowingBoolean,
    permissions: js.Array[_]
  ): Features = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

