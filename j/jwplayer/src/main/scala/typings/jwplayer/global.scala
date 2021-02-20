package typings.jwplayer

import org.scalablytyped.runtime.Shortcut
import typings.jwplayer.jwplayer.JWPlayerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jwplayer extends Shortcut {
    
    @JSGlobal("jwplayer")
    @js.native
    val ^ : JWPlayerStatic = js.native
    
    type _To = JWPlayerStatic
    
    /* This means you don't have to write `^`, but can instead just say `jwplayer.foo` */
    override def _to: JWPlayerStatic = ^
  }
}
