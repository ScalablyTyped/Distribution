package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic ANSI escape characters for terminal based operations.
  */
object ANSI_ESCAPE_CODES {
  
  @JSImport("listr2", "ANSI_ESCAPE_CODES")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("listr2", "ANSI_ESCAPE_CODES.CURSOR_HIDE")
  @js.native
  def CURSOR_HIDE: String = js.native
  inline def CURSOR_HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURSOR_HIDE")(x.asInstanceOf[js.Any])
  
  @JSImport("listr2", "ANSI_ESCAPE_CODES.CURSOR_SHOW")
  @js.native
  def CURSOR_SHOW: String = js.native
  inline def CURSOR_SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURSOR_SHOW")(x.asInstanceOf[js.Any])
}
