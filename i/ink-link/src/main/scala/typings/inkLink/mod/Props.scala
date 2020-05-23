package typings.inkLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val fallback: js.UndefOr[Boolean] = js.undefined
  /**
  	The URL to link to.
  	@example
  	```
  	<Link url="https://sindresorhus.com">
  		My <Color cyan>Website</Color>
  	</Link>
  	```
  	*/
  val url: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(fallback: js.UndefOr[Boolean] = js.undefined, url: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

