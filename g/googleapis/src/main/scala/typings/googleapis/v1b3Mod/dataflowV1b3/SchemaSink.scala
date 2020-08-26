package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sink that records can be encoded and written to.
  */
@js.native
trait SchemaSink extends js.Object {
  /**
    * The codec to use to encode data written to the sink.
    */
  var codec: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The sink to write to, plus its parameters.
    */
  var spec: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaSink {
  @scala.inline
  def apply(): SchemaSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSink]
  }
  @scala.inline
  implicit class SchemaSinkOps[Self <: SchemaSink] (val x: Self) extends AnyVal {
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
    def setCodec(value: StringDictionary[js.Any]): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    @scala.inline
    def setSpec(value: StringDictionary[js.Any]): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
  
}

