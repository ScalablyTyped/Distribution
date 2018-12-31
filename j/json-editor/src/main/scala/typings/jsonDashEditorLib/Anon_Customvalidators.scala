package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Customvalidators extends js.Object {
  var custom_validators: js.Array[
    js.Function3[
      /* schema */ _, 
      /* value */ java.lang.String, 
      /* path */ java.lang.String, 
      js.Array[JSONEditorError]
    ]
  ]
  var editors: Anon_Object
  var language: java.lang.String
  var languages: js.Any
  var options: JSONEditorOptions[_]
  var resolvers: js.Array[js.Function1[/* schema */ _, java.lang.String]]
}

