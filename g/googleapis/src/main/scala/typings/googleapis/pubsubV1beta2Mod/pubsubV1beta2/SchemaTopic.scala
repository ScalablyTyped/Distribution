package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topic resource.
  */
@js.native
trait SchemaTopic extends js.Object {
  /**
    * The name of the topic. It must have the format
    * `&quot;projects/{project}/topics/{topic}&quot;`. `{topic}` must start
    * with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`),
    * dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`)
    * or percent signs (`%`). It must be between 3 and 255 characters in
    * length, and it must not start with `&quot;goog&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaTopic {
  @scala.inline
  def apply(name: String = null): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTopic]
  }
}

