package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyDefault extends js.Object {
                    // Image source string
  var closable: js.UndefOr[scala.Boolean] = js.undefined
         // Show timer indicator
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
    // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
  var continueDelayOnInactiveTab: js.UndefOr[scala.Boolean] = js.undefined
               // Make notifications closable
  var delay: js.UndefOr[scala.Double] = js.undefined
                  // Hide notification after this time (in miliseconds)
  var delayIndicator: js.UndefOr[scala.Boolean] = js.undefined
          // Show animation class.
  var hideClass: js.UndefOr[java.lang.String] = js.undefined
         // Hide animation class.
  var icon: js.UndefOr[scala.Boolean] = js.undefined
                      // Message of notification
  var img: js.UndefOr[java.lang.String] = js.undefined
                   // Icon of notification. Leave as is for default icon or set custom string
  var msg: js.UndefOr[java.lang.String] = js.undefined
   // Continue delay when browser tab is inactive
  // Events
  var onClick: js.UndefOr[js.Function] = js.undefined
      // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
  var onClickUrl: js.UndefOr[java.lang.String] = js.undefined
                  // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
  var position: js.UndefOr[java.lang.String] = js.undefined
            // The url which will be opened when notification is clicked
  var showAfterPrevious: js.UndefOr[scala.Boolean] = js.undefined
             // Default extension for all sounds
  var showClass: js.UndefOr[java.lang.String] = js.undefined
                  // Title of notification. If you do not include the title in options it will automatically takes its value
  //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
  var size: js.UndefOr[java.lang.String] = js.undefined
                   // Width of notification box
  var sound: js.UndefOr[scala.Boolean] = js.undefined
     // The folder path where sounds are located
  var soundExt: js.UndefOr[java.lang.String] = js.undefined
               // normal, mini, large
  var soundPath: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
           // Close notifications by clicking on them
  var width: js.UndefOr[scala.Double] = js.undefined
}

