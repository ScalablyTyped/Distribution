package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Change indicates the most recent state of an element.
  */
@js.native
trait SchemaGoogleWatcherV1Change extends js.Object {
  /**
    * If true, this Change is followed by more Changes that are in the same
    * group as this Change.
    */
  var continued: js.UndefOr[Boolean] = js.native
  /**
    * The actual change data. This field is present only when `state() ==
    * EXISTS` or `state() == ERROR`. Please see google.protobuf.Any about how
    * to use the Any type.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Name of the element, interpreted relative to the entity&#39;s actual
    * name. &quot;&quot; refers to the entity itself. The element name is a
    * valid UTF-8 string.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * If present, provides a compact representation of all the messages that
    * have been received by the caller for the given entity, e.g., it could be
    * a sequence number or a multi-part timestamp/version vector. This marker
    * can be provided in the Request message, allowing the caller to resume the
    * stream watching at a specific point without fetching the initial state.
    */
  var resumeMarker: js.UndefOr[String] = js.native
  /**
    * The state of the `element`.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleWatcherV1Change {
  @scala.inline
  def apply(): SchemaGoogleWatcherV1Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleWatcherV1Change]
  }
  @scala.inline
  implicit class SchemaGoogleWatcherV1ChangeOps[Self <: SchemaGoogleWatcherV1Change] (val x: Self) extends AnyVal {
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
    def setContinued(value: Boolean): Self = this.set("continued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinued: Self = this.set("continued", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setResumeMarker(value: String): Self = this.set("resumeMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResumeMarker: Self = this.set("resumeMarker", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

