package typings.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitTranslationOptions extends js.Object {
  
  var d: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var h: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var m: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var mo: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var ms: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var s: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var w: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  
  var y: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
}
object UnitTranslationOptions {
  
  @scala.inline
  def apply(): UnitTranslationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitTranslationOptions]
  }
  
  @scala.inline
  implicit class UnitTranslationOptionsOps[Self <: UnitTranslationOptions] (val x: Self) extends AnyVal {
    
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
    def setD(value: /* count */ js.UndefOr[Double] => String): Self = this.set("d", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setH(value: /* count */ js.UndefOr[Double] => String): Self = this.set("h", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setM(value: /* count */ js.UndefOr[Double] => String): Self = this.set("m", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    
    @scala.inline
    def setMo(value: /* count */ js.UndefOr[Double] => String): Self = this.set("mo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMo: Self = this.set("mo", js.undefined)
    
    @scala.inline
    def setMs(value: /* count */ js.UndefOr[Double] => String): Self = this.set("ms", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
    
    @scala.inline
    def setS(value: /* count */ js.UndefOr[Double] => String): Self = this.set("s", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setW(value: /* count */ js.UndefOr[Double] => String): Self = this.set("w", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setY(value: /* count */ js.UndefOr[Double] => String): Self = this.set("y", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
