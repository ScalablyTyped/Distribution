package typings.hapiHoek.mod.clone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Shallow clone the specified keys.
    *
    * @default undefined
    */
  val shallow: js.UndefOr[(js.Array[js.Array[String] | String]) | Boolean] = js.native
  
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
    def setShallowVarargs(value: (js.Array[String] | String)*): Self = this.set("shallow", js.Array(value :_*))
    
    @scala.inline
    def setShallow(value: (js.Array[js.Array[String] | String]) | Boolean): Self = this.set("shallow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShallow: Self = this.set("shallow", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
}
