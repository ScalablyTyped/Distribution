package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page that are only relevant for pages with page_type
  * NOTES.
  */
@js.native
trait SchemaNotesProperties extends js.Object {
  /**
    * The object ID of the shape on this notes page that contains the speaker
    * notes for the corresponding slide. The actual shape may not always exist
    * on the notes page. Inserting text using this object ID will automatically
    * create the shape. In this case, the actual shape may have different
    * object ID. The `GetPresentation` or `GetPage` action will always return
    * the latest object ID.
    */
  var speakerNotesObjectId: js.UndefOr[String] = js.native
}

object SchemaNotesProperties {
  @scala.inline
  def apply(speakerNotesObjectId: String = null): SchemaNotesProperties = {
    val __obj = js.Dynamic.literal()
    if (speakerNotesObjectId != null) __obj.updateDynamic("speakerNotesObjectId")(speakerNotesObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotesProperties]
  }
}

