package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds and removes POSIX capabilities from running containers.
  */
@js.native
trait SchemaCapabilities extends js.Object {
  /**
    * Added capabilities +optional
    */
  var add: js.UndefOr[js.Array[String]] = js.native
  /**
    * Removed capabilities +optional
    */
  var drop: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCapabilities {
  @scala.inline
  def apply(): SchemaCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapabilities]
  }
  @scala.inline
  implicit class SchemaCapabilitiesOps[Self <: SchemaCapabilities] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: String*): Self = this.set("add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: js.Array[String]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setDropVarargs(value: String*): Self = this.set("drop", js.Array(value :_*))
    @scala.inline
    def setDrop(value: js.Array[String]): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
  }
  
}

