package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Extension extends js.Object {
  var base: js.UndefOr[Schema] = js.undefined
  var coerce: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
  var describe: js.UndefOr[js.ThisFunction1[/* this */ Schema, /* description */ Description, Description]] = js.undefined
  var language: js.UndefOr[LanguageOptions] = js.undefined
  var name: java.lang.String
  var pre: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
  var rules: js.UndefOr[js.Array[Rules[_]]] = js.undefined
}

