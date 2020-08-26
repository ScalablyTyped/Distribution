package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topic resource.
  */
@js.native
trait SchemaTopic extends js.Object {
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
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
  def apply(): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopic]
  }
  @scala.inline
  implicit class SchemaTopicOps[Self <: SchemaTopic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

