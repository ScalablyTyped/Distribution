package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[js.Function1[/* response */ hapiLib.hapiMod.ResponseObject, scala.Unit]] = js.undefined
  var marshal: js.UndefOr[
    js.Function1[
      /* response */ hapiLib.hapiMod.ResponseObject, 
      js.Promise[hapiLib.hapiMod.ResponseValue]
    ]
  ] = js.undefined
  var prepare: js.UndefOr[
    js.Function1[
      /* response */ hapiLib.hapiMod.ResponseObject, 
      js.Promise[hapiLib.hapiMod.ResponseObject]
    ]
  ] = js.undefined
  var variety: js.UndefOr[java.lang.String] = js.undefined
}

