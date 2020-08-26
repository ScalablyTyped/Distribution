package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create notes in batch.
  */
@js.native
trait SchemaBatchCreateNotesRequest extends js.Object {
  /**
    * The notes to create. Max allowed length is 1000.
    */
  var notes: js.UndefOr[StringDictionary[SchemaNote]] = js.native
}

object SchemaBatchCreateNotesRequest {
  @scala.inline
  def apply(): SchemaBatchCreateNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateNotesRequest]
  }
  @scala.inline
  implicit class SchemaBatchCreateNotesRequestOps[Self <: SchemaBatchCreateNotesRequest] (val x: Self) extends AnyVal {
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
    def setNotes(value: StringDictionary[SchemaNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
  
}

