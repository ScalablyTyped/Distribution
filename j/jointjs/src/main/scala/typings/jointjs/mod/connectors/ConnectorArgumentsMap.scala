package typings.jointjs.mod.connectors

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  
  var jumpover: JumpOverConnectorArguments = js.native
  
  var normal: NormalConnectorArguments = js.native
  
  var rounded: RoundedConnectorArguments = js.native
  
  var smooth: SmoothConnectorArguments = js.native
}
object ConnectorArgumentsMap {
  
  @scala.inline
  def apply(
    jumpover: JumpOverConnectorArguments,
    normal: NormalConnectorArguments,
    rounded: RoundedConnectorArguments,
    smooth: SmoothConnectorArguments
  ): ConnectorArgumentsMap = {
    val __obj = js.Dynamic.literal(jumpover = jumpover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorArgumentsMap]
  }
  
  @scala.inline
  implicit class ConnectorArgumentsMapOps[Self <: ConnectorArgumentsMap] (val x: Self) extends AnyVal {
    
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
    def setJumpover(value: JumpOverConnectorArguments): Self = this.set("jumpover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: NormalConnectorArguments): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRounded(value: RoundedConnectorArguments): Self = this.set("rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmooth(value: SmoothConnectorArguments): Self = this.set("smooth", value.asInstanceOf[js.Any])
  }
}
