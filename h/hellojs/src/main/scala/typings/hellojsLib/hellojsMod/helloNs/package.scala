package typings
package hellojsLib.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helloNs {
  type HelloJSDisplayType = hellojsLib.hellojsLibStrings.popup | hellojsLib.hellojsLibStrings.page | hellojsLib.hellojsLibStrings.none
  type HelloJSResponseCallback = js.Function2[/* r */ js.Any, /* headers */ js.Any, scala.Unit]
  type HelloJSTokenResponseType = hellojsLib.hellojsLibStrings.code | (hellojsLib.hellojsLibStrings.`code id_token`) | (hellojsLib.hellojsLibStrings.`code id_token token`) | (hellojsLib.hellojsLibStrings.`code token`) | hellojsLib.hellojsLibStrings.id_token | (hellojsLib.hellojsLibStrings.`id_token token`) | hellojsLib.hellojsLibStrings.none | hellojsLib.hellojsLibStrings.token
  type HelloJSUrlMappingFunction = js.Function2[
    /* p */ js.Any, 
    /* callback */ js.Function1[/* url */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
}
