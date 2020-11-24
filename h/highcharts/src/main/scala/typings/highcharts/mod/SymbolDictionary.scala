package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolDictionary
  extends /* key */ StringDictionary[js.UndefOr[js.Function]] {
  
  var arc: js.UndefOr[js.Function] = js.native
  
  var callout: js.UndefOr[js.Function] = js.native
  
  var circle: js.UndefOr[js.Function] = js.native
  
  var diamond: js.UndefOr[js.Function] = js.native
  
  var square: js.UndefOr[js.Function] = js.native
  
  var triangle: js.UndefOr[js.Function] = js.native
}
object SymbolDictionary {
  
  @scala.inline
  def apply(): SymbolDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolDictionary]
  }
  
  @scala.inline
  implicit class SymbolDictionaryOps[Self <: SymbolDictionary] (val x: Self) extends AnyVal {
    
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
    def setArc(value: js.Function): Self = this.set("arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArc: Self = this.set("arc", js.undefined)
    
    @scala.inline
    def setCallout(value: js.Function): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    
    @scala.inline
    def setCircle(value: js.Function): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setDiamond(value: js.Function): Self = this.set("diamond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiamond: Self = this.set("diamond", js.undefined)
    
    @scala.inline
    def setSquare(value: js.Function): Self = this.set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
    
    @scala.inline
    def setTriangle(value: js.Function): Self = this.set("triangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangle: Self = this.set("triangle", js.undefined)
  }
}
