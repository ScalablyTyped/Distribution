package typings.hyphen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the hyphenation factory function.
  */
@js.native
trait FactoryOptions extends js.Object {
  /**
    * If true the factory returns an asynchronous hyphenation function.
    * @default false
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating, if the hyphenation function should output debug info to the console.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If true the hyphenation function is going to ignore HTML tags in the text.
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.native
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

object FactoryOptions {
  @scala.inline
  def apply(): FactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FactoryOptions]
  }
  @scala.inline
  implicit class FactoryOptionsOps[Self <: FactoryOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
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

