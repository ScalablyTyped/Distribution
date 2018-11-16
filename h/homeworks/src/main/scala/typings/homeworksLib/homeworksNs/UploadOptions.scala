package typings
package homeworksLib.homeworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @since 1.0.0
     */

trait UploadOptions extends js.Object {
  var beforeStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var complete: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dest: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* xhr */ js.UndefOr[js.Any], 
      /* state */ js.UndefOr[js.Any], 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var isBtn: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* state */ js.UndefOr[js.Any], 
      /* xhr */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

