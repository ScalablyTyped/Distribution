package typings.isFullwidthCodePoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-fullwidth-code-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(codePoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
