package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A visual element rendered on a page.
  */
@js.native
trait SchemaPageElement extends js.Object {
  /**
    * The description of the page element. Combined with title to display alt
    * text.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A collection of page elements joined as a single unit.
    */
  var elementGroup: js.UndefOr[SchemaGroup] = js.native
  /**
    * An image page element.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * A line page element.
    */
  var line: js.UndefOr[SchemaLine] = js.native
  /**
    * The object ID for this page element. Object IDs used by
    * google.apps.slides.v1.Page and google.apps.slides.v1.PageElement share
    * the same namespace.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * A generic shape.
    */
  var shape: js.UndefOr[SchemaShape] = js.native
  /**
    * A linked chart embedded from Google Sheets. Unlinked charts are
    * represented as images.
    */
  var sheetsChart: js.UndefOr[SchemaSheetsChart] = js.native
  /**
    * The size of the page element.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * A table page element.
    */
  var table: js.UndefOr[SchemaTable] = js.native
  /**
    * The title of the page element. Combined with description to display alt
    * text.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The transform of the page element.  The visual appearance of the page
    * element is determined by its absolute transform. To compute the absolute
    * transform, preconcatenate a page element&#39;s transform with the
    * transforms of all of its parent groups. If the page element is not in a
    * group, its absolute transform is the same as the value in this field. The
    * initial transform for the newly created Group is always the identity
    * transform.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
  /**
    * A video page element.
    */
  var video: js.UndefOr[SchemaVideo] = js.native
  /**
    * A word art page element.
    */
  var wordArt: js.UndefOr[SchemaWordArt] = js.native
}

object SchemaPageElement {
  @scala.inline
  def apply(
    description: String = null,
    elementGroup: SchemaGroup = null,
    image: SchemaImage = null,
    line: SchemaLine = null,
    objectId: String = null,
    shape: SchemaShape = null,
    sheetsChart: SchemaSheetsChart = null,
    size: SchemaSize = null,
    table: SchemaTable = null,
    title: String = null,
    transform: SchemaAffineTransform = null,
    video: SchemaVideo = null,
    wordArt: SchemaWordArt = null
  ): SchemaPageElement = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (elementGroup != null) __obj.updateDynamic("elementGroup")(elementGroup.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (sheetsChart != null) __obj.updateDynamic("sheetsChart")(sheetsChart.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (wordArt != null) __obj.updateDynamic("wordArt")(wordArt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageElement]
  }
}

