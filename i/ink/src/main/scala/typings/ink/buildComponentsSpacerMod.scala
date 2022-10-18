package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsSpacerMod extends Shortcut {
  
  /**
    * A flexible space that expands along the major axis of its containing layout.
    * It's useful as a shortcut for filling all the available spaces between elements.
    */
  @JSImport("ink/build/components/Spacer", JSImport.Default)
  @js.native
  val default: FC[js.Object] = js.native
  
  type _To = FC[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsSpacerMod.foo` */
  override def _to: FC[js.Object] = default
}
