package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of raw indices to remove from a local list.
  */
@js.native
trait SchemaRawIndices extends js.Object {
  /**
    * The indices to remove from a lexicographically-sorted local list.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaRawIndices {
  @scala.inline
  def apply(): SchemaRawIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRawIndices]
  }
  @scala.inline
  implicit class SchemaRawIndicesOps[Self <: SchemaRawIndices] (val x: Self) extends AnyVal {
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
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
  }
  
}

