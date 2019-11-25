package typings.jqueryDotColorpicker

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryDotColorpicker.JQueryColorpickerStatic.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("JQueryColorpickerStatic")
trait JQueryColorpickerStatic_ extends js.Object {
  var Color: Anon_A
  var limits: StringDictionary[js.Function1[/* color */ js.Any, Unit]]
  var parsers: StringDictionary[js.Function1[/* color */ js.Any, _]]
  var parts: StringDictionary[js.Function1[/* inst */ js.Any, _]]
  var partslists: StringDictionary[js.Array[String]]
  var regional: StringDictionary[String]
  var swatches: StringDictionary[StringDictionary[RGB]]
  var writers: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]
}

object JQueryColorpickerStatic_ {
  @scala.inline
  def apply(
    Color: Anon_A,
    limits: StringDictionary[js.Function1[/* color */ js.Any, Unit]],
    parsers: StringDictionary[js.Function1[/* color */ js.Any, _]],
    parts: StringDictionary[js.Function1[/* inst */ js.Any, _]],
    partslists: StringDictionary[js.Array[String]],
    regional: StringDictionary[String],
    swatches: StringDictionary[StringDictionary[RGB]],
    writers: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]
  ): JQueryColorpickerStatic_ = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], partslists = partslists.asInstanceOf[js.Any], regional = regional.asInstanceOf[js.Any], swatches = swatches.asInstanceOf[js.Any], writers = writers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryColorpickerStatic_]
  }
}

