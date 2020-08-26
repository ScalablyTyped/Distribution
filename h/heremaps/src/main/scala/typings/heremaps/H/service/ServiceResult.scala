package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.anon.Context
import typings.heremaps.anon.Isolines
import typings.heremaps.anon.Items
import typings.heremaps.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
@js.native
trait ServiceResult
  extends /* key */ StringDictionary[js.Any] {
  var Response: js.UndefOr[Isolines] = js.native
  var response: js.UndefOr[Language] = js.native
  var results: js.UndefOr[Items] = js.native
  var search: js.UndefOr[Context] = js.native
}

object ServiceResult {
  @scala.inline
  def apply(): ServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceResult]
  }
  @scala.inline
  implicit class ServiceResultOps[Self <: ServiceResult] (val x: Self) extends AnyVal {
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
    def setResponse(value: Isolines): Self = this.set("Response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("Response", js.undefined)
    @scala.inline
    def setResults(value: Items): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setSearch(value: Context): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
  
}

