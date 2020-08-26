package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleapis.anon.Generation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compose request.
  */
@js.native
trait SchemaComposeRequest extends js.Object {
  /**
    * Properties of the resulting object
    */
  var destination: js.UndefOr[SchemaObject] = js.native
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of source objects that will be concatenated into a single
    * object.
    */
  var sourceObjects: js.UndefOr[js.Array[Generation]] = js.native
}

object SchemaComposeRequest {
  @scala.inline
  def apply(): SchemaComposeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComposeRequest]
  }
  @scala.inline
  implicit class SchemaComposeRequestOps[Self <: SchemaComposeRequest] (val x: Self) extends AnyVal {
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
    def setDestination(value: SchemaObject): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSourceObjectsVarargs(value: Generation*): Self = this.set("sourceObjects", js.Array(value :_*))
    @scala.inline
    def setSourceObjects(value: js.Array[Generation]): Self = this.set("sourceObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceObjects: Self = this.set("sourceObjects", js.undefined)
  }
  
}

