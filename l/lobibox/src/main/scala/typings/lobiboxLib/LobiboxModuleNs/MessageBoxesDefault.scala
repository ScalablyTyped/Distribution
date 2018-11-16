package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MessageBoxesDefault extends js.Object {
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  // when messagebox remove method is called but before it is actually hidden
  var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
  var buttonsAlign: js.UndefOr[java.lang.String] = js.undefined
    // Height is automatically given calculated by width
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
   // Position where buttons should be aligned
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  // after messagebox is hidden
  var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
    // Make messagebox draggable
  var customBtnClass: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
    // Close messagebox on Esc press
  var delayToRemove: js.UndefOr[scala.Double] = js.undefined
    // Show close button or not
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  // methods
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  var hideClass: js.UndefOr[java.lang.String] = js.undefined
  var horizontalOffset: js.UndefOr[scala.Double] = js.undefined
   // Class for custom buttons
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var msg: js.UndefOr[java.lang.String] = js.undefined
  // events
  // when messagebox show is called but before it is actually shown
  var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[scala.Double], this.type]] = js.undefined
  var setPosition: js.UndefOr[
    js.Function2[
      /* left */ js.UndefOr[scala.Double | java.lang.String], 
      /* top */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  var setSize: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[scala.Double], this.type]] = js.undefined
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  var showClass: js.UndefOr[java.lang.String] = js.undefined
  // after messagebox is shown
  var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

