package typings.jestChangedFiles

import org.scalablytyped.runtime.Shortcut
import typings.jestChangedFiles.typesMod.SCMAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hgMod extends Shortcut {
  
  @JSImport("jest-changed-files/build/hg", JSImport.Default)
  @js.native
  val default: SCMAdapter = js.native
  
  type _To = SCMAdapter
  
  /* This means you don't have to write `default`, but can instead just say `hgMod.foo` */
  override def _to: SCMAdapter = default
}
