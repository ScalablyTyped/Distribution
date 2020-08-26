package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializer is information about an initializer that has not yet completed.
  */
@js.native
trait SchemaInitializer extends js.Object {
  /**
    * name of the process that is responsible for initializing this object.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaInitializer {
  @scala.inline
  def apply(): SchemaInitializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializer]
  }
  @scala.inline
  implicit class SchemaInitializerOps[Self <: SchemaInitializer] (val x: Self) extends AnyVal {
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
  }
  
}

