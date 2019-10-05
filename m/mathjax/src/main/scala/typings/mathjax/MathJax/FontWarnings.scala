package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontWarnings extends js.Object {
  /*This object defines HTML snippets that are common to more than one message in the Message section above. They
    * can be included in other HTML snippets by by using ["name"] in an HTML snippet, where name refers to the name
    * of the snippet in the HTML block.
    * You can add your own pre-defined HTML snippets to this object, or override the ones that are there with your
    * own text.
    */
  var HTML: js.UndefOr[HTMLSnippets] = js.undefined
  /*This block contains HTML snippets to be used for the various messages that the FontWarning extension can
    * produce.
    * See the description of HTML snippets for details about how to describe the messages using HTML snippets. Note
    * that in addition to the usual rules for defining such snippets, the FontWarnings snippets can include
    * references to pre-defined snippets (that represent elements common to all three messages). These are defined
    * below in the HTML block, and are referenced using ["name"] within the snippet, where name is the name of one
    * of the snippets defined in the HTML configuration block
    */
  var Message: js.UndefOr[HTMLMessages] = js.undefined
  /*This is the number of steps to take while fading out the FontWarning message. More steps make for a smoother
    * fade-out. Set to zero to cause the message to be removed without fading.
    */
  var fadeoutSteps: js.UndefOr[Double] = js.undefined
  /*This is the time used to perform the fade-out, in milliseconds. The default is 1.5 seconds.*/
  var fadeoutTime: js.UndefOr[Double] = js.undefined
  /*This sets the CSS styles to be used for the font warning message window. See the extensions/FontWarnings.js
    * file for details of what are set by default. See the CSS style objects for details about how to specify CSS
    * styles via javascript objects.
    */
  var messageStyle: js.UndefOr[js.Any] = js.undefined
  /*This is the amount of time to show the FontWarning message, in milliseconds. The default is 12 seconds.
    * Setting this value to zero means that the message will not fade out (the user must close it manually).
    */
  var removeAfter: js.UndefOr[Double] = js.undefined
}

object FontWarnings {
  @scala.inline
  def apply(
    HTML: HTMLSnippets = null,
    Message: HTMLMessages = null,
    fadeoutSteps: Int | Double = null,
    fadeoutTime: Int | Double = null,
    messageStyle: js.Any = null,
    removeAfter: Int | Double = null
  ): FontWarnings = {
    val __obj = js.Dynamic.literal()
    if (HTML != null) __obj.updateDynamic("HTML")(HTML)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (fadeoutSteps != null) __obj.updateDynamic("fadeoutSteps")(fadeoutSteps.asInstanceOf[js.Any])
    if (fadeoutTime != null) __obj.updateDynamic("fadeoutTime")(fadeoutTime.asInstanceOf[js.Any])
    if (messageStyle != null) __obj.updateDynamic("messageStyle")(messageStyle)
    if (removeAfter != null) __obj.updateDynamic("removeAfter")(removeAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWarnings]
  }
}

