package typings.hyphen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a hyphenation call.
  */
@js.native
trait HyphenationOptions extends js.Object {
  /**
    * A boolean indicating, if the hyphenation function should output debug info to the console.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * The value of the hyphen character that is inserted into the text.
    * @default \\u00AD
    */
  var hyphenChar: js.UndefOr[String] = js.native
  /**
    * The minimum length for a word to get hyphenated. Can't be less than 5.
    * @default 5
    */
  var minWordLength: js.UndefOr[Double] = js.native
}

object HyphenationOptions {
  @scala.inline
  def apply(): HyphenationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyphenationOptions]
  }
  @scala.inline
  implicit class HyphenationOptionsOps[Self <: HyphenationOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setHyphenChar(value: String): Self = this.set("hyphenChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphenChar: Self = this.set("hyphenChar", js.undefined)
    @scala.inline
    def setMinWordLength(value: Double): Self = this.set("minWordLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWordLength: Self = this.set("minWordLength", js.undefined)
  }
  
}

