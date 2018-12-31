package typings
package jqueryDotFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFormOptions
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ JQueryFormOptions, scala.Boolean]] = js.undefined
  var beforeSubmit: js.UndefOr[
    js.Function3[
      /* formData */ js.Array[_], 
      /* $form */ JQuery, 
      /* options */ JQueryFormOptions, 
      scala.Boolean
    ]
  ] = js.undefined
  var clearForm: js.UndefOr[scala.Boolean] = js.undefined
  var forceSync: js.UndefOr[scala.Boolean] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var iframeSrc: js.UndefOr[java.lang.String] = js.undefined
  var iframeTarget: js.UndefOr[js.Any] = js.undefined
  var replaceTarget: js.UndefOr[scala.Boolean] = js.undefined
  var resetForm: js.UndefOr[scala.Boolean] = js.undefined
  var semantic: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ stdLib.ProgressEvent, 
      /* position */ scala.Double, 
      /* total */ scala.Double, 
      /* percentComplete */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
}

