package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of all the NamedRanges in the document that share a given
  * name.
  */
@js.native
trait SchemaNamedRanges extends js.Object {
  /**
    * The name that all the named ranges share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The NamedRanges that share the same name.
    */
  var namedRanges: js.UndefOr[js.Array[SchemaNamedRange]] = js.native
}

object SchemaNamedRanges {
  @scala.inline
  def apply(): SchemaNamedRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRanges]
  }
  @scala.inline
  implicit class SchemaNamedRangesOps[Self <: SchemaNamedRanges] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamedRangesVarargs(value: SchemaNamedRange*): Self = this.set("namedRanges", js.Array(value :_*))
    @scala.inline
    def setNamedRanges(value: js.Array[SchemaNamedRange]): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
  }
  
}

