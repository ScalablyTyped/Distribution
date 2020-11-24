package typings.hapiHoek.mod.deepEqual

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Compare functions with difference references by comparing their internal code and properties.
    *
    * @default false
    */
  val deepFunction: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow partial match.
    *
    * @default false
    */
  val part: js.UndefOr[Boolean] = js.native
  
  /**
    * List of object keys to ignore different values of.
    *
    * @default null
    */
  val skip: js.UndefOr[js.Array[String | js.Symbol]] = js.native
  
  /**
    * Compare symbol properties.
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
    def setDeepFunction(value: Boolean): Self = this.set("deepFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepFunction: Self = this.set("deepFunction", js.undefined)
    
    @scala.inline
    def setPart(value: Boolean): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setSkipVarargs(value: (String | js.Symbol)*): Self = this.set("skip", js.Array(value :_*))
    
    @scala.inline
    def setSkip(value: js.Array[String | js.Symbol]): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
}
