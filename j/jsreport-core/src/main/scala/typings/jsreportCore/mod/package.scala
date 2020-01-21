package typings.jsreportCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Engine = typings.jsreportCore.jsreportCoreStrings.none
  type Extension = js.Function2[
    /* reporter */ typings.jsreportCore.mod.Reporter, 
    /* definition */ js.Object, 
    scala.Unit
  ]
  type Helpers = java.lang.String | (org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]])
  type Recipe = typings.jsreportCore.jsreportCoreStrings.html
}
