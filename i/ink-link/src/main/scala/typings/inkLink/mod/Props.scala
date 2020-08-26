package typings.inkLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
  	Determines whether the URL should be printed in parens after the text for unsupported terminals: `My website (https://sindresorhus.com)`.
  	@default true
  	@example
  	```
  	<Link url="https://sindresorhus.com" fallback={false}>
  		My <Color cyan>Website</Color>
  	</Link>
  	```
  	*/
  val fallback: js.UndefOr[Boolean] = js.native
  /**
  	The URL to link to.
  	@example
  	```
  	<Link url="https://sindresorhus.com">
  		My <Color cyan>Website</Color>
  	</Link>
  	```
  	*/
  val url: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setFallback(value: Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

