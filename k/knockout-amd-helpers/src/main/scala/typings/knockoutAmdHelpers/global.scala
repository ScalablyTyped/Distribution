package typings.knockoutAmdHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ko")
  @js.native
  def ko: KnockoutStatic = js.native
  @scala.inline
  def ko_=(x: KnockoutStatic): Unit = js.Dynamic.global.updateDynamic("ko")(x.asInstanceOf[js.Any])
}
