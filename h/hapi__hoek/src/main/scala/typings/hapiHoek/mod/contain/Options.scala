package typings.hapiHoek.mod.contain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Perform a deep comparison.
    *
    * @default false
    */
  val deep: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow only one occurrence of each value.
    *
    * @default false
    */
  val once: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow only values explicitly listed.
    *
    * @default false
    */
  val only: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow partial match.
    *
    * @default false
    */
  val part: js.UndefOr[Boolean] = js.native
  
  /**
    * Include symbol properties.
    *
    * @default true
    */
  val symbols: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    
    @scala.inline
    def setPart(value: Boolean): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
}
