package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontWarnings extends js.Object {
  /*This object defines HTML snippets that are common to more than one message in the Message section above. They
    * can be included in other HTML snippets by by using ["name"] in an HTML snippet, where name refers to the name
    * of the snippet in the HTML block.
    * You can add your own pre-defined HTML snippets to this object, or override the ones that are there with your
    * own text.
    */
  var HTML: js.UndefOr[HTMLSnippets] = js.native
  /*This block contains HTML snippets to be used for the various messages that the FontWarning extension can
    * produce.
    * See the description of HTML snippets for details about how to describe the messages using HTML snippets. Note
    * that in addition to the usual rules for defining such snippets, the FontWarnings snippets can include
    * references to pre-defined snippets (that represent elements common to all three messages). These are defined
    * below in the HTML block, and are referenced using ["name"] within the snippet, where name is the name of one
    * of the snippets defined in the HTML configuration block
    */
  var Message: js.UndefOr[HTMLMessages] = js.native
  /*This is the number of steps to take while fading out the FontWarning message. More steps make for a smoother
    * fade-out. Set to zero to cause the message to be removed without fading.
    */
  var fadeoutSteps: js.UndefOr[Double] = js.native
  /*This is the time used to perform the fade-out, in milliseconds. The default is 1.5 seconds.*/
  var fadeoutTime: js.UndefOr[Double] = js.native
  /*This sets the CSS styles to be used for the font warning message window. See the extensions/FontWarnings.js
    * file for details of what are set by default. See the CSS style objects for details about how to specify CSS
    * styles via javascript objects.
    */
  var messageStyle: js.UndefOr[js.Any] = js.native
  /*This is the amount of time to show the FontWarning message, in milliseconds. The default is 12 seconds.
    * Setting this value to zero means that the message will not fade out (the user must close it manually).
    */
  var removeAfter: js.UndefOr[Double] = js.native
}

object FontWarnings {
  @scala.inline
  def apply(): FontWarnings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWarnings]
  }
  @scala.inline
  implicit class FontWarningsOps[Self <: FontWarnings] (val x: Self) extends AnyVal {
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
    def setHTML(value: HTMLSnippets): Self = this.set("HTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTML: Self = this.set("HTML", js.undefined)
    @scala.inline
    def setMessage(value: HTMLMessages): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setFadeoutSteps(value: Double): Self = this.set("fadeoutSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeoutSteps: Self = this.set("fadeoutSteps", js.undefined)
    @scala.inline
    def setFadeoutTime(value: Double): Self = this.set("fadeoutTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeoutTime: Self = this.set("fadeoutTime", js.undefined)
    @scala.inline
    def setMessageStyle(value: js.Any): Self = this.set("messageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageStyle: Self = this.set("messageStyle", js.undefined)
    @scala.inline
    def setRemoveAfter(value: Double): Self = this.set("removeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAfter: Self = this.set("removeAfter", js.undefined)
  }
  
}

