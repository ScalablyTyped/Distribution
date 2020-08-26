package typings.keystonejsAdapterMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongooseAdaptorOptions extends js.Object {
  var listAdapterClass: js.UndefOr[js.Any] = js.native
  var mongoUri: String = js.native
}

object MongooseAdaptorOptions {
  @scala.inline
  def apply(mongoUri: String): MongooseAdaptorOptions = {
    val __obj = js.Dynamic.literal(mongoUri = mongoUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongooseAdaptorOptions]
  }
  @scala.inline
  implicit class MongooseAdaptorOptionsOps[Self <: MongooseAdaptorOptions] (val x: Self) extends AnyVal {
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
    def setMongoUri(value: String): Self = this.set("mongoUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setListAdapterClass(value: js.Any): Self = this.set("listAdapterClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListAdapterClass: Self = this.set("listAdapterClass", js.undefined)
  }
  
}

