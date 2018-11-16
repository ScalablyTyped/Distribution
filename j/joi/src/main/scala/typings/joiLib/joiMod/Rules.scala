package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Rules[P /* <: js.Object */] extends js.Object {
  var description: js.UndefOr[java.lang.String | (js.Function1[/* params */ P, java.lang.String])] = js.undefined
  var name: java.lang.String
  var params: js.UndefOr[ObjectSchema | (joiLib.joiLibStrings.Rules with js.Any)] = js.undefined
  var setup: js.UndefOr[
    js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | scala.Unit]
  ] = js.undefined
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
}

