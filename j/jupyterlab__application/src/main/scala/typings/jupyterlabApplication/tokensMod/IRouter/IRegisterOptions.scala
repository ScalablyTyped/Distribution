package typings.jupyterlabApplication.tokensMod.IRouter

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification for registering a route with the router.
  */
@js.native
trait IRegisterOptions extends js.Object {
  
  /**
    * The command string that will be invoked upon matching.
    */
  var command: String = js.native
  
  /**
    * The regular expression that will be matched against URLs.
    */
  var pattern: RegExp = js.native
  
  /**
    * The rank order of the registered rule. A lower rank denotes a higher
    * priority. The default rank is `100`.
    */
  var rank: js.UndefOr[Double] = js.native
}
object IRegisterOptions {
  
  @scala.inline
  def apply(command: String, pattern: RegExp): IRegisterOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisterOptions]
  }
  
  @scala.inline
  implicit class IRegisterOptionsOps[Self <: IRegisterOptions] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
