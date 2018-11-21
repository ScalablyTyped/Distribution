package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IIntegrationAddOptions extends js.Object {
  var conflictHandler: js.UndefOr[
    js.Function2[
      /* f */ java.lang.String, 
      /* stats */ nodeLib.fsMod.Stats, 
      stdLib.Promise[scala.Boolean]
    ]
  ] = js.undefined
  var enableArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onFileCreate: js.UndefOr[js.Function1[/* f */ java.lang.String, scala.Unit]] = js.undefined
}

