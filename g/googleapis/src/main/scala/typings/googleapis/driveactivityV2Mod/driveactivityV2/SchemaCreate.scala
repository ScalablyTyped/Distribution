package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was created.
  */
@js.native
trait SchemaCreate extends js.Object {
  /**
    * If present, indicates the object was created by copying an existing Drive
    * object.
    */
  var copy: js.UndefOr[SchemaCopy] = js.native
  /**
    * If present, indicates the object was newly created (e.g. as a blank
    * document), not derived from a Drive object or external object.
    */
  var `new`: js.UndefOr[SchemaNew] = js.native
  /**
    * If present, indicates the object originated externally and was uploaded
    * to Drive.
    */
  var upload: js.UndefOr[SchemaUpload] = js.native
}

object SchemaCreate {
  @scala.inline
  def apply(copy: SchemaCopy = null, `new`: SchemaNew = null, upload: SchemaUpload = null): SchemaCreate = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (`new` != null) __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreate]
  }
}

