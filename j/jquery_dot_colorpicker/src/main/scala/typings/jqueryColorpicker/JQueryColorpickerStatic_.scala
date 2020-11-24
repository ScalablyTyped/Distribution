package typings.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryColorpicker.JQueryColorpickerStatic.RGB
import typings.jqueryColorpicker.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryColorpickerStatic_ extends js.Object {
  
  var Color: Instantiable = js.native
  
  var limits: StringDictionary[js.Function1[/* color */ js.Any, Unit]] = js.native
  
  var parsers: StringDictionary[js.Function1[/* color */ js.Any, _]] = js.native
  
  var parts: StringDictionary[js.Function1[/* inst */ js.Any, _]] = js.native
  
  var partslists: StringDictionary[js.Array[String]] = js.native
  
  var regional: StringDictionary[String] = js.native
  
  var swatches: StringDictionary[StringDictionary[RGB]] = js.native
  
  var writers: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]] = js.native
}
object JQueryColorpickerStatic_ {
  
  @scala.inline
  def apply(
    Color: Instantiable,
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
  
  @scala.inline
  implicit class JQueryColorpickerStatic_Ops[Self <: JQueryColorpickerStatic_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: Instantiable): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimits(value: StringDictionary[js.Function1[/* color */ js.Any, Unit]]): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsers(value: StringDictionary[js.Function1[/* color */ js.Any, _]]): Self = this.set("parsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: StringDictionary[js.Function1[/* inst */ js.Any, _]]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartslists(value: StringDictionary[js.Array[String]]): Self = this.set("partslists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegional(value: StringDictionary[String]): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwatches(value: StringDictionary[StringDictionary[RGB]]): Self = this.set("swatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriters(value: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]): Self = this.set("writers", value.asInstanceOf[js.Any])
  }
}
