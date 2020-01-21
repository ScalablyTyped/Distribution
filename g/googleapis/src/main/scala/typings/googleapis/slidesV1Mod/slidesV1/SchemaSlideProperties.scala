package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page that are only relevant for pages with page_type
  * SLIDE.
  */
@js.native
trait SchemaSlideProperties extends js.Object {
  /**
    * The object ID of the layout that this slide is based on. This property is
    * read-only.
    */
  var layoutObjectId: js.UndefOr[String] = js.native
  /**
    * The object ID of the master that this slide is based on. This property is
    * read-only.
    */
  var masterObjectId: js.UndefOr[String] = js.native
  /**
    * The notes page that this slide is associated with. It defines the visual
    * appearance of a notes page when printing or exporting slides with speaker
    * notes. A notes page inherits properties from the notes master. The
    * placeholder shape with type BODY on the notes page contains the speaker
    * notes for this slide. The ID of this shape is identified by the
    * speakerNotesObjectId field. The notes page is read-only except for the
    * text content and styles of the speaker notes shape. This property is
    * read-only.
    */
  var notesPage: js.UndefOr[SchemaPage] = js.native
}

object SchemaSlideProperties {
  @scala.inline
  def apply(layoutObjectId: String = null, masterObjectId: String = null, notesPage: SchemaPage = null): SchemaSlideProperties = {
    val __obj = js.Dynamic.literal()
    if (layoutObjectId != null) __obj.updateDynamic("layoutObjectId")(layoutObjectId.asInstanceOf[js.Any])
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId.asInstanceOf[js.Any])
    if (notesPage != null) __obj.updateDynamic("notesPage")(notesPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSlideProperties]
  }
}

