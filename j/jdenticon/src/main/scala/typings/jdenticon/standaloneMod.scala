package typings.jdenticon

import org.scalablytyped.runtime.Shortcut
import typings.jdenticon.typesUmdMod.global.Jdenticon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object standaloneMod extends Shortcut {
  
  @JSImport("jdenticon/standalone", JSImport.Namespace)
  @js.native
  val ^ : Jdenticon = js.native
  
  type _To = Jdenticon
  
  /* This means you don't have to write `^`, but can instead just say `standaloneMod.foo` */
  override def _to: Jdenticon = ^
}
