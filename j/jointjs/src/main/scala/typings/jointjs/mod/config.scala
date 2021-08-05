package typings.jointjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("jointjs", "config")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "config.classNamePrefix")
  @js.native
  def classNamePrefix: String = js.native
  inline def classNamePrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNamePrefix")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "config.defaultTheme")
  @js.native
  def defaultTheme: String = js.native
  inline def defaultTheme_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "config.useCSSSelectors")
  @js.native
  def useCSSSelectors: Boolean = js.native
  inline def useCSSSelectors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCSSSelectors")(x.asInstanceOf[js.Any])
}
