package typings.grpcGrpcJs.callCredentialsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldOAuth2Client extends OAuth2Client {
  def getRequestMetadata(
    url: String,
    callback: js.Function2[/* err */ Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]
  ): Unit = js.native
}

object OldOAuth2Client {
  @scala.inline
  def apply(
    getRequestMetadata: (String, js.Function2[/* err */ Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]) => Unit
  ): OldOAuth2Client = {
    val __obj = js.Dynamic.literal(getRequestMetadata = js.Any.fromFunction2(getRequestMetadata))
    __obj.asInstanceOf[OldOAuth2Client]
  }
  @scala.inline
  implicit class OldOAuth2ClientOps[Self <: OldOAuth2Client] (val x: Self) extends AnyVal {
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
    def setGetRequestMetadata(
      value: (String, js.Function2[/* err */ Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]) => Unit
    ): Self = this.set("getRequestMetadata", js.Any.fromFunction2(value))
  }
  
}

