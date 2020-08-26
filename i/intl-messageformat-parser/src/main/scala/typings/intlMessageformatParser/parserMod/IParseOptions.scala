package typings.intlMessageformatParser.parserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParseOptions
  extends /* key */ StringDictionary[js.Any] {
  var filename: js.UndefOr[String] = js.native
  var startRule: js.UndefOr[String] = js.native
  var tracer: js.UndefOr[js.Any] = js.native
}

object IParseOptions {
  @scala.inline
  def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  @scala.inline
  implicit class IParseOptionsOps[Self <: IParseOptions] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setStartRule(value: String): Self = this.set("startRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRule: Self = this.set("startRule", js.undefined)
    @scala.inline
    def setTracer(value: js.Any): Self = this.set("tracer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracer: Self = this.set("tracer", js.undefined)
  }
  
}

