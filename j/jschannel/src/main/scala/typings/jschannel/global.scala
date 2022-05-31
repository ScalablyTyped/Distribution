package typings.jschannel

import typings.jschannel.mod.ChannelConfiguration
import typings.jschannel.mod.MessagingChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Channel {
    
    @JSGlobal("Channel")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(config: ChannelConfiguration): MessagingChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(config.asInstanceOf[js.Any]).asInstanceOf[MessagingChannel]
  }
}
