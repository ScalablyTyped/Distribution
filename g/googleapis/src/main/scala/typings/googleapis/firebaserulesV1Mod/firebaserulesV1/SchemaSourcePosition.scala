package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Position in the `Source` content including its line, column number, and an
  * index of the `File` in the `Source` message. Used for debug purposes.
  */
@js.native
trait SchemaSourcePosition extends js.Object {
  /**
    * First column on the source line associated with the source fragment.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * Name of the `File`.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Line number of the source fragment. 1-based.
    */
  var line: js.UndefOr[Double] = js.native
}

object SchemaSourcePosition {
  @scala.inline
  def apply(): SchemaSourcePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourcePosition]
  }
  @scala.inline
  implicit class SchemaSourcePositionOps[Self <: SchemaSourcePosition] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

