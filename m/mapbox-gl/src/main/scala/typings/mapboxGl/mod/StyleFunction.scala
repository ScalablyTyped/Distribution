package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.categorical
import typings.mapboxGl.mapboxGlStrings.exponential
import typings.mapboxGl.mapboxGlStrings.hcl
import typings.mapboxGl.mapboxGlStrings.identity
import typings.mapboxGl.mapboxGlStrings.interval
import typings.mapboxGl.mapboxGlStrings.lab
import typings.mapboxGl.mapboxGlStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleFunction extends js.Object {
  
  var base: js.UndefOr[Double] = js.native
  
  var colorSpace: js.UndefOr[rgb | lab | hcl] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var stops: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  var `type`: js.UndefOr[identity | exponential | interval | categorical] = js.native
}
object StyleFunction {
  
  @scala.inline
  def apply(): StyleFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleFunction]
  }
  
  @scala.inline
  implicit class StyleFunctionOps[Self <: StyleFunction] (val x: Self) extends AnyVal {
    
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
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setColorSpace(value: rgb | lab | hcl): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpace: Self = this.set("colorSpace", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: js.Array[js.Any]*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[js.Array[_]]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
    @scala.inline
    def setType(value: identity | exponential | interval | categorical): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
