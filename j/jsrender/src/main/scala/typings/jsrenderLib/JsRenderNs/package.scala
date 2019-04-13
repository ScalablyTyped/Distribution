package typings
package jsrenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JsRenderNs {
  type NamedTemplate = js.Function1[/* data */ js.UndefOr[js.Any], java.lang.String]
  type Render = js.Function2[
    /* data */ js.UndefOr[js.Any], 
    /* helpersOrContext */ js.UndefOr[js.Any], 
    java.lang.String
  ]
  type RenderStatic = org.scalablytyped.runtime.StringDictionary[NamedTemplate]
}
