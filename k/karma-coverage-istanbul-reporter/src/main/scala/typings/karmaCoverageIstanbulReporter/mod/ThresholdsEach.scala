package typings.karmaCoverageIstanbulReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThresholdsEach extends Threshold {
  
  /** @default {} */
  val overrides: js.UndefOr[StringDictionary[Threshold]] = js.native
}
object ThresholdsEach {
  
  @scala.inline
  def apply(): ThresholdsEach = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdsEach]
  }
  
  @scala.inline
  implicit class ThresholdsEachOps[Self <: ThresholdsEach] (val x: Self) extends AnyVal {
    
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
    def setOverrides(value: StringDictionary[Threshold]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
