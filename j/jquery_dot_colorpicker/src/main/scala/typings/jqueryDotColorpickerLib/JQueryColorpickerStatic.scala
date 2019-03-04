package typings
package jqueryDotColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryColorpickerStatic extends js.Object {
  var Color: Anon_A
  var limits: org.scalablytyped.runtime.StringDictionary[js.Function1[/* color */ js.Any, scala.Unit]]
  var parsers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* color */ js.Any, _]]
  var parts: org.scalablytyped.runtime.StringDictionary[js.Function1[/* inst */ js.Any, _]]
  var partslists: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var regional: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var swatches: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[jqueryDotColorpickerLib.JQueryColorpickerStaticNs.RGB]
  ]
  var writers: org.scalablytyped.runtime.StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]
}

object JQueryColorpickerStatic {
  @scala.inline
  def apply(
    Color: Anon_A,
    limits: org.scalablytyped.runtime.StringDictionary[js.Function1[/* color */ js.Any, scala.Unit]],
    parsers: org.scalablytyped.runtime.StringDictionary[js.Function1[/* color */ js.Any, _]],
    parts: org.scalablytyped.runtime.StringDictionary[js.Function1[/* inst */ js.Any, _]],
    partslists: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    regional: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    swatches: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[jqueryDotColorpickerLib.JQueryColorpickerStaticNs.RGB]
    ],
    writers: org.scalablytyped.runtime.StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]
  ): JQueryColorpickerStatic = {
    val __obj = js.Dynamic.literal(Color = Color, limits = limits, parsers = parsers, parts = parts, partslists = partslists, regional = regional, swatches = swatches, writers = writers)
  
    __obj.asInstanceOf[JQueryColorpickerStatic]
  }
}

